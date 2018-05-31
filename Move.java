package kr.ac.cau.mecs.lenerd.chess;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class Move {
	public Move() {
		Board Board = new Board();
	    mouseListener listener = new mouseListener();
	    for(int i=0;i<8;i++) {
	    	for(int j=0;j<8;j++) {
	    		Board.chessBoardSquares[i][j].addMouseListener(listener);
	    	}
	    }
	    if(Board.board[Board.boardX][Board.boardY]==11) {
    		Board.chessBoardSquares[Board.boardX][Board.boardY].remove(Board.chessBoardSquares[Board.boardX][Board.boardY]);
    		Board.chessBoardSquares[Board.boardX][Board.boardY].repaint();
		    for(int i=0;i<8;i++) {
		    	for(int j=0;j<8;j++) {
		    		Board.chessBoardSquares[i][j].addMouseListener(listener);
		    	}
		    }
	    }
		else if(Board.board[Board.boardX][Board.boardY]==12) {
	    	
	    }
	}
}
