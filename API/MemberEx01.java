package javapro.API;

public class MemberEx01 {

	public static void main(String[] args) {
		Member obj1=new Member("blue");
		Member obj2=new Member("blue");
		Member obj3=new Member("red");
		
		if(obj1.equals(obj2)) {
			System.out.println("obj1과 obj2는 같은 id입니다.");
		} else {
			System.out.println("obj1과 obj2는 다른 id입니다.");
		}
		
		if(obj1.equals(obj3)) {
			System.out.println("obj1과 obj3은 같은 id입니다.");
		} else {
			System.out.println("obj1과 obj3은 다른 id입니다.");
		}

	}

}
