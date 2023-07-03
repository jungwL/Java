package javapro.thread;

public class WorkObjectEx01 {

	public static void main(String[] args) {
		WorkObject workObject=new WorkObject();
		
		ThreadA thA=new ThreadA(workObject);
		ThreadB thB=new ThreadB(workObject);
		thA.start();
		thB.start();

	}

}
