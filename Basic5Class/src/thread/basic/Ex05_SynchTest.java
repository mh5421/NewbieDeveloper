package thread.basic;

class Count{
	int i ;
	void increment() {
		synchronized(this) {
			i++;
		}
	}
}

	class ThreadCount extends Thread{
		Count cnt;

		ThreadCount(Count cnt){
			this.cnt = cnt;

		}
		public void run() {
			for(int i=0;i<100000000;i++) {
				cnt.increment();
			}

		}
	}

	public class Ex05_SynchTest {

		public static void main(String[] args) {
			Count cnt = new Count();
			ThreadCount tc1 = new ThreadCount(cnt);
			tc1.start();
			ThreadCount tc2 = new ThreadCount(cnt);
			tc2.start();
			try {
				tc1.join();
				tc2.join();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}



			System.out.println("1의 결과: "+cnt.i);
		}

	}
