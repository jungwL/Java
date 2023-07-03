package javapro.variable;

public class VariableEx11 {

	public static void main(String[] args) {
		String str1="10";
		String str2="20";
		System.out.println(str1+str2);
		// Integer.parseint(str) : 문자열을 정수로 바꿔줌
		System.out.println(Integer.parseInt(str1) + Integer.parseInt(str2));
		String str3=String.valueOf(10);		// 정수를 String형식으로 바뀜
		String str4=String.valueOf(3.14);
		System.out.println(str3+str4);
	}

}
