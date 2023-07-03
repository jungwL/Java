package javapro.reference;

import java.util.Calendar;

public class WeekEx01 {

	public static void main(String[] args) {
		Week today=null;
		Calendar now=Calendar.getInstance();
		int week=now.get(Calendar.DAY_OF_WEEK);
		
		switch(week) {
			case 1:
				today=Week.MONDAY;
				break;
			case 2:
				today=Week.MONDAY;
				break;
			case 3:
				today=Week.MONDAY;
				break;
			case 4:
				today=Week.MONDAY;
				break;
			case 5:
				today=Week.MONDAY;
				break;
			case 6:
				today=Week.MONDAY;
				break;
			case 7:
				today=Week.MONDAY;
				break;
		}
		
		if(today == Week.SUNDAY) {
			System.out.println("일요일에는 쉽니다.");
		} else {
			System.out.println("열심히 자바를 공부합니다.");
		}
	}

}
