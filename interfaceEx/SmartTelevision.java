package javapro.interfaceEx;

public class SmartTelevision implements RemoteControl, Searchable {
	private int volume;
	
	@Override
	public void search(String url) {
		System.out.println(url+" 검색");
		
	}

	@Override
	public void turnOn() {
		System.out.println("스마트TV 키다");
		
	}

	@Override
	public void turnOff() {
		System.out.println("스마트TV 끄다");
		
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
		
		System.out.println("현재 스마트TV 볼륨 : "+this.volume);
		
	}

}
