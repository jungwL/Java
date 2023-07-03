package javaproject;

public class CarEx {

	public static void main(String[] args) {
		Taxi taxi=new Taxi("서울택시");	//객체 생성
		
		taxi.setFare(true);		//할증 여부 설정
		
		taxi.speedUp();		//속도 증가
		taxi.speedUp();		//속도 증가
		
		taxi.accounts();	//요금 계산
		
		//printTaxi(taxi);
		System.out.println("택시회사 이름: "+taxi.company);
		System.out.println("요금: "+taxi.charge);
		System.out.println("할증 여부: "+taxi.fare);
		
	}
	/*
	static void printTaxi(Taxi obj) {
		System.out.println("택시회사 이름: "+obj.company);
		System.out.println("요금: "+obj.charge);
		if(obj.fare) {
			System.out.println("할증여부 : 할증");
		} else {
			System.out.println("할증여부 : 아님");
		}
	}
	*/

}
