package javapro.variable;

public class VariableEx08 {

	public static void main(String[] args) {
		//char ch1='가';		// char는 한 문자 표현, ''사용
		String str1="철수는 학교에 갔다.\n수업중이다.";	// String은 문자열 표현, ""사용
		System.out.println(str1);
		int num=20;
		double dnum=num;	// 자동타입변환
		System.out.println(dnum);
		double dn=5.3;
		int in=(int)dn;		// 강제타입변환
		System.out.println(in);
	}

}
