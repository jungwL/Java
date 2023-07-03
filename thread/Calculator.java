package javapro.thread;

public class Calculator {
	private int memory;

	public int getMemory() {
		return memory;
	}

	public synchronized void setMemory1(int memory) {	//100이 전달되면서 synchronized에 의해 객체 메소드가 잠김.
		this.memory = memory;
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName()+"=>"+this.memory);
	}//잠금 해제
	
	public void setMemory2(int memory) {	
		synchronized (this) {				//일부 영역만 잠김. 메소드가 끝나면 해제됨	/ 같은 객체를 공유할 때 사용
			this.memory = memory;
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName()+"=>"+this.memory);
		}
	}
	
}
