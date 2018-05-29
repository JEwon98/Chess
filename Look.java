package kr.ac.cau.mecs.lenerd.chess;

public class Look {

	int[][] board = new int[8][8];
	int n,m;
	
	public Look()
	{
		
	}
	
	public void Lookmove(int x,int y)
	{
		n = 7-x; m = 7-y;
		for(x = x-1; x >= 0; x--)
		{
			if(board[x][y] == 0)
				System.out.printf("%d %d ",x,y);
		}
		for(x = 7-n+1; x <=7; x++)
		{
			if(board[x][y] == 0)
				System.out.printf("%d %d ", x,y);
		}
		for(y = y-1, x = 7-n; y>= 0; y--) {
			if(board[x][y] == 0)
				System.out.printf("%d %d ", x,y);
		}
		for(y = 7 -m+1; y <= 7; y++) {
			if(board[x][y] == 0)
				System.out.printf("%d %d ", x,y);
		}
	}
}
