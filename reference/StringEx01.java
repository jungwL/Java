package javapro.reference;

public class StringEx01 {

	public static void main(String[] args) {
		/*int num=300;
		String str="korea";
		str="seoul";
		System.out.println(num);
		System.out.println(str);*/
		
		String str1="김철수";
		String str2="김철수";
		if(str1 == str2) {
			System.out.println("str1과 str2는 참조(메모리 번지)가 같음");
		}else {
			System.out.println("str1과 str2는 참조(메모리 번지)가 다름");
		}
		
		String str3=new String("홍길동");		// 비어있는 메모리에 객체 생성
		String str4=new String("홍길동");
		if(str3 == str4) {
			System.out.println("str3과 str4는 같은 문자열입니다");
		}else {
			System.out.println("str3과 str4는 다른 문자열입니다");
		}
		// 비교
		if(str1.equals(str2)) {
			System.out.println("str1과 str2는 같은 문자열");
		}else {
			System.out.println("str1과 str2는 다른 문자열");
		}
		
		if(str3.equals(str4)) {
			System.out.println("str3과 str4는 같은 문자열");
		}else {
			System.out.println("str3과 str4는 다른 문자열");
		}

	}

}
