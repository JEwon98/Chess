package kr.ac.cau.mecs.lenerd.chess;

import java.io.IOException;

public class SetBoard {//체스판 초기 상태의 board[][] 값 지정해주는 클래스
	public SetBoard() throws IOException{
		Board setBoard = new Board();
		//백색 폰:11 룩:12  나이트:13 비숍:14 퀸:15 킹:16
		for(int i=0;i<8;i++) 
			setBoard.board[1][i]=11;
		setBoard.board[0][0]=12; setBoard.board[0][7]=12;
		setBoard.board[0][1]=13; setBoard.board[0][6]=13;
		setBoard.board[0][2]=14; setBoard.board[0][5]=14;
		setBoard.board[0][3]=16; 
		setBoard.board[0][4]=15;
		
		//흑색 폰:1 룩:2  나이트:3 비숍:4 퀸:5 킹:6
		for(int i=0;i<8;i++)
			setBoard.board[6][i]=1;
		setBoard.board[7][0]=2; setBoard.board[7][7]=2;
		setBoard.board[7][1]=3; setBoard.board[7][6]=3;
		setBoard.board[7][2]=4; setBoard.board[7][5]=4;
		setBoard.board[7][3]=6; 
		setBoard.board[7][4]=5;
	}
}
