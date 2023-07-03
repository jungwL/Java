package javapro.thread;

public class AutoSaveThreadEx01 {

	public static void main(String[] args) {
		AutoSaveThread autoSave=new AutoSaveThread();
		autoSave.setDaemon(true);	//main 스레드 끝나면 종료됨
		autoSave.start();
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		int sum=0;
		for(int i=0; i<=100; i++) {
			sum+=i;
		}
		System.out.println("1부터 100까지 합="+sum);

	}

}
