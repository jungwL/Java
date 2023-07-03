//1.5 chap09 s
package javapro.classEx2;

public class A {
	int filedA1;		//인스턴스 필드
	static int filedA2;	//정적 필드
	
	public A() {
		System.out.println("클래스 A의 생성자");
	}
	
	class B {	//인스턴스 내부 클래스, A 클래스를 생성해야지만 B 클래스를 생성할 수 있음.
		int filedB1=20;
		
		public B() {
			System.out.println("내부 클래스 B의 생성자");
		}
		//메소드
		void methodB1() {
			System.out.println("내부 클래스 B의 메소드");
			filedA1=10;	//외부 클래스의 인스턴스 필드에 접근할 수 있음
			methodA1();	//외부 클래스의 메소드에 접근할 수 있음
			filedA2=20;
			methodA2();	//외부 클래스의 정적 메소드에 접근 가능
		}
	}
	
	//정적 내부 클래스
	static class C {
		int filedC1=30;
		
		void methodC1() {
			//filedA1=10;   외부 클래스의 인스턴스 필드, 메소드 접근 불가능 -> 정적 클래스에서는 정적 필드, 메소드만 사용할 수 있음
			filedA2=30;		//외부 클래스의 정적 필드, 메소드 접근 가능
			methodA2();
		}
	}
	
	//메소드
	void methodA1() {
		System.out.println("클래스 A의 메소드");
		//filedB1 외부 클래스에서 내부 클래스의 필드에 접근할 수 없음
		B b=new B();	//인스턴스 b클래스 객체 생성
		b.methodB1();
	}
	//정적 메소드
	static void methodA2() {
		System.out.println("클래스 A의 정적 메소드");
	}
}
