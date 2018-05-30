package kr.ac.cau.mecs.lenerd.chess;

public class Queen {
	static int[][] board = new int[8][8];
	public Queen() {
		
	}
	public static void Queen_move(int x, int y) {
		int p = 0, q = 0;
	     p = x-1; q = y+1;
	     for(;p>=0;p--,q++){
	       if(q<8) 
	         System.out.printf("%d %d ", p, q);
	       }
	     p = x-1; q = y-1;
	     for(;p>=0;p--,q--){
	       if(q>=0) 
	         System.out.printf("%d %d ",p,q);
	     }
	     p = x+1; q = y-1;
	     for(;q>=0;p++,q--){
	       if(p<8) 
	         System.out.printf("%d %d ",p,q);
	     }
	     p = x+1; q = y+1;
	     for(;q<8;p++,q++){
	       if(p<8) 
	         System.out.printf("%d %d ",p,q);
	     }
	     for(int i = 0;i < x;i++) 
	    	 System.out.printf("%d %d ",i,y);
	     for(int i = x+1;i<8;i++)
	    	 System.out.printf("%d %d ",i,y);
	     for(int j = 0;j < y;j++)
	    	 System.out.printf("%d %d ",x,j);
	     for(int j = y+1;j <8;j++)
	    	 System.out.printf("%d %d ",x,j);
	}
}
