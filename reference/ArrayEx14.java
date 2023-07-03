package javapro.reference;

import java.util.Scanner;

public class ArrayEx14 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("선택해주세요(1.바위 2.가위 3.보)>> ");
		int myChoice=sc.nextInt();
		int comChoice=(int)(Math.random()*3)+1;
		
		String[] rps= {"바위","가위","보"};
		System.out.println("나의 선택=>"+rps[myChoice-1]);
		System.out.println("컴퓨터의 선택=>"+rps[comChoice-1]);
		
		if(myChoice==comChoice) {
			System.out.println("결과 : 무승부");
		}else if((myChoice==1 && comChoice==2) || (myChoice==2 && comChoice==3) || (myChoice==3 && comChoice==1)) {
			System.out.println("결과 : 승리");
		}else {
			System.out.println("결과 : 패배");
		}
		
	}
}
