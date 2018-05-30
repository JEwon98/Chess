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
	//ü���� ����
	public ChessMain() throws IOException {
		new SetBoardGraphic(); // �ʱ�ȭ�� ����
	}

//main method
public static void main(String[] argv) throws IOException {

	JFrame menu = new JFrame("menu");
	menu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	menu.setSize(700,600);
	menu.setLocationRelativeTo(null);
	menu.setVisible(true);
	JButton OvO = new JButton("1vs1"); //�ϴ��� ��ư
	OvO.setSize(200,100);
	OvO.setLocation(50,200);
	OvO.setVisible(true);
	JButton tvt = new JButton("2vs2"); //�̴��� ��ư
	tvt.setSize(200,100);
	tvt.setLocation(250,200);
	tvt.setVisible(true);
	JButton Exit = new JButton("Exit");
	Exit.setSize(200,100);
	Exit.setLocation(450,200);
//exit listener
	Exit.addActionListener(new ActionListener()
	{
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
	tvt.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent arg0 ) {
			try {
				menu.dispose();
				new ChessMain();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	);
	menu.add(OvO);
	menu.add(tvt);
	menu.add(Exit);
//int board�� �ʱ� ü���� �� ����
	new SetBoard();
	  /* setBoard Ŭ������ ������ �� ���� �Ǿ����� Ȯ���ϴ� ����
	   * Ȯ���ϰ� ������ �ּ� ������ Ȯ���غ��� ��
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
