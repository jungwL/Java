package javapro.thread;

public class CalculatorEx01 {

	public static void main(String[] args) {
		Calculator calculator=new Calculator();
		
		UserThread1 user1=new UserThread1();
		user1.setCalculator(calculator);
		user1.start();
		
		UserThread2 user2=new UserThread2();
		user2.setCalculator(calculator);
		user2.start();		//하나의 클래스를 같이 생성하고 사용->둘 다 50

	}

}
