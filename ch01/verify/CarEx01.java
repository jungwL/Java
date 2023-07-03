package ch01.verify;

public class CarEx01 {

	public static void main(String[] args) {
		Car myCar=new Car("소나타", "흰색", 250);
		myCar.speedChange(100);
		carRun(myCar);
		myCar.stop();
		carRun(myCar);
		Car gCar=new Car("그렌저", "검정", 280);
		gCar.speedChange(300);
		carRun(gCar);
		gCar.stop();
		carRun(gCar);

	}
	public static void carRun(Car obj) {
		if(obj.speed!=0) {
			System.out.println(obj.name+"를 타고 "+obj.speed+"km로 달립니다.");
		} else {
			System.out.println(obj.name+"를 정지합니다.");
		}
	}

}
