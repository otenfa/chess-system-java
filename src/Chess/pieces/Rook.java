package Chess.pieces;

import Bordergame.Board;
import Chess.ChessPiece;
import Chess.Color;

public class Rook extends ChessPiece{

	public Rook(Board board, Color color) {
		super(board, color);
	}
	
	@Override
	public String toString() {
		return "R";
	}

}