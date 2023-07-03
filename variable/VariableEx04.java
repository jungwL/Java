package javapro.variable;

public class VariableEx04 {

	public static void main(String[] args) {
		long num=7423423128L;	// ~L -> 수를 long형식으로 메모리에 보관. 기본적으로 buffer는 int형식
		System.out.println(num);
		float fnum=2.3f;	// 실수는 기본 double형식으로 저장 -> ~f;
		System.out.println(fnum);
		double dnum=5E3;	//5*10의3승 E->지수
		System.out.println(dnum);

	}

}
