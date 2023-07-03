package javapro.classEx2;

public class AEx01 {

	public static void main(String[] args) {
		A a=new A();	//A 인스턴스 객체 생성
		a.filedA1=20;
		A.B b=a.new B();	//B 인스턴스 객체 생성

	}

}
