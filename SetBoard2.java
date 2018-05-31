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
			setBoard2.board[12][j] = 11;
		setBoard2.board[13][3] = 12; setBoard2.board[13][10] = 12;
		setBoard2.board[13][4] = 13; setBoard2.board[13][9] = 13; 
		setBoard2.board[13][5] = 14; setBoard2.board[13][8] = 14;
		setBoard2.board[13][6] = 16;
		setBoard2.board[13][7] = 15;
		
		// ������ �÷��̾� �� :21 ��:22 ����Ʈ:23 ���:24 ��:25 ŷ:26
		for(int i =3; i<11; i++)
			setBoard2.board[i][12] = 21;
		setBoard2.board[3][13] = 22; setBoard2.board[10][13] = 22;
		setBoard2.board[4][13] = 23; setBoard2.board[9][13] = 23;
 		setBoard2.board[5][13] = 24; setBoard2.board[8][13] = 24;
 		setBoard2.board[6][13] = 26;
		setBoard2.board[7][13] = 25;
		
		// ���� �÷��̾� �� :31 ��:32 ����Ʈ:33 ���:34 ��:35 ŷ:36
		for(int j = 3; j<11; j++)
			setBoard2.board[1][j] = 31;
		setBoard2.board[0][3] = 32; setBoard2.board[0][10] = 32;
		setBoard2.board[0][4] = 33; setBoard2.board[0][9] = 33;
		setBoard2.board[0][5] = 34; setBoard2.board[0][8] = 34;
		setBoard2.board[0][6] = 36;
		setBoard2.board[0][7] = 35;
	}
}
