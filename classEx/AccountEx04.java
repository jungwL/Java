package javapro.classEx;

public class AccountEx04 {

	public static void main(String[] args) {
		Account chulsu=new Account("564-34-904521", "김철수",0);
		Account gildong=new Account();
		printAccount(chulsu);
		printAccount(gildong);

	}
	
	public static void printAccount(Account obj) {
		System.out.println("계좌번호 : "+obj.accountNo);
		System.out.println("예금주 : "+obj.ownerName);
		System.out.println("잔액 : "+obj.balance);
		System.out.println("-------------------------");
	}

}
