package javapro.thread;

public class SumThreadEx01 {

	public static void main(String[] args) {
		SumThread sumt=new SumThread();
		sumt.start();
		
		try {
			sumt.join();	//이 스레드의 일이 끝날 때까지 다른 스레드를 일시 정지, 우선 처리
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("1부터 100까지 합="+sumt.getSum());

	}

}
