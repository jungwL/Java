package javapro.statement;

/**
 * 보물섬 찾으로 배를 타고 항해
 * 동굴에 2kg 30개, 3kg 30개
 * 배가 견딜 수 있는 무게 100kg, 장비+탐험가 70kg
 * 보물은 30kg
 */

public class ForEx09 {

	public static void main(String[] args) {
		int count=0;
		int total=0;
		for(int t=1; t<30; t++) {
			for(int th=1; th<30; th++) {
				total=t*2+th*3;
				if(total==30) {
					count+=1;
					System.out.printf("2kg %d개, 3kg %d개\n", t,th);
				}
			}
		}
		System.out.println("경우의 수=" + count);
		
	}

}
