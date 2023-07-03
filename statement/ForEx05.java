package javapro.statement;

public class ForEx05 {

	public static void main(String[] args) {
		int num=(int)(Math.random()*6+1);
		System.out.println(num);
		
		for(int i=1; i<=6; i++) {
			num=(int)(Math.random()*45)+1;
			System.out.println(num);
		}
		
	}

}
