package kr.ac.cau.mecs.lenerd.chess;

import java.io.IOException;

public class SetBoard2 {
	public SetBoard2() throws IOException {
		Board setBoard2 = new Board();
		// ���� �÷��̾� ��:1 ��:2 ����Ʈ:3 ���:4 ��:5 ŷ:6
		for(int i = 3; i<11; i++) 
			setBoard2.board[i][1]= 1;
		setBoard2.board[3][0] = 2; setBoard2.board[10][0] = 2; 
		setBoard2.board[4][0] = 3; setBoard2.board[9][0] = 3;
		setBoard2.board[5][0] = 4; setBoard2.board[8][0] = 4;
		setBoard2.board[6][0] = 6;
		setBoard2.board[7][0] = 5;
	
		// �Ʒ��� �÷��̾� �� :11 ��:12 ����Ʈ:13 ���:14 ��:15 ŷ:16
		for(int j = 3; j<11; j++)
			setBoard2.board[11][j] = 11;
		setBoard2.board[10][3] = 12; setBoard2.board[10][10] = 12;
		setBoard2.board[10][4] = 13; setBoard2.board[10][9] = 13; 
		setBoard2.board[10][5] = 14; setBoard2.board[10][8] = 14;
		setBoard2.board[10][6] = 16;
		setBoard2.board[10][7] = 15;
		
		// ������ �÷��̾� �� :21 ��:22 ����Ʈ:23 ���:24 ��:25 ŷ:26
		
	}
}
