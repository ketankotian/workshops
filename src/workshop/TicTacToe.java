package workshop;

import java.util.Random;
import java.util.Scanner;

public class TicTacToe {

	static char[] board = new char[10];
	static Scanner sc = new Scanner(System.in);
	static Random r = new Random();
	static char mark,user,pc;

	public static void main(String[] args) {
		boardInitialization();
		selectMark();
		showBoard(board);
		move(board);
	}

	// board initialization
	static void boardInitialization() {
		for (int i = 1; i < board.length; i++) {
			board[i] = ' ';
		}
	}

	// selection of x or o
	public static void selectMark() {
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

	// moving to index making sure its free
	static void move(char[] board) {
		System.out.println("Enter slot 0-9 : ");
		int slot = sc.nextInt();
		if (board[slot] == ' ') {
			System.out.println("Slot is free ");
			selectMark();
			board[slot] = mark;
		} else
			System.out.println("Slot is occupied please select other ");
		showBoard(board);

	}
	
	//
	static void firstPlay() {
		int turn=r.nextInt(2);
		if(turn==0)
			System.out.println("User plays First");
		else
			System.out.println("Computer plays First");
	}
}
