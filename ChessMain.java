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
		new SetBoard();
		new SetBoardGraphic(); // 초기화면 셋팅
		new Move();
	}

//main method
public static void main(String[] argv) throws IOException {
 
	JFrame menu = new JFrame("menu");
	menu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	menu.setSize(700,600);
	menu.setLocationRelativeTo(null);
	menu.setLayout(new GridLayout(2,1,0,0));
	
	// 메뉴판 꾸미기
	
	ImageIcon photo = new ImageIcon("board.png");
	JLabel image = new JLabel(photo); 
	image.setVisible(true);
	menu.add(image);
	
	
	
	JPanel Menu = new JPanel(); 
	Menu.setLayout(null);
    menu.add(Menu);
    Menu.setVisible(true);
	JButton OvO = new JButton("1vs1");//일대일 버튼
	OvO.setSize(150,100);
	OvO.setLocation(50,100);
	
	OvO.setVisible(true);
	JButton TvT = new JButton("2vs2"); //이대이 버튼
	TvT.setSize(150,100);
	TvT.setLocation(250,100);
	TvT.setVisible(true);
	JButton Exit = new JButton("Exit");
	Exit.setSize(150,100);
	Exit.setLocation(450,100);
//exit listener
	Exit.addActionListener(new ActionListener()
	{
		public void actionPerformed(ActionEvent arg0) {
			
			menu.dispose();
		}
	}
			);	  
	Exit.setVisible(true);  
	OvO.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent arg0) {
			try {
				menu.dispose();
				new ChessMain();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}
			);
	TvT.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent arg0 ) {
 /*try {
			menu.dispose();
			new ChessMain();
		} catch (IOException e) {
			e.printStackTrace();
		} */
		menu.dispose();
		new SetBoardGraphic2();
	
		}
	}
	);
	Menu.add(OvO);
	Menu.add(TvT);
	Menu.add(Exit);
	menu.setVisible(true);
	//new SetBoard();

	}

}
	


