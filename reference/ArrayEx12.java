package javapro.reference;

public class ArrayEx12 {
	public static void main(String[] args) {
		int[] nums= {56,34,77,85,89,13,90};
		int sum=0;
		
		/*for(int i=0; i<nums.length; i++) {
			sum+=nums[i];
		}*/
		for(int n:nums) {
			sum+=n;		//sum=sum+n;
		}
		System.out.println("총합="+sum);
		
	}
}
