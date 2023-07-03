package javapro.interfaceEx;

public class Driver {
	void drive(Vehicle vehicle) {
		vehicle.run();
		if(vehicle instanceof Bus) {	//객체 타입 확인
			Bus bus=(Bus)vehicle;	//강제 타입 변환
			bus.checkFare();
		}
		if(vehicle instanceof Truck) {
			Truck truck=(Truck)vehicle;
			truck.loadUp();
		}
		/*
		 * if(vehicle instanceof Bus bus) {
		 * 	    bus.checkFare(); 
		 * }
		 */
	
	}
}
