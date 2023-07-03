package javapro.interfaceEx;

public class BusEx01 {

	public static void main(String[] args) {
		Vehicle vehicle=new Bus();
		vehicle.run();
		Bus bus=(Bus)vehicle;	//강제 타입 변환, 자식=부모
		bus.run();
		bus.checkFare();

	}

}
