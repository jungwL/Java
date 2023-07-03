package javapro.classEx;

public class AccountEx03 {

	public static void main(String[] args) {
		Account gildong=new Account("123-45-678910", "홍길동", 10);
		gildong.deposit(5000);
		gildong.deposit(7000);
		try {
			int amount=gildong.withdraw(20000);
			System.out.println("인출금액 : "+amount);
		} catch(Exception e) {	// e를 통해 throw exception메세지를 받음
			System.out.println(e.getMessage());
		}

	}

}
