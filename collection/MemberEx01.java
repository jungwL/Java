package javapro.collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class MemberEx01 {

	public static void main(String[] args) {
		Set<Member> set=new HashSet<Member>();
		set.add(new Member("이나온", 24));
		set.add(new Member("서일호", 31));
		set.add(new Member("박은해", 28));
		set.add(new Member("서일호", 31));	//객체 생성으로 인해 값이 같아도 같은 객체로 인식하지 않음
		Iterator<Member> iterator=set.iterator();
		while(iterator.hasNext()) {
			Member member=iterator.next();
			System.out.println("이름: "+member.name+", "+"나이: "+member.age);
		}
		System.out.println("총 인원수: "+set.size());

	}

}
