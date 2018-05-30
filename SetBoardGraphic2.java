package kr.ac.cau.mecs.lenerd.chess;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class SetBoardGraphic2 extends JFrame {

	// private static final long serialVersionUID = 5701437994811736232L;
	int n = 0,m= 0;
	
	public SetBoardGraphic2() {
		JFrame frame = new JFrame("2vs2");
		frame.setSize(810,810);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		JPanel[][] chessBoardSquares = new JPanel[14][14];
		
		String rows = "ABCDEFGHIJKLMNOP";
		JPanel chessBoard = new JPanel(new GridLayout(0,15));
				
		for (int i = 0; i < chessBoardSquares.length; i++) {
			for (int j = 0; j < chessBoardSquares[i].length; j++) {
				JPanel b = new JPanel();
				if((i % 2 == 1 && j % 2 ==1 ) || (i % 2 == 0 && j % 2 == 0)) {
					if((i<=2 && j <=2) || (i<=2 && j>=11) || (i>=11 && j<=2) || (i>=11 && j>=11)) {
					}
					else {
						b.setBackground(Color.WHITE);
					}
				}
				else {
					if((i<=2 && j <=2) || (i<=2 && j>=11) || (i>=11 && j<=2) || (i>=11 && j>=11)) {
					}
					else {
					b.setBackground(Color.GRAY);
					}
				}
				chessBoardSquares[i][j] = b;
			}
		} 
		frame.setResizable(false);
		frame.setVisible(true);
		
		chessBoard.add(new JLabel(""));
		for (int i = 0; i<14; i++) {
			chessBoard.add(new JLabel(rows.substring(i,i+1),SwingConstants.CENTER));
		}
		
		for (int i = 0; i<14; i++) {
			for (int j = 0; j<14; j++) {
				switch(j) {
				case 0:
					chessBoard.add(new JLabel(""+ (i+1),SwingConstants.CENTER));
				default:
					chessBoard.add(chessBoardSquares[i][j]);
					chessBoardSquares[i][j].setLayout(null);
				}		
			}
		}
		frame.add(chessBoard);
	}
}
