package javapro.API;

import java.util.StringTokenizer;

public class StringEx02 {

	public static void main(String[] args) {
//		String data="김철수,이영희,홍길동,박찬호,이영표";
		String data="김철수&이영희,홍길동-박찬호,이영표";
		String[] names=data.split("&|,|-");		// ","를 기준으로 분리해서 names에 입력
		for(int i=0; i<names.length; i++) {
			System.out.print(names[i]+"  ");
		}
		System.out.println();
		System.out.println("==============================");
		String data2="김철수,이영희,홍길동,박찬호,이영표";
		StringTokenizer st=new StringTokenizer(data2,",");	//,를 기준으로 분리
		while(st.hasMoreTokens()) {	//토큰이 남아있는지 확인
			String name=st.nextToken();	//st의 토큰 하나를 name에 가져옴
			System.out.print(name+"  ");
		}
	}

}
