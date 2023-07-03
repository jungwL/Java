package javapro.thread;

public class ThreadEx02 {

	public static void main(String[] args) {
		Thread thread=new WorkerThread();
		thread.start();
		
		for(int i=1; i<=5; i++) {	//메인메소드 스레드
			System.out.println("띵");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

	}

}
