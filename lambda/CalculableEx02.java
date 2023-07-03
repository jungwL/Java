package javapro.lambda;

public class CalculableEx02 {

	public static void main(String[] args) {
		Calculable cal=new Calculable() {
			
			@Override
			public void calculate(int x, int y) {
				System.out.println("두 수의 합="+(x+y));
			}
		};
		
		cal.calculate(10, 20);
		
		cal=new Calculable() {
			
			@Override
			public void calculate(int x, int y) {
				System.out.println("두 수의 차="+(x-y));
			}
		};
		
		cal.calculate(89, 34);
	}

}
