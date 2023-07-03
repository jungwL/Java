package javapro.variable;

public class VariableEx10 {

	public static void main(String[] args) {
		byte num1=10+20;		// 컴파일 단계에서 미리 연산하고 결과를 변수에 넣어주기 때문에 오류가 나지 않음.
		System.out.println(num1);
		
		int value=1+2+3;		// 3번 연산. 1)1+2 2)3+3 3)value=6
		System.out.println(value);
		
		String str=1+2+"3";		//1)1+2 2)3문자화 ->33 3)str="33"
		String str2=1+"2"+3;	//1)1문자화-"12" 2)3문자화-"123" 3)str="123"
		System.out.println(str);
		System.out.println(str2);
		
	}

}
