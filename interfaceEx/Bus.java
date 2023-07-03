package javapro.interfaceEx;

public class Bus implements Vehicle {

	@Override
	public void run() {
		System.out.println("Bus가 달립니다.");
		
	}
	
	public void checkFare() {
		System.out.println("승차요금 체크");
	}

}
