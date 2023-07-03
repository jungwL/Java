package javapro.variable;

public class VariableEx09 {

	public static void main(String[] args) {
		/*int num=24345;
		byte bnum=(byte)num;
		System.out.println(bnum);*/
		byte num1=10;
		byte num2=20;
		int rs=num1+num2;
		System.out.println(rs);
		
		int v=10;
		double dv=5.3;
		double rs2=v+dv;
		System.out.println(rs2);
		
		int v1=10;
		double dv1=5.3;
		int rs3=v1+(int)dv1;	// (int)(v1+dv1)
		System.out.println(rs3);
	}

}
