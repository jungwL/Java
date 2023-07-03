package javapro.classEx;

public class CalculatorEx01 {

	public static void main(String[] args) {
		Calculator myCalc=new Calculator();
		int rs1=myCalc.add(12, 25);
		System.out.println("두 수의 합="+rs1);
		int rs2=myCalc.add(12, 25, 74);
		System.out.println("합계="+rs2);
		int rs3=myCalc.add(12, 25, 74,56,34);
		System.out.println("합계="+rs3);
		int[] values= {23,64,88,45,2,35,98,45,21,64,87};
		int rs4=myCalc.add(values);
		System.out.println("합계="+rs4);
		int rs5=myCalc.add(new int[] {12,30,40,50});		//익명 객체 생성
		System.out.println("합계="+rs5);

	}

}
