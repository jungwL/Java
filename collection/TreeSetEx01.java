package javapro.collection;

import java.util.NavigableSet;
import java.util.TreeSet;

public class TreeSetEx01 {

	public static void main(String[] args) {
		TreeSet<Integer> scores=new TreeSet<>();
		scores.add(87);
		scores.add(98);
		scores.add(66);
		scores.add(93);
		scores.add(90);
		for(Integer s:scores) {
			System.out.print(s+" ");
		}
		System.out.println();
		System.out.println("가장 낮은 점수: "+scores.first());
		System.out.println("가장 높은 점수: "+scores.last());
		System.out.println("93점 아래 점수: "+scores.lower(93));
		System.out.println("93점이거나 바로 아래 점수: "+scores.floor(93));
		System.out.println("87점이거나 바로 위점수: "+scores.ceiling(87));
		
		NavigableSet<Integer> descScores=scores.descendingSet();
		for(Integer s:descScores) {
			System.out.print(s+" ");
		}

	}

}
