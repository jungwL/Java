package javapro.classEx;
//신한은행계좌 클래스
public class Account {
	//필드
	static final String BANKNAME="신한은행";	//은행 ----정적 필드 / 상수 / 관행적으로 대문자 사용
	String accountNo;	//계좌번호		------ 인스턴스 필드
	String ownerName;	//예금주
	int balance;		//잔액
	
	//생성자constructor
	public Account(String accountNo, String ownerName, int balance) {
		//this(accountNo,ownerName);		//다른 생성자 호출
		this.accountNo=accountNo;
		this.ownerName=ownerName;		//this.필드=매개변수
		this.balance=balance;
	}
	
	public Account(String accountNo, String ownerName) {
		this.accountNo=accountNo;		//this.필드=매개변수
		this.ownerName=ownerName;
	}
	
	public Account() {	//default 생성자
		
	}
	
	//예금한다 메소드
	void deposit(int amount) {
		balance+=amount;
	}
	
	//인출한다 메소드
	int withdraw(int amount) throws Exception {
		if(balance < amount) {
			throw new Exception("잔액이 부족합니다.");
		}
		balance-=amount;
		return amount;
	}
}
