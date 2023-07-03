package javapro.collection;

import java.util.List;
import java.util.Vector;

public class VectorEx01 {

	public static void main(String[] args) {
		List<Board> blist=new Vector<>();
		
		Thread threadA=new Thread() {
			@Override
			public void run() {
				for(int i=1; i<=1000; i++) {
					blist.add(new Board("안녕"+i,"하하하"+i,"메델"));
				}
			}
		};
		
		Thread threadB=new Thread() {
			@Override
			public void run() {
				for(int i=1; i<=1000; i++) {
					blist.add(new Board("dia"+i,"dddd"+i,"dibil"));
				}
			}
		};
		threadA.start();
		threadB.start();
		try {
			threadA.join();
			threadB.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("총 게시물 수:"+blist.size());
	}

}
