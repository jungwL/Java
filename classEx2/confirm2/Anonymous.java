package javapro.classEx2.confirm2;

public class Anonymous {
	//인터페이스를 필드로 사용
	Vehicle filed=new Vehicle() {
		@Override
		public void run() {
			System.out.println("자전거가 달립니다.");
		}
	};
	//로컬 변수로 사용
	void method1() {
		Vehicle localVar=new Vehicle() {
			@Override
			public void run() {
				System.out.println("승용차가 달립니다.");
			}
		};
		
		localVar.run();
	}
	//메소드의 매개변수로 사용
	void method2(Vehicle v) {
		v.run();
	}

}
