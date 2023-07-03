package javapro.interfaceEx;

public class Tiger extends Animal implements iAnimal {

	@Override
	public void eat() {		//구현
		System.out.println("맷돼지를 잡아먹음");
		
	}

	@Override
	public void move() {	//상속
		System.out.println("네발로 이동");
		
	}
	
}
