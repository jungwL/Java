package javapro.operator;

public class OperatorEx13 {

	public static void main(String[] args) {
		double num1=5.0;
		double num2=0.0;
		double rs=num1/num2;
		if(Double.isInfinite(rs)) {
			System.out.println("0으로 나누면 안됩니다.");
		} else {
			System.out.println(rs);
		}
		
	}
	
}