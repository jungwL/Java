package javapro.classEx2.confirm2;

public class AnonymousEx01 {

	public static void main(String[] args) {
		Anonymous anony=new Anonymous();
		anony.filed.run();
		anony.method1();
		anony.method2(new Vehicle() {
			
			@Override
			public void run() {
				System.out.println("트럭이 달립니다.");
				
			}
		});

	}

}
