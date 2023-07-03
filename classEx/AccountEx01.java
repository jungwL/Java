package javapro.classEx;

public class AccountEx01 {

	public static void main(String[] args) {
		Account chulsu=new Account();		//chulsu 인스턴스 객체 생성
		chulsu.accountNo="111-22-34567";
		chulsu.ownerName="김철수";
		chulsu.balance=100;
		
		Account gildong=new Account();
		gildong.accountNo="234-56-45426";
		gildong.ownerName="홍길동";
		gildong.balance=0;
		
		chulsu.deposit(3000);
		chulsu.deposit(5000);
		gildong.deposit(10000);
		try {
			System.out.println(chulsu.ownerName + "의 잔액 = "+chulsu.balance);
			int amount=gildong.withdraw(20000);
			System.out.println("인출금액 : "+amount);
			System.out.println(gildong.ownerName + "의 잔액 = "+gildong.balance);
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
