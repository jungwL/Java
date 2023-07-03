package javapro.collection;

import java.util.LinkedList;
import java.util.Queue;

public class QueueEx01 {

	public static void main(String[] args) {
		Queue<Message> messageQueue=new LinkedList<>();	//인터페이스 큐를 오버라이드한 링크드리스트 객체 생성
		messageQueue.offer(new Message("sendMail","이인후"));
		messageQueue.offer(new Message("sendSMS","신이찬"));
		messageQueue.offer(new Message("sendKakao", "하인성"));
		while(!messageQueue.isEmpty()) {
			Message message=messageQueue.poll();
			switch(message.command) {
				case "sendMail":
					System.out.println(message.to + "님에게 메일을 보냅니다.");
					break;
				case "sendSMS":
					System.out.println(message.to + "님에게 SMS을 보냅니다.");
					break;
				case "sendKakao":
					System.out.println(message.to + "님에게 카톡을 보냅니다.");
					break;
			}
		}

	}

}
