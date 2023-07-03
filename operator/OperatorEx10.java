package javapro.operator;

/**
 * 조건1 : 수량 10개 이상 구입하면 20%할인 적용
 * 조건2 : 판매 단가 1000원 미만인 품목은 제외
 */
import java.util.Scanner;

public class OperatorEx10 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.print("구입 수량? ");
		int amount=sc.nextInt();
		
		System.out.print("개당 가격? ");
		int price=sc.nextInt();
		String memo="(정상가)";
		
		if(amount>=10 && price>=1000) {
			
			price=(int)(price*0.8);
			memo="(할인가)";
		}
		
		int salesPrice=amount*price;
		System.out.println("판매금액 : "+salesPrice + memo);
	}
	
}