package workshop;

import java.util.Scanner;

public class TicTacToe {

	static char[] board = new char[10];
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		boardInitialization();
		selectMark();
	}

	// board initialization
	static void boardInitialization() {

		for (int i = 1; i < board.length; i++) {
			board[i] = ' ';
		}
	}

	// selection x or o
	public static void selectMark() {
		char mark;
		System.out.println("Choose symbol X or O");
		mark = sc.next().charAt(0);

	}

}
