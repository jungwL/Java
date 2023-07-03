package javapro.reference;

public class ArrayEx05 {

	public static void main(String[] args) {
		int[][] nums= {
				{96,85,76},
				{58,34,78,95,44}
		};
		for(int i=0; i<nums.length; i++) {
			for(int j=0; j<nums[i].length; j++) {
				System.out.print(nums[i][j]+"  ");
			}
			System.out.println();
		}

	}

}
