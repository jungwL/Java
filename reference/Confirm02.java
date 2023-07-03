package javapro.reference;

public class Confirm02 {

	public static void main(String[] args) {
		int[][] array= {
				{95,86},
				{83,92,96},
				{78,83,93,87,88}
		};
		int sum=0;
		int c=0;
		float avg;
		for(int i=0; i<array.length; i++) {
			for(int j=0; j<array[i].length; j++) {
				sum+=array[i][j];
				c++;
			}
		}
		avg=sum/(float)c;
		System.out.println("전체 합="+sum);
		System.out.println("평균="+avg);
		
	}

}
