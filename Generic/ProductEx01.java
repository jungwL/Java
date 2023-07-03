package javapro.Generic;

public class ProductEx01 {

	public static void main(String[] args) {
		Product<Tv, String> pd1=new Product<>();
		pd1.setKind(new Tv());
		pd1.setModel("스마트 tv");
		Tv tv=pd1.getKind();
		String tvModel=pd1.getModel();
		
		Product<Car, String> pd2=new Product<>();
		pd2.setKind(new Car());
		pd2.setModel("전기차");
		Car car=pd2.getKind();
		String carModel=pd2.getModel();

	}

}
