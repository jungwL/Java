package javapro.classEx;

public class CheckingAccountEx01 {

	public static void main(String[] args) {
		CheckingAccount chulsu=new CheckingAccount("110-564-6394502", "김철수", 10, "3401-4567-3239-8920");
		chulsu.deposit(5000);
		try {
			int paidAmount=chulsu.pay("3401-4567-3239-8920", 2000);
			System.out.println("지불금액 = "+paidAmount);
			System.out.println("잔액 = "+chulsu.balance);
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
