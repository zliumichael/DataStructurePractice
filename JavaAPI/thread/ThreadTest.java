package thread;

public class ThreadTest {

	public static void main(String[] args) throws InterruptedException {
		ThreadDemo thread1 = new ThreadDemo();
		Thread t = new Thread(thread1,"thread1");
		t.start();
		
		ThreadDemo2 thread2 = new ThreadDemo2();
		thread2.setName("Thread2");
		thread2.start();
		System.out.println(thread2.isAlive());
		Thread.sleep(1000);
		thread1.setStop(true);
		thread2.setStop(true);
		Thread.sleep(100);
		System.out.println(thread2.isAlive());
		
	}
	
	static class ThreadDemo2 extends Thread{
		
		private boolean stop=false;
		
		public boolean isStop() {
			return stop;
		}

		public void setStop(boolean stop) {
			this.stop = stop;
		}
		
		public void run(){
			while(!stop){
				//System.out.println(Thread.currentThread().getName());
				//System.out.println("Do Something...");
			}
		}
	}
}
