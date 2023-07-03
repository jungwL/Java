package javapro.reference;

public class ArrayEx07 {

	public static void main(String[] args) {
		System.out.println("로또 자동 번호 생성");
		int[] lotto=new int[6];
		boolean run=true;
		while(run) {
			for(int i=0; i<lotto.length; i++) {
				lotto[i]=(int)(Math.random()*45)+1;
			}
			//알고리즘
			run=false;	// 무한 루프 방지, Outer에서 if를 안만날 경우 while문을 나오기 위해
	  Outer:for(int a=0; a<lotto.length; a++) {
				for(int b=a+1; b<lotto.length; b++) {
					if(lotto[a]==lotto[b]) {
						run=true;
						break Outer;
					}
				}
			}//for(Outer)
		}//while
		//번호 출력
		for(int i=0; i<lotto.length; i++) {
			System.out.println(lotto[i]);
		}
	}

}
