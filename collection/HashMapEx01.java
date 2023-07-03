package javapro.collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class HashMapEx01 {

	public static void main(String[] args) {
		Map<String, Integer> map=new HashMap<>();
		//Map<String, Integer> map=new Hashtable<>(); //스레드 환경
		map.put("김철수", 85);
		map.put("홍길동", 92);
		map.put("이인우", 83);
		map.put("서하준", 99);
		System.out.println("총 응시자 수>>"+map.size());
		Scanner sc=new Scanner(System.in);
		System.out.println("이름을 입력>>");
		String name=sc.next();
		System.out.println("점수 : "+map.get(name));
		System.out.println("성적 현황표");
		System.out.println("==================");
		System.out.println("이름      점수");
		Set<String> key=map.keySet();
		Iterator<String> iterator=key.iterator();
		while(iterator.hasNext()) {
			String na=iterator.next();
			Integer score=map.get(na);
			System.out.println(na+"    "+score);
		}
		
		map.remove("홍길동");
		System.out.println("수정된 성적 현황표");
		System.out.println("==================");
		System.out.println("이름      점수");
		Set<Entry<String, Integer>> setEntry=map.entrySet();
		Iterator<Entry<String, Integer>> entryIterator=setEntry.iterator();
		while(entryIterator.hasNext()) {
			Entry<String, Integer> entry=entryIterator.next();
			String nameKey=entry.getKey();
			Integer scoreValue=entry.getValue();
			System.out.println(nameKey+"   "+scoreValue);
		}
	}

}
