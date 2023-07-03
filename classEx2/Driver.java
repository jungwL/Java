package javapro.classEx2;

public class Driver {
	
	void drive(Vehicle vehicle) {		//vehicle이 bus와 taxi의 부모 클래스이기 때문에 매개변수로 받을 수 있음
		vehicle.run();
	}
}
