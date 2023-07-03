package javapro.variable;

public class VariableEx12 {

	public static void main(String[] args) {
		int num1=50;
		int num2=0;		// 초기값
		if(num1>=20) {	// num2가 20보다 작을 경우 if문을 수행하지 않음
			num2=30;
		}
		//System.out.println(num1);
		System.out.println(num1+num2);	// num2값 할당되지 않음 - 오류
	}

}
