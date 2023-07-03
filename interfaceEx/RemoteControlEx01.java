package javapro.interfaceEx;

public class RemoteControlEx01 {

	public static void main(String[] args) {
		RemoteControl rc;	 //선언
		Searchable sa;
		
		rc=new Television(); //생성, 다형성
		rc.turnOn();			//Television의 turnOn메소드 실행
		rc.setVolume(5);
		rc.setMute(true);
		rc.setMute(false);
		rc.turnOff();
		
		rc=new Audio();
		rc.turnOn();			//Audio의 turnOn메소드 실행
		rc.setVolume(7);
		rc.setMute(true);
		rc.setMute(false);
		RemoteControl.changeBattery();
		rc.turnOff();
		
		rc=new SmartTelevision();
		rc.turnOn();
		rc.setVolume(5);
		sa=new SmartTelevision();
		sa.search("https://www.youtube.com");
		rc.turnOff();

	}

}
