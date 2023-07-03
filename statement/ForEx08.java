package javapro.statement;

/**
 * 식당-족 전문집 돼지족, 오리족
 * 직영농장 : 돼지, 오리
 * 족은 식당, 몸통은 납품업체
 * 영수증 가져오기
 * 자루(56족)
 * 영수증 : 총 17마리, 000원
 */

public class ForEx08 {

	public static void main(String[] args) {
		int total=0;
		for(int p=1; p<17; p++) {
			for(int d=1; d<17; d++) {
				total=p*4+d*2;
				if(total==56 && (p+d)==17) {
					System.out.println("돼지 " + p +"마리, 오리 " + d +"마리");
				}
			}
		}
		
	}

}
