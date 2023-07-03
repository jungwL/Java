package javapro.reference;

public class ArrayEx10 {
	public static void main(String[] args) {
		int[] oldNums= {4,7,3};
		int[] newNums=new int[5];
		
		for(int i=0; i<oldNums.length; i++) {
			System.out.print(oldNums[i]+" ");
			newNums[i]=oldNums[i];
		}
		
		System.out.println();
		
		for(int i=0; i<newNums.length; i++) {
			System.out.print(newNums[i]+" ");
		}
		
	}
}
