package javapro.collection;

import java.util.ArrayList;
import java.util.List;

public class ArrayListEx01 {

	public static void main(String[] args) {
		//배열(크기 고정)
		int[] nums=new int[5];
		nums[0]=10;
		nums[1]=20;
		nums[2]=30;
		nums[3]=40;
		nums[4]=50;
		for(int i=0; i<nums.length; i++) {
			System.out.println(nums[i]);
		}
		System.out.println("---------------------------------");
		//nums[5]=60;
		//컬렉션(크기 가변)
		List<Integer> list=new ArrayList<Integer>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(1,88);
		list.remove(2);
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}

	}

}
