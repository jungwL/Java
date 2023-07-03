package javaproject;

public class Car {
	int speed;		//자동차 속도
	String name;	//자동차 이름
	
	//생성자
	public Car() {

	}
	
	public Car(String name) {
		this.name=name;
	}
	
	public void speedUp() {	//속도 1증가
		speed+=1;	//speed++;
	}
	
	public void speedDown() {	//속도 1감소
		speed-=1;	//speed--;
	}
	
	public void stop() {	//속도 0 설정
		speed=0;
	}
	
	public void display() {
		System.out.println("자동차 이름 : "+name);
		System.out.println("속도 = "+speed);
	}
}
