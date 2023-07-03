package javapro.operator;

public class OperatorEx07 {

	public static void main(String[] args) {
		int num1=10;
		int num2=0;
		try {
			int rs=num1/num2;
			System.out.println("결과="+rs);			
		}
		catch (ArithmeticException e) {		// try에서 예외가 발생하지 않으면 수행하지 않음
			System.out.println(e.getMessage());
		}
	}
	
}
