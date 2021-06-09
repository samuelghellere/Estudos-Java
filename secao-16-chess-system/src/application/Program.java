package application;

import java.util.Scanner;

import chess.ChessMatch;
import chess.ChessPiece;
import chess.ChessPosition;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ChessMatch chassmatch = new ChessMatch();
		
		while (true) {
			UI.printBoard(chassmatch.getPieces());
			System.out.println();
			System.out.print("Source: ");
			
			ChessPosition source = UI.readChessPosition(sc);
			System.out.println();
			System.out.print("Target: ");
			ChessPosition target = UI.readChessPosition(sc);
			
			ChessPiece capturedPiece = chassmatch.performChessMove(source,target);
		}
	}

}
