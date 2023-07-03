package javapro.statement;

import java.util.Scanner;
/**
 * 원하는 단을 입력받아 출력
 */
public class ForEx03 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("원하는 단은? ");
		int d=sc.nextInt();
		
		System.out.printf("**%d단**\n", d);
		for(int i=1; i<=9; i++) {
			System.out.printf("%d x %d = %d\n", d,i,d*i);
		}
		
		sc.close();
	}

}
