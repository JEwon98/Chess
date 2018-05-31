package kr.ac.cau.mecs.lenerd.chess;

import javax.swing.JPanel;

//현재 판의 상태 정적 변수

public class Board {
	public static JPanel[][] chessBoardSquares = new JPanel[8][8];
	public static int[][] board = new int[8][8];
	public static int[][] board2 = new int[14][14];
	public static int boardX,boardY;
	public static ImagePanel[] bPawn = new ImagePanel[8];
}
