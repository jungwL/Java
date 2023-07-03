package javapro.API;

public class StringEx01 {

	public static void main(String[] args) {
		//int num=10;
		//num=20; num+=20;
		
		//String str="대한민국";
		//str+="파이팅";	//str=str+"파이팅"; -> 새로운 번지에 "대한민국파이팅"이 들어가고 그 번지를 str이 참조한다, 메모리 낭비
		
		StringBuilder sb=new StringBuilder();
		sb.append("우리모두");
		sb.append("화이팅");
		System.out.println(sb.toString());
		sb.insert(4, "힘차게");	// 지정한 위치에 추가
		System.out.println(sb.toString());
		sb.setCharAt(7, '파');	// 지정한 위치의 한 글자 수정
		System.out.println(sb.toString());
		sb.replace(4, 7, "아자아자");	//지정한 범위의 문자 바꿈
		System.out.println(sb.toString());
		sb.delete(8, 11);	// 지정한 범위의 문자 삭제
		System.out.println(sb.toString());
		
		String rs=sb.toString();
		System.out.println(rs);
		
	}

}
