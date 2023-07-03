package javapro.thread;

public class ThreadEx04 {

	public static void main(String[] args) {
		Thread cthread=Thread.currentThread();	//현재 돌아가는 스레드 정보 가져옴
		System.out.println(cthread.getName()+"스레드 실행");
		
		for(int i=0; i<3; i++) {
			Thread threadA=new Thread() {	//threadA-스레드 인스턴스 변수 이름
				@Override
				public void run() {
					System.out.println(getName()+"스레드 실행");
				}
			};
			threadA.setName("myThread-"+i);	//스레드 이름 설정
			threadA.start();	//스레드는 항상 start()해줘야함
		}

	}

}
