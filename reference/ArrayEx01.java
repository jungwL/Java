package javapro.reference;

public class ArrayEx01 {

	public static void main(String[] args) {
		int[] scores= {56,37,88,68,90,95,78,47,89,88};
		int sum=0;
		int avg;
		
		for(int i=0; i<scores.length; i++) {	// i<=scores.length - 오류남
			sum+=scores[i];
		}
		avg=sum/scores.length;
		System.out.println("반 총점 : "+sum);
		System.out.println("반 평균 : "+avg);

	}

}
