package javapro.statement;

// 1부터 100까지에서 짝수_even number의 합과 홀수_odd number의 합을 분리해서 출력

public class ForEx04 {

	public static void main(String[] args) {
		int sum=0;		//초기값을 넣지 않으면 에러
		int even=0;
		int odd=0;
		for(int i=1; i<=100; i++) {
			if(i%2 == 0) {
				even+=i;
			} else {
				odd+=i;
			}
		}
		sum=even+odd;
		System.out.println("1부터 100까지 홀수의 합="+odd);
		System.out.println("1부터 100까지 짝수의 합="+even);
		System.out.println("1부터 100까지의 합="+sum);
		
	}

}
