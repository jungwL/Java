package javapro.operator;

/*
 * 복합 대입 연산자
 */
public class OperatorEx11 {

	public static void main(String[] args) {
		/*int num=35;
		num-=10;
		System.out.println(num);*/
		
		int pencils=534;
		int students=30;
		
		int pencilsPerStudent=pencils/students;
		System.out.println(pencilsPerStudent);
		
		int pencilsLeft=pencils%students;
		System.out.println(pencilsLeft);
	}
	
}