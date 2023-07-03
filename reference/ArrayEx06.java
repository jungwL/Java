package javapro.reference;

public class ArrayEx06 {

	public static void main(String[] args) {
		int[] nums= {56,345,79,66,48};
		int temp;
		System.out.println("** 정렬 전 출력 **");
		for(int i=0; i<nums.length; i++) {
			System.out.print(nums[i]+" ");
		}
		System.out.println();
		// 정렬 알고리즘
		for(int a=0; a<nums.length; a++) {
			for(int b=a+1; b<nums.length; b++) {
				if(nums[a]>nums[b]) {
					temp=nums[a];
					nums[a]=nums[b];
					nums[b]=temp;
				}
			}
		}
		
		// 정렬 후
		System.out.println("** 정렬 후 출력 **");
		for(int i=0; i<nums.length; i++) {
			System.out.print(nums[i]+" ");
		}
		System.out.println();

	}

}
