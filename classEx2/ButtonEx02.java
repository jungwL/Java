package javapro.classEx2;

public class ButtonEx02 {

	public static void main(String[] args) {
		Button btnGameStart=new Button();
		//익명 객체
		btnGameStart.setClickListener(new Button.ClickListener() {
			@Override
			public void onClick() {
				System.out.println("게임 시작");
			}
		});
		btnGameStart.click();
		
		//------------------------------------------------------------
		
		Button btnResult=new Button();
		
		btnResult.setClickListener(new Button.ClickListener() {
			@Override
			public void onClick() {
				System.out.println("게임 결과 확인");
			}
		});
		btnResult.click();
	}

}
