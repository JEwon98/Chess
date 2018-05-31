package kr.ac.cau.mecs.lenerd.chess;
import java.awt.BorderLayout;
/*
 * >>>> 그래픽
 *       초기 화면을 셋팅하는 클래스
 */
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ContainerEvent;
import java.awt.event.ContainerListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import kr.ac.cau.mecs.lenerd.chess.ChessPieceSprite.ChessPieceSpriteType;
import kr.ac.cau.mecs.lenerd.chess.ChessPieceSprite;
import kr.ac.cau.mecs.lenerd.chess.ImagePanel;

public class SetBoardGraphic extends JFrame{
   /**
    * 
    */
   private static final long serialVersionUID = 5701437994811736232L;
   
   
   public SetBoardGraphic() {
	  Board board = new Board();
      JFrame frame = new JFrame("1vs1");
      frame.setSize(810,810);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setLocationRelativeTo(null);
       
      String rows = "ABCDEFGH";
      JPanel chessBoard = new JPanel(new GridLayout(0, 9));
      
      for (int i = 0; i < board.chessBoardSquares.length; i++) {
         for (int j = 0; j < board.chessBoardSquares[i].length; j++) {
            JPanel b = new JPanel();
            if ((j % 2 == 1 && i % 2 == 1) || (j % 2 == 0 && i % 2 == 0)) {
               b.setBackground(Color.WHITE);
                    } 
                    else {
                       b.setBackground(Color.GRAY);
                    }
            		board.chessBoardSquares[i][j] = b;
                    //Action listener board.boardX = i; board.boardY=y
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
               chessBoard.add(board.chessBoardSquares[i][j]);
               board.chessBoardSquares[i][j].setLayout(null);
            }
         }
      }
      frame.add(chessBoard);

//Black pieces
      
      for(int i=0;i<8;i++) {
         //ImagePanel[] bPawn = new ImagePanel[8];
         board.bPawn[i] = new ImagePanel();
         board.bPawn[i].setImage(ChessPieceSprite.getInstace().getChessPiece(ChessPieceSpriteType.BLACK_PAWN));
         board.chessBoardSquares[6][i].setLayout(new BorderLayout());
         board.chessBoardSquares[6][i].add(board.bPawn[i],BorderLayout.CENTER);
      }
      

      ImagePanel[] bLook = new ImagePanel[2];
      for(int i=0;i<2;i++) {
         bLook[i] = new ImagePanel();
         bLook[i].setImage(ChessPieceSprite.getInstace().getChessPiece(ChessPieceSpriteType.BLACK_LOOK));
      }
      board.chessBoardSquares[7][0].setLayout(new BorderLayout());
      board.chessBoardSquares[7][0].add(bLook[0],BorderLayout.CENTER);
      board.chessBoardSquares[7][7].setLayout(new BorderLayout());
      board.chessBoardSquares[7][7].add(bLook[1],BorderLayout.CENTER);

      ImagePanel[] bKnight = new ImagePanel[2];
      for(int i=0;i<2;i++) {
         bKnight[i] = new ImagePanel();
         bKnight[i].setImage(ChessPieceSprite.getInstace().getChessPiece(ChessPieceSpriteType.BLACK_KNIGHT));
      }
      board.chessBoardSquares[7][1].setLayout(new BorderLayout());
      board.chessBoardSquares[7][6].setLayout(new BorderLayout());
      board.chessBoardSquares[7][1].add(bKnight[0],BorderLayout.CENTER);
      board.chessBoardSquares[7][6].add(bKnight[1],BorderLayout.CENTER);
      
      ImagePanel[]bBishop = new ImagePanel[2];
      for(int i=0;i<2;i++) {
         bBishop[i] = new ImagePanel();
         bBishop[i].setImage(ChessPieceSprite.getInstace().getChessPiece(ChessPieceSpriteType.BLACK_BISHOP));
      }
      board.chessBoardSquares[7][2].setLayout(new BorderLayout());
      board.chessBoardSquares[7][5].setLayout(new BorderLayout());
      board.chessBoardSquares[7][2].add(bBishop[0],BorderLayout.CENTER);
      board.chessBoardSquares[7][5].add(bBishop[1],BorderLayout.CENTER);
      
      ImagePanel bQueen = new ImagePanel();
      bQueen = new ImagePanel();
      bQueen.setImage(ChessPieceSprite.getInstace().getChessPiece(ChessPieceSpriteType.BLACK_QUEEN));
      board.chessBoardSquares[7][4].setLayout(new BorderLayout());
      board.chessBoardSquares[7][4].add(bQueen,BorderLayout.CENTER);
      ImagePanel bKing = new ImagePanel();
      bKing = new ImagePanel();
      bKing.setImage(ChessPieceSprite.getInstace().getChessPiece(ChessPieceSpriteType.BLACK_KING));
      board.chessBoardSquares[7][3].setLayout(new BorderLayout());
      board.chessBoardSquares[7][3].add(bKing,BorderLayout.CENTER);
// white
      for(int i=0;i<8;i++) {
         ImagePanel[] wpawn = new ImagePanel[8];
         wpawn[i] = new ImagePanel();
         wpawn[i].setImage(ChessPieceSprite.getInstace().getChessPiece(ChessPieceSpriteType.WHITE_PAWN));
         board.chessBoardSquares[1][i].setLayout(new BorderLayout());
         board.chessBoardSquares[1][i].add(wpawn[i],BorderLayout.CENTER);
      }
      

      ImagePanel[] wLook = new ImagePanel[2];
      for(int i=0;i<2;i++) {
         wLook[i] = new ImagePanel();
         wLook[i].setImage(ChessPieceSprite.getInstace().getChessPiece(ChessPieceSpriteType.WHITE_LOOK));
      }
      board.chessBoardSquares[0][0].setLayout(new BorderLayout());
      board.chessBoardSquares[0][0].add(wLook[0],BorderLayout.CENTER);
      board.chessBoardSquares[0][7].setLayout(new BorderLayout());
      board.chessBoardSquares[0][7].add(wLook[1],BorderLayout.CENTER);

      ImagePanel[] wKnight = new ImagePanel[2];
      for(int i=0;i<2;i++) {
         wKnight[i] = new ImagePanel();
         wKnight[i].setImage(ChessPieceSprite.getInstace().getChessPiece(ChessPieceSpriteType.WHITE_KNIGHT));
      }
      board.chessBoardSquares[0][1].setLayout(new BorderLayout());
      board.chessBoardSquares[0][6].setLayout(new BorderLayout());
      board.chessBoardSquares[0][1].add(wKnight[0],BorderLayout.CENTER);
      board.chessBoardSquares[0][6].add(wKnight[1],BorderLayout.CENTER);
      
      ImagePanel[]wbishop = new ImagePanel[2];
      for(int i=0;i<2;i++) {
         wbishop[i] = new ImagePanel();
         wbishop[i].setImage(ChessPieceSprite.getInstace().getChessPiece(ChessPieceSpriteType.WHITE_BISHOP));
      }
      board.chessBoardSquares[0][2].setLayout(new BorderLayout());
      board.chessBoardSquares[0][5].setLayout(new BorderLayout());
      board.chessBoardSquares[0][2].add(wbishop[0],BorderLayout.CENTER);
      board.chessBoardSquares[0][5].add(wbishop[1],BorderLayout.CENTER);
      
      ImagePanel wQueen = new ImagePanel();
      wQueen = new ImagePanel();
      wQueen.setImage(ChessPieceSprite.getInstace().getChessPiece(ChessPieceSpriteType.WHITE_QUEEN));
      board.chessBoardSquares[0][3].setLayout(new BorderLayout());
      board.chessBoardSquares[0][3].add(wQueen,BorderLayout.CENTER);
      ImagePanel wKing = new ImagePanel();
      wKing = new ImagePanel();
      wKing.setImage(ChessPieceSprite.getInstace().getChessPiece(ChessPieceSpriteType.WHITE_KING));
      board.chessBoardSquares[0][4].setLayout(new BorderLayout());
      board.chessBoardSquares[0][4].add(wKing,BorderLayout.CENTER);
   }

}
class mouseListener implements MouseListener{
	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		Board board = new Board();
		JPanel b= (JPanel)e.getSource();
		for(int i=0;i<8;i++) {
			for(int j=0;j<8;j++) {
				if(board.chessBoardSquares[i][j] == b) {
					board.boardX=i;
					board.boardY=j;
					System.out.printf("%d, %d\n", board.boardX,board.boardY);
					Board Board = new Board();
					if((Board.board[Board.boardX][Board.boardY]%10) == 1) {
						Board.chessBoardSquares[Board.boardX-1][Board.boardY].setBackground(Color.GREEN);
						Board.chessBoardSquares[Board.boardX-2][Board.boardY].setBackground(Color.GREEN);
					}
				}
			}
		}
	}
	@Override
	public void mouseEntered(MouseEvent arg0) {// TODO Auto-generated method stub
	}
	@Override
	public void mouseExited(MouseEvent arg0) {// TODO Auto-generated method stub
	}
	@Override
	public void mousePressed(MouseEvent arg0) {// TODO Auto-generated method stub
	}
	@Override
	public void mouseReleased(MouseEvent arg0) {	// TODO Auto-generated method stub
	}
}
