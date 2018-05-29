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
      JFrame frame = new JFrame("1vs1");
       frame.setSize(810,810);
       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       frame.setLocationRelativeTo(null);
       JPanel[][] chessBoardSquares = new JPanel[8][8];
       
       String rows = "ABCDEFGH";
       JPanel chessBoard = new JPanel(new GridLayout(0, 9));
	       for (int i = 0; i < chessBoardSquares.length; i++) {
	           for (int j = 0; j < chessBoardSquares[i].length; j++) {
	        	   JPanel b = new JPanel();
	        	   if ((j % 2 == 1 && i % 2 == 1) || (j % 2 == 0 && i % 2 == 0)) {
	        		   b.setBackground(Color.WHITE);
	        	   } 
	        	   else {
	        		   b.setBackground(Color.GRAY);
	        	   }
	        	   chessBoardSquares[j][i] = b;
	           }
	       }
       frame.setResizable(false);//프레임 창 변경 못함
       frame.setVisible(true);

       chessBoard.add(new JLabel(""));
       // fill the top row
       for (int i = 0; i < 8; i++) {
           chessBoard.add(new JLabel(rows.substring(i, i + 1),SwingConstants.CENTER));
       }
       // fill the black non-pawn piece row
       for (int i = 0; i < 8; i++) {
           for (int j = 0; j < 8; j++) {
               switch (j) {
                   case 0:
                       chessBoard.add(new JLabel("" + (i + 1),SwingConstants.CENTER));
                   default:
                       chessBoard.add(chessBoardSquares[j][i]);
                       chessBoardSquares[i][j].setLayout(null);
               }
           }
       }
       //비숍 버튼
       JButton jbPawn = new JButton();
       ImagePanel Pawn = new ImagePanel();
       frame.add(chessBoard);
       Pawn.setLayout(null);
       Pawn.setImage(ChessPieceSprite.getInstace().getChessPiece(ChessPieceSpriteType.BLACK_PAWN));
       jbPawn.setSize(90,90);
       jbPawn.setLocation(0,0);
       
       jbPawn.add(Pawn);
       jbPawn.setBorderPainted(false);
       jbPawn.setContentAreaFilled(false);
       chessBoardSquares[0][1].add(jbPawn);
       ListenerClass listener = new ListenerClass();
       jbPawn.addActionListener(listener);
       //jbBishop.addActionListener(listener);
       
   }

//main method
   public static void main(String[] argv) throws IOException {

      JFrame menu = new JFrame("menu");
	  menu.setDefaultCloseOperation(
			  JFrame.EXIT_ON_CLOSE);
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
				  if(arg0.getActionCommand().equals("1vs1")) {
					  menu.dispose();
					  new ChessMain();
				  }
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
	// Pawn.move;
	// Pawn;
}
}
