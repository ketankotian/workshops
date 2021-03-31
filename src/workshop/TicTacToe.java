package workshop;

import java.util.Scanner;

public class TicTacToe {

	static char[] board = new char[10];

	public static void main(String[] args) {
		boardInitialization();
	}

	// board initialization
	static void boardInitialization() {

		for (int i = 1; i < board.length; i++) {
			board[i] = ' ';
		}
	}

}
