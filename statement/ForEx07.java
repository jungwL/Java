package javapro.statement;

public class ForEx07 {

	public static void main(String[] args) {
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		for(int i=1; i<=5; i++) {
			for(int j=5; j>=i; j--) {		// j=1; j<=6-i;
				System.out.print("*");
			}
			System.out.println();
		}
		
		for(int i=1; i<=15; i+=2) {
			for(int k=13; k>=i; k--) {
				System.out.print(" ");
			}
			
			for(int j=1; j<=i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	
		for(int i=1; i<=15; i++) {
			for(int k=15; k>i; k--) {
				System.out.print(" ");
			}
			
			for(int j=1; j<=2*i-1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}

}
