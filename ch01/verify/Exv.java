package ch01.verify;

public class Exv {

	public static void main(String[] args) {
		int count=1;
		int num;
		for(int i=1; i<=10000; i++) {
			num=(int)(Math.random()*100)+1;
			if(num==7) {
				count++;
			}
		}
		if(count>100) {
			System.out.println("확률 높음("+count+"번)");
		} else {
			System.out.println("확률 낮음("+count+"번)");

		}
	}

}
