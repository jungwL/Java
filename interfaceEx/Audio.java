package javapro.interfaceEx;

public class Audio implements RemoteControl {
	private int volume;
	private int memoryVolume;
	
	@Override
	public void turnOn() {
		System.out.println("오디오를 키다");
		
	}

	@Override
	public void turnOff() {
		System.out.println("오디오를 끄다");
		
	}

	@Override
	public void setVolume(int volume) {
		if(volume > RemoteControl.MAX_VOLUME) {
			this.volume=RemoteControl.MAX_VOLUME;
		} else if(volume < RemoteControl.MIN_VOLUME) {
			this.volume=RemoteControl.MIN_VOLUME;
		} else {
			this.volume=volume;
		}
		
		System.out.println("현재 오디오 볼륨 : "+this.volume);
	}

	@Override
	public void setMute(boolean mute) {
		if(mute) {
			this.memoryVolume=this.volume;
			System.out.println("무음 처리");
			setVolume(RemoteControl.MIN_VOLUME);
		} else {
			System.out.println("무음 해제");
			setVolume(this.memoryVolume);
		}
		
	}
	
	
}
