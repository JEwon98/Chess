package kr.ac.cau.mecs.lenerd.chess;

import java.io.IOException;

public class SetBoard {//ü���� �ʱ� ������ board[][] �� �������ִ� Ŭ����
	public SetBoard() throws IOException{
		Board setBoard = new Board();
		//��� ��:11 ��:12  ����Ʈ:13 ���:14 ��:15 ŷ:16
		for(int i=0;i<8;i++) 
			setBoard.board1[1][i]=11;
		setBoard.board1[0][0]=12; setBoard.board1[0][7]=12;
		setBoard.board1[0][1]=13; setBoard.board1[0][6]=13;
		setBoard.board1[0][2]=14; setBoard.board1[0][5]=14;
		setBoard.board1[0][3]=16; 
		setBoard.board1[0][4]=15;
		
		//��� ��:1 ��:2  ����Ʈ:3 ���:4 ��:5 ŷ:6
		for(int i=0;i<8;i++)
			setBoard.board1[6][i]=1;
		setBoard.board1[7][0]=2; setBoard.board1[7][7]=2;
		setBoard.board1[7][1]=3; setBoard.board1[7][6]=3;
		setBoard.board1[7][2]=4; setBoard.board1[7][5]=4;
		setBoard.board1[7][3]=6; 
		setBoard.board1[7][4]=5;
	}
}
