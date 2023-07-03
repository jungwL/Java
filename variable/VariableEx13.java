package javapro.variable;

public class VariableEx13 {

	public static void main(String[] args) {
		int value=150;
		System.out.println("상품의 수량은 " + value + "개입니다.");
		System.out.printf("상품의 수량은 %d개입니다.\n", value);
		
		double dvalue=10/3.0;
		System.out.printf("원주율 값=%3.3f\n", dvalue);
		String name="이기하";
		System.out.printf("내 이름은 %s입니다.\n", name);
		
		int amount=7;
		int price=3500;
		System.out.printf("상품의 수량:%d개\n상품의 가격:%d원\n", amount, price);
		
		int height=175;
		int weight=66;
		System.out.printf("%s의 키는 %dcm이고 몸무게는 %dkg입니다.", name, height, weight);
	}

}
