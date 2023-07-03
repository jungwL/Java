package javapro.reference;
/**
 * 1. 첫 행 중간열에 1을 넣는다
 * 2. 대각선 위로 이동한다(/)
 * 3. 행이 존재하지 않을 경우에는 마지막행에 다음 값을 넣는다
 * 4. 열이 존재하지 않을 경우에는 첫 열에 다음 값을 넣는다
 * 5. 값이 존재할 경우 행+2, 열-1로 이동한 후 다음 값을 넣는다
 * 6. 행, 열이 모두 존재하지 않을 경우 행+2, 열-1로 이동한 후 다음 값을 넣는다
 * 7. 2번으로 올라가 반복한다
 */
public class ArrayEx08 {

	public static void main(String[] args) {
		int[][] magic=new int[5][5];
		int row, col;	// 행, 열
		int num=1;		//값
		row=0;			// 첫 행
		col=magic[0].length/2;
		magic[row][col]=num;	// 첫 행 중간열에 1을 넣는다
		
		for(num=2; num<=magic.length*magic[0].length; num++) {
			// 대각선 위로 이동
			row--;
			col++;
			
			// 이 조건을 마지막에 실행할 경우 배열 길이를 벗어나 에러 발생하므로 가장 먼저 실행
			if(row<0 && col==magic[0].length) {	// 행, 열이 모두 존재하지 않을 경우
				row+=2;
				col--;
			}
			if(row<0) { // 행이 존재하지 않을 경우
				row=magic.length-1;	//마지막 행
			}
			if(col==magic[0].length) {	// 열이 존재하지 않을 경우
				col=0;	// 첫 열
			}
			if(magic[row][col]!=0) {	// 값이 존재할 경우
				row+=2;		// 행+2
				col--;		// 열-1
			}
			
			magic[row][col]=num;
		}//for end
		
		for(int r=0; r<magic.length; r++) {
			for(int c=0; c<magic[r].length; c++) {
				if(magic[r][c]<10) {
					System.out.print(" ");
				}
				System.out.print(magic[r][c]+" ");
			}
			System.out.println();
		}//for end
	}

}
