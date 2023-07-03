package javapro.variable;

public class VariableEx06 {

	public static void main(String[] args) {
		int money=78630;
		int man=money/10000;
		money=money%10000;
		int oc=money/5000;
		money=money%5000;
		int c=money/1000;
		money=money%1000;
		int fiveh=money/500;
		money=money%500;
		int oneh=money/100;
		money=money%100;
		int ten=money/10;
		
		System.out.println("만원 "+man+"장");
		System.out.println("오천원 "+oc+"장");
		System.out.println("천원 "+c+"장");
		System.out.println("오백원 "+fiveh+"개");
		System.out.println("백원 "+oneh+"개");
		System.out.println("십원 "+ten+"개");
		
	}

}
