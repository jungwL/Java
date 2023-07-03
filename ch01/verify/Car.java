package ch01.verify;

public class Car {
	String name;
	String color;
	int speed;
	int maxSpeed=250;
	
	public Car(String name, String color, int maxSpeed) {
		this.name=name;
		this.color=color;
		this.maxSpeed=maxSpeed;
	}
	
	public Car() {
		
	}
	
	void speedChange(int speed) {
		if(speed>maxSpeed) {
			this.speed=maxSpeed;
		} else {
			this.speed=speed;
		}
	}
	
	void stop() {
		speed=0;
	}
	
}
