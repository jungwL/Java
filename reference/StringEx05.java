package javapro.reference;

public class StringEx05 {

	public static void main(String[] args) {
		String str1="자바는 웹개발자가 되기 위해 자바를 배우고 있다.";
		int pos=str1.indexOf("자바");
		System.out.println(pos);
		int pos2=str1.lastIndexOf("자바");
		System.out.println(pos2);
		
		String str2="이것이 자바다";
		int pos3=str2.indexOf("자바");
		if(pos3 == -1) {
			System.out.println("자바와 관련이 없는 책입니다.");
		} else {
			System.out.println("자바와 관련된 책입니다.");
		}
	}

}
