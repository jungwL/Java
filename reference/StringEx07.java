package javapro.reference;

public class StringEx07 {

	public static void main(String[] args) {
		String str="박찬호,김철수,이영희,홍길동,이영표";
		String[] names=str.split(",");
		System.out.println("** 합격자 명단 **");
		
		for(int i=0; i<names.length; i++) {
			System.out.println("이름 : "+names[i]);
		}
		
	}

}
