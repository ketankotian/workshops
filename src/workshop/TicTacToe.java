package workshop;

import java.util.Scanner;

public class TicTacToe {

	static char[] board = new char[10];
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		boardInitialization();
		selectMark();
		showBoard(board);
	}

	// board initialization
	static void boardInitialization() {
		for (int i = 1; i < board.length; i++) {
			board[i] = ' ';
		}
	}

	// selection of x or o
	public static void selectMark() {
		char mark;
		System.out.println("Choose symbol X or O");
		mark = sc.next().charAt(0);

	}

	// displaying board
	static void showBoard(char[] board) {
		System.out.println("| " + board[1] + " | " + board[2] + " | " + board[3] + " |");
		System.out.println("|-----------|");
		System.out.println("| " + board[4] + " | " + board[5] + " | " + board[6] + " |");
		System.out.println("|-----------|");
		System.out.println("| " + board[7] + " | " + board[8] + " | " + board[9] + " |");
	}

}
