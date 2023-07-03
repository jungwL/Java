package javapro.reference;

public class StringEx04 {

	public static void main(String[] args) {
		String str1="자바 프로그래밍";
		String str2=str1.replace("자바", "JAVA");
		System.out.println(str2);
		System.out.println(str1);
		String str3="computer";
		System.out.println(str3.substring(3, 6));
		System.out.println(str3.substring(5));
		
		String ssn="950425-1254567";
		System.out.println(ssn.substring(0, 7)+"*******");
	}

}
