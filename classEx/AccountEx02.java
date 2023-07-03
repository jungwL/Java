package javapro.classEx;

public class AccountEx02 {

	public static void main(String[] args) {
		Account younghee=new Account("111-65-4534513", "이영희", 1000);
		Account chanho=new Account("234-67-4572456", "박찬호", 0);
		younghee.deposit(6000);
		chanho.deposit(10000);
		try {
			younghee.withdraw(2000);
			printAccount(younghee);
			printAccount(chanho);
			printAccount(new Account("342-66-2341357", "손흥민", 1230000));	//익명 객체 생성
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	//예금정보 출력 메소드
	public static void printAccount(Account obj) {
		System.out.println("거래은행 : "+Account.BANKNAME);
		System.out.println("계좌번호 : "+obj.accountNo);
		System.out.println("예금주 : "+obj.ownerName);
		System.out.println("잔액 : "+obj.balance);
		System.out.println("-------------------------");
	}

}
