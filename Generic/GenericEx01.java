package javapro.Generic;

import java.util.List;
import java.util.ArrayList;

public class GenericEx01 {

	public static void main(String[] args) {
		int[] nums=new int[5];	//크기 고정
		nums[0]=50;
		nums[1]=70;
		System.out.println(nums[1]);
		List list=new ArrayList();
		list.add("홍길동");
		list.add(50);
		list.add(45.63);
		list.add(false);
		String name=(String)list.get(0);
		int number=(int)list.get(1);
		System.out.println(list.get(2));
		List<String> list2=new ArrayList<String>();	//가변적으로 늘어남
		list2.add("김철수");
		list2.add("이영희");
		list2.add("박찬호");
		list2.remove(1);
		for(int i=0; i<list2.size(); i++) {
			System.out.println("이름 : "+list2.get(i));
		}
		String na=list2.get(0);
	}

}
