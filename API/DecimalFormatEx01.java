package javapro.API;

import java.text.DecimalFormat;

public class DecimalFormatEx01 {

	public static void main(String[] args) {
		DecimalFormat df;
		df=new DecimalFormat("#,###원");
		int price=1560000;
		System.out.println("판매금액 : "+df.format(price));
		double num=23251.3243;
		df=new DecimalFormat("#,###.##");	//#,###.##-한자릿수일 경우 #무시(~.5->~.5)  #,###.00-무조건 두자리 출력(없으면 0으로 출력,~.5->~.50)
		System.out.println(df.format(num));

	}

}
