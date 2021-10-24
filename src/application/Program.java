package application;

import chess.ChessMatch;

public class Program {

	public static void main(String[] args) {
		
		// CURTA - Isso vai me ajudar muito!
		
		ChessMatch chessMatch = new ChessMatch();
		UI.printBoard(chessMatch.getPieces());
		
	}
}
