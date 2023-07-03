package javapro.API;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.METHOD)	//메소드에 어노테이션 적용
@Retention(RetentionPolicy.RUNTIME)	//실행할 때 어노테이션 적용
public @interface PrintAnnotation {
	String value() default "-";		//오버라이드 안했을 때 기본적으로 적용됨
	int number() default 15;
}
