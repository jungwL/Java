package javapro.reference;

public class Confirm01 {

	public static void main(String[] args) {
		int[] array= {1,5,3,8,2};
		int max=0;
		for(int i=1; i<array.length; i++) {
			if(max<array[i]) {
				max=array[i];
			}
		}
		System.out.println("최대값 = "+max);
		
	}

}
