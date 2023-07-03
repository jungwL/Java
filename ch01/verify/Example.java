package ch01.verify;

public class Example {

	public static void main(String[] args) {

		//System.out.println("개발자가 되기 위한 필수 개발 언어 Java");
		
		/*byte num1=20;
		byte num2=30;
		int rs=num1+num2;
		System.out.println(num1 & num2);*/
		
		for(int i=1; i<7; i++) {
			for(int j=1; j<7; j++) {
				if(i+j==6) {
					System.out.println(i+"+"+j+"="+(i+j));
				}
			}
		}
	}

}
