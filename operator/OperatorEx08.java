package javapro.operator;

import java.util.Scanner;

public class OperatorEx08 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("구입 수량?");
		int amount=sc.nextInt();
		System.out.print("개당 가격?");
		int price=sc.nextInt();
		//int salesPrice=amount*price;
		//System.out.println("판매금액 : "+salesPrice);
		String memo="(정상가)";
		if(amount>=10) {
			//salesPrice=amount*(int)(price*0.8);
			price=(int)(price*0.8);		// price*(1-0.2)
			memo="(할인가)";
		}
		int salesPrice=amount*price;
		System.out.println("판매금액 : "+salesPrice + memo);
	}
	
}