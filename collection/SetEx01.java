package javapro.collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetEx01 {

	public static void main(String[] args) {
		Set<String> set=new HashSet<>();
		set.add("하이든");
		set.add("베토벤");
		set.add("모차르트");
		set.add("베토벤");
		//System.out.println("총 인원수: "+set.size());
		/*for(String name:set) {
			System.out.println("이름: "+name);
		}*/
		set.remove("베토벤");
		Iterator<String> iterator=set.iterator();
		while(iterator.hasNext()) {
			String name=iterator.next();
			System.out.println("이름: "+name);
		}
		System.out.println("총 인원수: "+set.size());
	}

}
