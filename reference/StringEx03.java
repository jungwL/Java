package javapro.reference;

public class StringEx03 {

	public static void main(String[] args) {
		/*String str1="computer";
		System.out.println(str1.length());*/
		
		String ssn="950425-1254567";
		int len=ssn.length();
		if(len == 14) {
			System.out.println("주민등록번호 자릿수가 맞습니다.");
		} else {
			System.out.println("주민등록번호 자릿수가 틀립니다.");
		}

	}

}
