package javapro.reference;

// 주어진 문자열에서 "서울"이라는 문자를 찾아, 그 문자부터 끝까지 출력한다.

public class StringEx06 {

	public static void main(String[] args) {
		String str1="나는 지금 서울 종로구에 있다.";
		
		int rocation=str1.indexOf("서울");
		System.out.println(str1.substring(rocation));
		
		boolean rs=str1.contains("서울");
		if(rs) {
			System.out.println("서울과 관련이 있음");
		} else {
			System.out.println("서울과 관련이 없음");
		}
	}

}
