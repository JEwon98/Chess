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
	
	JPanel Menu = new JPanel(); 
	Menu.setLayout(new FlowLayout(FlowLayout.LEADING, 20, 20));
    Menu.setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY, 2));
    menu.add(Menu);
    Menu.setVisible(true);
	JButton OvO = new JButton("1vs1");//일대일 버튼
	OvO.setVisible(true);
	JButton tvt = new JButton("2vs2"); //이대이 버튼
	tvt.setVisible(true);
	JButton Exit = new JButton("Exit");
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
	tvt.addActionListener(new ActionListener() {
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
	Menu.add(tvt);
	Menu.add(Exit);
	menu.setVisible(true);
	new SetBoard();
	}

}
	


