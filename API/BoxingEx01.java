package javapro.API;

public class BoxingEx01 {

	public static void main(String[] args) {
		int num1=10;
		System.out.println(num1);
		//박싱
		Integer obj2=20;	//obj2가 가지고 있는 메모리 주소에 20이 들어있음.
		System.out.println(obj2.intValue());
		//언박싱
		int value=obj2;		//자동적으로 obj2의 주소의 값을 넘겨줌
		System.out.println(value);
		int rs=obj2+30;		//언박싱한 후 30을 더함->연산 시에도 자동으로 언박싱됨
		System.out.println(rs);
		int num2=50;
		int num3=50;
		if(num2==num3) {
			System.out.println("같음");	//값이 같음
		} else {
			System.out.println("다름");
		}
		
		Integer num4=50;
		Integer num5=50;
		if(num4==num5) {
			System.out.println("같음");	//같은 주소를 참조하고 있음. new로 객체를 생성할 경우 다름.
		} else {
			System.out.println("다름");
		}

	}

}
