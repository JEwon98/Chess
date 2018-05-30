package kr.ac.cau.mecs.lenerd.chess;

import kr.ac.cau.mecs.lenerd.chess.ChessPieceSprite;
import kr.ac.cau.mecs.lenerd.chess.ChessPieceSprite.ChessPieceSpriteType;
import kr.ac.cau.mecs.lenerd.chess.ImagePanel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.event.*;

public class ChessMain extends JFrame{
	//체스판 띄우기
	public ChessMain() throws IOException {
		new SetBoardGraphic(); // 초기화면 셋팅
	}

//main method
public static void main(String[] argv) throws IOException {

	JFrame menu = new JFrame("menu");
	menu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	menu.setSize(700,600);
	menu.setLocationRelativeTo(null);
	menu.setVisible(true);
	JButton OvO = new JButton("1vs1"); //일대일 버튼
	OvO.setSize(200,200);
	OvO.setLocation(100,200);
	OvO.setVisible(true);
	JButton Exit = new JButton("Exit");
	Exit.setSize(200,200);
	Exit.setLocation(400,200);
//exit listener
	Exit.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent arg0) {
			menu.dispose();
		}
	}
			);	  
	Exit.setVisible(true);
	//1 vs 1 listener	  
	OvO.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent arg0) {
			try {
				menu.dispose();
				new ChessMain();
			} catch (IOException e) {
// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
			);
	menu.add(OvO);
	menu.add(Exit);
//int board에 초기 체스판 값 대입
	new SetBoard();
	  /* setBoard 클래스로 값들이 잘 저장 되었는지 확인하는 문장
	   * 확인하고 싶으면 주석 없에서 확인해봐도 됨
	   Board chess= new Board();
	  for(int i=0;i<8;i++) {
		  for(int j=0;j<8;j++) {
			  System.out.print(Board.board[i][j]);
		  }
		  System.out.println("");
	  }
	  */
	}

}
	
class ListenerClass implements ActionListener{
public void actionPerformed(ActionEvent e) {
	System.out.println("The Pawn is clicked");
	// Piece.move;
	// Pawn;
}
}
