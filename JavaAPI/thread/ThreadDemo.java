package thread;

public class ThreadDemo implements Runnable {

	private boolean stop=false;
	
	public boolean isStop() {
		return stop;
	}

	public void setStop(boolean stop) {
		this.stop = stop;
	}

	@Override
	public void run() {
		while(!stop){
			//System.out.println(Thread.currentThread().getName());
			//System.out.println("Do Something...");
		}

	}

}
