package javapro.API;

import java.util.Calendar;
import java.util.TimeZone;

public class CalendarEx02 {

	public static void main(String[] args) {
		TimeZone tz=TimeZone.getTimeZone("Europe/Rome");	//다른 지역값을 가져옴
		Calendar now=Calendar.getInstance(tz);	//지역의 날짜, 시간을 가져옴
		//System.out.println(now);
		int year=now.get(Calendar.YEAR);
		int month=now.get(Calendar.MONTH)+1;
		int day=now.get(Calendar.DAY_OF_MONTH);
		int week=now.get(Calendar.DAY_OF_WEEK);
		String w=null;
		switch(week) {
			case Calendar.SUNDAY:w="일요일";break;	//상수값
			case Calendar.MONDAY:w="월요일";break;
			case 3:w="화요일";break;
			case 4:w="수요일";break;
			case 5:w="목요일";break;
			case 6:w="금요일";break;
			case 7:w="토요일";break;
		}
		
		int hour=now.get(Calendar.HOUR);
		int minute=now.get(Calendar.MINUTE);
		int second=now.get(Calendar.SECOND);
		int ampm=now.get(Calendar.AM_PM);
		String strAmPm="";
		
		if(ampm==Calendar.AM) {
			strAmPm="오전";
		} else {
			strAmPm="오후";
		}
		
		System.out.print("현재 로마는 "+year+"년 ");
		System.out.print(month+"월 ");
		System.out.print(day+"일 ");
		System.out.print(w+" \n");
		System.out.println(strAmPm+" "+hour+"시 "+minute+"분 "+second+"초 입니다.");

	}

}
