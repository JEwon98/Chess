package kr.ac.cau.mecs.lenerd.chess;

public class King {
	static int[][] board = new int[8][8];
	public King() {
		
	}
	public static void King_move(int x,int y) {
		for (int i = -1; i <= 1; i++){
			for (int j = -1; j <= 1;j++) {
				if((i!= 0) || (j != 0))
					System.out.printf("%d %d",x+i,y+j);
			}
		}
	}
}