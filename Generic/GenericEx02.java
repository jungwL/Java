package javapro.Generic;

public class GenericEx02 {

	public static void main(String[] args) {
		Box1 box1=new Box1();
		box1.content="안녕하세요";
		System.out.println(box1.content);
		
		Box2<String> mybox=new Box2<String>();
		mybox.content="우리모두파이팅";
		System.out.println(mybox.content);
		
		Box2<Integer> mb=new Box2<Integer>();
		mb.content=100;
		System.out.println(mb.content);
	}

}
