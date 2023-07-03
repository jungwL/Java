package javapro.reference;

public class ArrayEx11 {
	public static void main(String[] args) {
		int[] oldNums= {4,7,3};
		int[] newNums=new int[5];
		System.arraycopy(oldNums, 0, newNums, 0, oldNums.length);
		
		for(int i=0; i<newNums.length; i++) {
			System.out.print(newNums[i]+" ");
		}
		
	}
}
