package javapro.statement;

import java.util.Scanner;

public class IFEx01 {

	public static void main(String[] args) {
		/*
		int score=70;
		if(score>=80) {
			System.out.println("합격하셨습니다.");
		}
		System.out.println("수고하셨습니다.");
		*/
		
		// 점수를 입력받아 합격여부 판단. 조건 : 합격점수는 80점 이상
		Scanner sc = new Scanner(System.in);
		System.out.print("점수 입력>>");
		int s=sc.nextInt();
		
		if(s>=80) {
			System.out.println("합격하셨습니다.");
			System.out.println("12월 28일까지 회사에 방문해주세요.");
		} else {
			System.out.println("불합격하셨습니다.");
			System.out.println("다음에 응시해주세요.");
		}//if
		
		System.out.println("수고하셨습니다.");

	}

}
