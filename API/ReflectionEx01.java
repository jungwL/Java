package javapro.API;

public class ReflectionEx01 {

	public static void main(String[] args) {
		Class carInfo=Car.class;	//Car의 메타정보를 carInfo로 읽어옴
		System.out.println(carInfo.getPackageName());
		System.out.println(carInfo.getSimpleName());	//클래스 이름
		System.out.println(carInfo.getName());

	}

}
