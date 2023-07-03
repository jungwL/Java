package javapro.API;

import java.util.Scanner;
import java.util.regex.Pattern;

public class RegEx01 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("전화번호 입력>>");
		String phoneNum=sc.next();
		String regExp="(02|010)-\\d{3,4}-\\d{4}";
		boolean rs=Pattern.matches(regExp, phoneNum);
		if(rs) {
			System.out.println("올바른 전화번호 형식입니다.");
		} else {
			System.out.println("전화번호 형식이 아닙니다.");
		}
		
		System.out.print("이메일 입력>>");
		String email=sc.next();
		regExp="\\w+@\\w+\\.\\w+(\\.\\w+)?";		//\w+:한 문자 이상  ()?:()안이 없음 혹은 한개
		rs=Pattern.matches(regExp, email);
		if(rs) {
			System.out.println("올바른 이메일 형식입니다.");
		} else {
			System.out.println("이메일 형식이 아닙니다.");
		}

	}

}
