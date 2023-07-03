package javapro.operator;

import java.util.Scanner;

public class OperatorEx03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("수량 입력>>");
		int amount=sc.nextInt();
		int price=1000;
		String memo="(정상가)";
		if(amount >= 10) {
			price=800;
			memo="(할인가)";
		}
		int totalPay=amount*price;
		System.out.println("판매금액="+totalPay + memo);
		
	}

}
