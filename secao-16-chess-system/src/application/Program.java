package application;

import chess.ChessMatch;

public class Program {

	public static void main(String[] args) {
		ChessMatch chassmatch = new ChessMatch();
		
		UI.printBoard(chassmatch.getPieces());
	}

}
