package javapro.reference;

public class StringEx02 {

	public static void main(String[] args) {
		/*String str1="오늘은 자바객체 배우는 날";
		char ch=str1.charAt(5);
		System.out.println(ch);*/
		
		String ssn="950425-1234567";
		char z=ssn.charAt(7);
		
		if(z == '1' || z == '3') {
			System.out.println("남성");
		} else if(z == '2' || z == '4') {
			System.out.println("여성");
		} else {
			System.out.println("성별오류");
		}

	}

}
