package thread.basic;

class Bread 
{
	String bread;

	//##  	
	boolean isCheck;
	public void setBread( String bread )
	{
		this.bread = bread;
		//## 		
		isCheck = true;
		synchronized(bread) {
			notifyAll(); //wait와 세트 멈춘 작업을 다시 시작하게 만든다
		}
	}	

	public String getBread()
	{
		//## 		
		if(!isCheck) {
			try {
				synchronized(bread) {
					wait(); //
				}
			} catch (InterruptedException e) {
			}
		}
		return bread;
	}
}

class Baker extends Thread
{
	Bread bbang;

	Baker( Bread bbang )
	{
		this.bbang = bbang;
	}
	public void run()
	{
		bbang.setBread("진열된 완성된 맛있는 빵");
	}
}

class Customer extends Thread
{
	Bread bbang;

	Customer( Bread bbang )
	{
		this.bbang = bbang;
	}
	public void run()
	{
		System.out.println("빵을 사감 : " + bbang.getBread());
	}
}

class Ex8_BreadTest
{
	public static void main(String[] args) 
	{
		Bread  bread = new Bread();

		Baker  baker = new Baker( bread );
		Customer customer = new Customer( bread );
		customer.start();
		baker.start();

		try{
			customer.join();
			baker.join();			
		}catch( Exception ex ){}

	}
}
