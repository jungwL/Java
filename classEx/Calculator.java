package javapro.classEx;
// 계산기
public class Calculator {
	//메소드
	/*int add(int num1, int num2) {
		int sum=num1+num2;
		return sum;
	}
	
	int add(int num1, int num2, int num3) {
		int sum=num1+num2+num3;
		return sum;
	}*/
	
	int add(int ... nums) {		//매개변수를 배열로 받음
		int sum=0;
		for(int i=0; i<nums.length; i++) {
			sum+=nums[i];
		}
		return sum;
	}
}
