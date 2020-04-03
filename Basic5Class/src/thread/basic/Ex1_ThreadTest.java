package thread.basic;

public class Ex1_ThreadTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MakeCar1 work1 = new MakeCar1("차틀만들기");
		work1.start();
		MakeCar1 work2 =new MakeCar1("엔진부착");
		work2.start();

	}

}

class MakeCar1 extends Thread{
	String work;

	MakeCar1(String _work){
		work = _work;
	}

	public void run() {

		for(int i=0;i<4;i++) {
			System.out.println(work+"작업중");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
			}

		}
	}

}