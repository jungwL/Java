package javapro.reference;

import java.util.Scanner;

public class Confirm03 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		boolean run=true;
		int student;
		int choice;
		int[] scores=null;
		
		while(run) {
			System.out.println("--------------------------------------------");
			System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 |4.분석 | 5.종료");
			System.out.println("--------------------------------------------");
			System.out.print("선택> ");
			choice=sc.nextInt();
			
			switch(choice) {
				case 1:
					System.out.print("학생수> ");
					student=sc.nextInt();
					scores=new int[student];
					break;
				case 2:
					for(int i=0; i<scores.length; i++) {
						System.out.print("scores["+i+"]> ");
						scores[i]=sc.nextInt();
					}
					break;
				case 3:
					for(int i=0; i<scores.length; i++) {
						System.out.println("scores["+i+"]: "+scores[i]);
					}
					break;
				case 4:
					int max=0;
					int sum=0;
					for(int i=0; i<scores.length; i++) {
						sum+=scores[i];
						if(max<scores[i]) {
							max=scores[i];
						}
					}
					System.out.println("최고 점수: "+max);
					System.out.println("평균 점수: "+(float)sum/scores.length);
					break;
				case 5:
					run=false;
			}//switch
			System.out.println("프로그램 종료");
			
			/*if(choice==1) {
				System.out.print("학생수> ");
				student=sc.nextInt();
				scores=new int[student];
			} else if(choice==2) {
				for(int i=0; i<scores.length; i++) {
					System.out.print("scores["+i+"]> ");
					scores[i]=sc.nextInt();
				}
			} else if(choice==3) {
				for(int i=0; i<scores.length; i++) {
					System.out.println("scores["+i+"]: "+scores[i]);
				}
			} else if(choice==4) {
				int max=0;
				int sum=0;
				for(int i=0; i<scores.length; i++) {
					sum+=scores[i];
					if(max<scores[i]) {
						max=scores[i];
					}
				}
				System.out.println("최고 점수: "+max);
				System.out.println("평균 점수: "+(float)sum/scores.length);
			} else if(choice==5) {
				System.out.println("프로그램 종료");
				run=false;
			}*/
			
		}//while
		
	}

}
