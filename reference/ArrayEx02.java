package javapro.reference;

public class ArrayEx02 {

	public static void main(String[] args) {
		/*int[] nums=new int[5];
		nums[0]=10;
		nums[3]=5;
		for(int i=0; i<nums.length; i++) {
			System.out.println(nums[i]);
		}*/
		
		int[] nums= {78,23,45,96,12,36,23,75};
		int evenSum=0;
		for(int i=0; i<nums.length; i++) {
			if(nums[i]%2 == 0) {
				evenSum+=nums[i];
			}
		}
		
		System.out.println("배열 중 짝수들의 합= "+evenSum);

	}

}
