package javapro.classEx2;
//중첩 인터페이스
public class Button {
	//중첩 인터페이스
	interface ClickListener {
		//추상 메소드
		void onClick();
	}
	
	private ClickListener clickListener;
	
	public void setClickListener(ClickListener clickListener) {
		this.clickListener=clickListener;
	}
	
	public void click() {
		this.clickListener.onClick();
	}
}
