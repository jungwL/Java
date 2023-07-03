package javapro.classEx2;
//412p
public class ButtonEx01 {

	public static void main(String[] args) {
		Button btnGameStart=new Button();
		
		class OnListener implements Button.ClickListener {
			@Override
			public void onClick() {
				System.out.println("게임 시작 버튼을 클릭했습니다");
			}
		}//내부 클래스
		
		//버튼 객체에 ClickListener 구현 객체 주입
		btnGameStart.setClickListener(new OnListener());
		
		//게임 시작 버튼 클릭하기
		btnGameStart.click();
		
		//------------------------------------------------------------
		
		Button btnResult=new Button();
		
		class ResultListener implements Button.ClickListener {
			@Override
			public void onClick() {
				System.out.println("결과확인 버튼을 클릭했습니다");
			}
		}//내부 클래스
		
		btnResult.setClickListener(new ResultListener());
		
		btnResult.click();
	}

}
