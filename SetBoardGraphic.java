package kr.ac.cau.mecs.lenerd.chess;
/*
 * >>>> 그래픽
 * 		초기 화면을 셋팅하는 클래스
 */
import java.awt.Color;
import java.awt.GridLayout;
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
	        	   	chessBoardSquares[i][j] = b;
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
					chessBoard.add(chessBoardSquares[i][j]);
					chessBoardSquares[i][j].setLayout(null);
				}
			}
		}
		frame.add(chessBoard);

//Black pieces
		JButton[] jbPawn = new JButton[8];
		JPanel jp = new JPanel();
		for(int i=0;i<8;i++) {
			jp.add(jbPawn[i]=new JButton());
			ImagePanel Pawn = new ImagePanel();
			Pawn.setLayout(null);
			Pawn.setImage(ChessPieceSprite.getInstace().getChessPiece(ChessPieceSpriteType.BLACK_PAWN));
			jbPawn[i].setSize(90,90);	jbPawn[i].setLocation(0,0);
			jbPawn[i].add(Pawn);
			jbPawn[i].setBorderPainted(false);	jbPawn[i].setContentAreaFilled(false);
			chessBoardSquares[6][i].add(jbPawn[i]); 
		}
		JButton[] jbRook = new JButton[2];
		for(int i=0;i<2;i++) {
			jp.add(jbRook[i]=new JButton());
			ImagePanel Rook = new ImagePanel();
			Rook.setLayout(null);
			Rook.setImage(ChessPieceSprite.getInstace().getChessPiece(ChessPieceSpriteType.BLACK_LOOK));
			jbRook[i].setSize(90,90);	jbRook[i].setLocation(0,0);
			jbRook[i].add(Rook);
			jbRook[i].setBorderPainted(false);	jbRook[i].setContentAreaFilled(false);
		}
		chessBoardSquares[7][0].add(jbRook[0]); chessBoardSquares[7][7].add(jbRook[1]);
		JButton[] jbKnight = new JButton[2];
		for(int i=0;i<2;i++) {
			jp.add(jbKnight[i]=new JButton());
			ImagePanel Knight = new ImagePanel();
			Knight.setLayout(null);
			Knight.setImage(ChessPieceSprite.getInstace().getChessPiece(ChessPieceSpriteType.BLACK_KNIGHT));
			jbKnight[i].setSize(90,90);	jbKnight[i].setLocation(0,0);
			jbKnight[i].add(Knight);
			jbKnight[i].setBorderPainted(false);	jbKnight[i].setContentAreaFilled(false);
		}
		chessBoardSquares[7][1].add(jbKnight[0]); chessBoardSquares[7][6].add(jbKnight[1]);
		JButton[] jbBishop = new JButton[2];
		for(int i=0;i<2;i++) {
			jp.add(jbBishop[i]=new JButton());
			ImagePanel Bishop = new ImagePanel();
			Bishop.setLayout(null);
			Bishop.setImage(ChessPieceSprite.getInstace().getChessPiece(ChessPieceSpriteType.BLACK_BISHOP));
			jbBishop[i].setSize(90,90);	jbBishop[i].setLocation(0,0);
			jbBishop[i].add(Bishop);
			jbBishop[i].setBorderPainted(false);	jbBishop[i].setContentAreaFilled(false);
		}
		chessBoardSquares[7][2].add(jbBishop[0]); chessBoardSquares[7][5].add(jbBishop[1]);
		JButton jbQueen = new JButton();
		ImagePanel Queen = new ImagePanel();
		Queen.setLayout(null);
		Queen.setImage(ChessPieceSprite.getInstace().getChessPiece(ChessPieceSpriteType.BLACK_QUEEN));
		jbQueen.setSize(90,90);	jbQueen.setLocation(0,0);
		jbQueen.add(Queen);
		jbQueen.setBorderPainted(false);	jbQueen.setContentAreaFilled(false);
		chessBoardSquares[7][4].add(jbQueen);
		JButton jbKing = new JButton();
		ImagePanel King = new ImagePanel();
		King.setLayout(null);
		King.setImage(ChessPieceSprite.getInstace().getChessPiece(ChessPieceSpriteType.BLACK_KING));
		jbKing.setSize(90,90);	jbKing.setLocation(0,0);
		jbKing.add(King);
		jbKing.setBorderPainted(false);	jbKing.setContentAreaFilled(false);
		chessBoardSquares[7][3].add(jbKing);

//white pieces
		JButton[] jbPawnW = new JButton[8];
		for(int i=0;i<8;i++) {
			jp.add(jbPawnW[i]=new JButton());
			ImagePanel Pawn = new ImagePanel();
			Pawn.setLayout(null);
			Pawn.setImage(ChessPieceSprite.getInstace().getChessPiece(ChessPieceSpriteType.WHITE_PAWN));
			jbPawnW[i].setSize(90,90);	jbPawnW[i].setLocation(0,0);
			jbPawnW[i].add(Pawn);
			jbPawnW[i].setBorderPainted(false);	jbPawnW[i].setContentAreaFilled(false);
			chessBoardSquares[1][i].add(jbPawnW[i]); 
		}
		JButton[] jbRookW = new JButton[2];
		for(int i=0;i<2;i++) {
			jp.add(jbRookW[i]=new JButton());
			ImagePanel Rook = new ImagePanel();
			Rook.setLayout(null);
			Rook.setImage(ChessPieceSprite.getInstace().getChessPiece(ChessPieceSpriteType.WHITE_LOOK));
			jbRookW[i].setSize(90,90);	jbRook[i].setLocation(0,0);
			jbRookW[i].add(Rook);
			jbRookW[i].setBorderPainted(false);	jbRookW[i].setContentAreaFilled(false);
		}
		chessBoardSquares[0][0].add(jbRookW[0]); chessBoardSquares[0][7].add(jbRookW[1]);
		JButton[] jbKnightW = new JButton[2];
		for(int i=0;i<2;i++) {
			jp.add(jbKnightW[i]=new JButton());
			ImagePanel Knight = new ImagePanel();
			Knight.setLayout(null);
			Knight.setImage(ChessPieceSprite.getInstace().getChessPiece(ChessPieceSpriteType.WHITE_KNIGHT));
			jbKnightW[i].setSize(90,90);	jbKnightW[i].setLocation(0,0);
			jbKnightW[i].add(Knight);
			jbKnightW[i].setBorderPainted(false);	jbKnightW[i].setContentAreaFilled(false);
		}
		chessBoardSquares[0][1].add(jbKnightW[0]); chessBoardSquares[0][6].add(jbKnightW[1]);
		JButton[] jbBishopW = new JButton[2];
		for(int i=0;i<2;i++) {
			jp.add(jbBishopW[i]=new JButton());
			ImagePanel Bishop = new ImagePanel();
			Bishop.setLayout(null);
			Bishop.setImage(ChessPieceSprite.getInstace().getChessPiece(ChessPieceSpriteType.WHITE_BISHOP));
			jbBishopW[i].setSize(90,90);	jbBishopW[i].setLocation(0,0);
			jbBishopW[i].add(Bishop);
			jbBishopW[i].setBorderPainted(false);	jbBishopW[i].setContentAreaFilled(false);
		}
		chessBoardSquares[0][2].add(jbBishopW[0]); chessBoardSquares[0][5].add(jbBishopW[1]);
		JButton jbQueenW = new JButton();
		ImagePanel QueenW = new ImagePanel();
		QueenW.setLayout(null);
		QueenW.setImage(ChessPieceSprite.getInstace().getChessPiece(ChessPieceSpriteType.WHITE_QUEEN));
		jbQueenW.setSize(90,90);	jbQueenW.setLocation(0,0);
		jbQueenW.add(QueenW);
		jbQueenW.setBorderPainted(false);	jbQueenW.setContentAreaFilled(false);
		chessBoardSquares[0][4].add(jbQueenW);
		JButton jbKingW = new JButton();
		ImagePanel KingW = new ImagePanel();
		KingW.setLayout(null);
		KingW.setImage(ChessPieceSprite.getInstace().getChessPiece(ChessPieceSpriteType.WHITE_KING));
		jbKingW.setSize(90,90);	jbKingW.setLocation(0,0);
		jbKingW.add(KingW);
		jbKingW.setBorderPainted(false);	jbKingW.setContentAreaFilled(false);
		chessBoardSquares[0][3].add(jbKingW);
		ListenerClass listener = new ListenerClass();
		jbPawn[0].addActionListener(listener);
	}
}


