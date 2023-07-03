package javaproject;

public class Taxi extends Car{
	int charge;		//택시 요금
	boolean fare;	//할증
	String company;	//택시 회사이름
	
	//생성자
	public Taxi(String company) {
		this.company=company;
	}
	
	public void accounts() {	//요금계산
		if(fare == true) {		//if(fare)
			charge=speed*12;
		} else {
			charge=speed*10;
		}
	}

	public void setFare(boolean fare) {	//할증 여부
		this.fare = fare;
	}
	
}
