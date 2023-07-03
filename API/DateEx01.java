package javapro.API;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateEx01 {

	public static void main(String[] args) {
		Date now=new Date();	//컴퓨터에서 현재 날짜와 시간을 가져와 객체 생성
		System.out.println(now);
		SimpleDateFormat sdf;
		sdf=new SimpleDateFormat("yyyy.MM.dd HH:mm:ss");
		System.out.println(sdf.format(now));	//now의 정보를 sdf형식으로 출력
		sdf=new SimpleDateFormat("yyyy-MM-dd");
		System.out.println(sdf.format(now));
		sdf=new SimpleDateFormat("yyyy년 MM월 dd일");	//형식 기호 외에는 문자열 그대로 출력
		System.out.println(sdf.format(now));
		sdf=new SimpleDateFormat("yyyy-MM-dd E요일 a hh:mm:ss");	//HH-24시 표기 hh-12시 a-오전/오후 표기 E-요일
		System.out.println(sdf.format(now));
		sdf=new SimpleDateFormat("yyyy년 D번째 날입니다.");
		System.out.println(sdf.format(now));
		sdf=new SimpleDateFormat("이번주는 MM월의 W번째 주입니다.");	//W-월의 주
		System.out.println(sdf.format(now));
		sdf=new SimpleDateFormat("이번주는 yyyy년의 w번째 주입니다.");	//w-년의 주
		System.out.println(sdf.format(now));

	}

}
