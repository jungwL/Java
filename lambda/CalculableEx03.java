package javapro.lambda;

public class CalculableEx03 {

	public static void main(String[] args) {
		Calculable cal;
		cal=(x,y)->{
			System.out.println("두 수의 합="+(x+y));
		};
		cal.calculate(20, 35);
		
		cal=(x,y)->{
			System.out.println("두 수의 차="+(x-y));
		};
		cal.calculate(30, 11);
	}

}
