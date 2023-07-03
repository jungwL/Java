package javapro.reference;

public class ArrayEx09 {
	public static void main(String[] args) {
		int[][] scores= {
				{96,85,90,60},
				{70,86,66,82,75}
		};
		int sum;
		double avg;
		
		for(int i=0; i<scores.length; i++) {
			sum=0;
			for(int j=0; j<scores[i].length; j++) {
				sum+=scores[i][j];
			}
			avg=sum/scores[i].length;
			System.out.println((i+1)+"반 성적 총점 = "+sum);
			System.out.println((i+1)+"반 성적 평균 = "+avg);
		}
		
	}
}
