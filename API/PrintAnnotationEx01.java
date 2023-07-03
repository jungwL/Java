package javapro.API;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class PrintAnnotationEx01 {

	public static void main(String[] args) throws Exception {
		Method[] dcMethod=Service.class.getDeclaredMethods();	//Service 클래스의 메소드를 배열로 가져옴
		for(Method method:dcMethod) {	//메소드 정보가 차례대로 들어가진 않음
			PrintAnnotation printAnno=method.getAnnotation(PrintAnnotation.class);
			printLine(printAnno);
			method.invoke(new Service());	//Service 클래스의 메소드 호출
			printLine(printAnno);
		}
	}//main
	
	//출력메소드
	public static void printLine(PrintAnnotation printAnno) {
		int num=printAnno.number();
		for(int i=0; i<num; i++) {
			String val=printAnno.value();
			System.out.print(val);
		}
		System.out.println();
	}

}
