package ch01.verify;

public class Taxi extends Car{
	int baseCharge;	//기본요금
	int charge;		//속도당 요금
	boolean fare;	//할증 여부(true, false)
	static String company="우리은수";	//택시회사이름(우리은수, 정적필드)
	
	public Taxi(int baseCharge, int charge) {
		this.baseCharge=baseCharge;
		this.charge=charge;
	}
	
	public void setFare(boolean fare) {
		this.fare = fare;
	}
	
	//요금계산
	int accounts() {
		int total=0;
		if(fare) {
			total=(int)(baseCharge+speed*charge*1.5);
		} else {
			total=baseCharge+speed*charge;
		}
		return total;
	}
	
}
