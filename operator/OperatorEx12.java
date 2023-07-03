package javapro.operator;

public class OperatorEx12 {

	public static void main(String[] args) {
		/*int value=356;
		System.out.println(value-value%100);*/	//value/100*100
		
		double value=23.51423;
		System.out.printf("%4.2f\n", value);
		
		value=(int)(value*100)/100.0;
		System.out.println(value);
	}
	
}