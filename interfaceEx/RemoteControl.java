package javapro.interfaceEx;

public interface RemoteControl {
	int MIN_VOLUME=0;
	int MAX_VOLUME=10;
	void turnOn();
	void turnOff();
	void setVolume(int volume);
	// 디폴트 메소드
	default void setMute(boolean mute) {	//무음 처리
		if(mute) {
			System.out.println("무음 처리");
			setVolume(MIN_VOLUME);
		} else {
			System.out.println("무음 해제");
		}
	}
	//정적 메소드
	static void changeBattery() {
		System.out.println("리모콘 건전지 교환[");
	}
}
