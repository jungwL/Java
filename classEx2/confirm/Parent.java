package javapro.classEx2.confirm;

public class Parent {
	public String nation;
	
	public Parent() {
		this("대한민국");		//이 클래스의 생성자 호출
		System.out.println("Parent() call");
	}
	
	public Parent(String nation) {
		this.nation=nation;
		System.out.println("Parent(String nation) call");
	}
}
