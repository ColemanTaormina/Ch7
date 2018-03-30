//Coleman Taormina
//Tic Tac Toe
//12/8/17



import java.util.Scanner;

public class TicTacToe {
	static char[][] board = new char[3][3];
	static Scanner in = new Scanner(System.in);
	static boolean playerXTurn = true;
	static boolean whilePlaying = true;

	private static String[][] myBoy = { { "  |", "   ", "  |" }, { "  |", "   ", "  |" }, { "  |", "   ", "  |" } };

	// creation of my 2D array that I will replace useless filler " |", " ", " |"
	// with below code
	// Gavin created global variables and explained there usage
	public static void main(String[] args) {

		// the code is a replacement loop
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[0].length; j++) {
				board[i][j] = '_';
			}
		}
		// the code loops allowing all of the values of the 2D array to become a '_'
		// that will be checked against the X or O that will be placed in its position

		printBoard();
		// just to see board
		while (whilePlaying) {

			// we begin by using the first global variable that works while
			// true-when we are playing with no winner and continues to call the methods
			// till the game ends
			choosePoint();
			// we pick a chosen point to put our players letter X or O in using
			// x axis: 0,1,2 and y axis:0,1,2
			printBoard();
			// prints out the position of the chosen player and other turns prior
			checkWin();
			// the board is every turn check to see if a win condition has occurred
			// if no win condition has occurred then the loop continues unless no spaces
			// left
			// and checks if there are no spaces left to end the game
		}

	}

	public static void checkWin() {
		// checks all the horizontal values in the game to see if there is a horizontal
		// win
		for (int i = 0; i < board.length; i++) {
			if ((board[i][0] == board[i][1] && board[i][0] == board[i][2]) && board[i][0] != '_') {
				System.out.print("Player ");
				System.out.println(board[i][0] + " won!1");
				// the 1 in the sys.out.print is to show/ check what allowed the win
				whilePlaying = false;
				// whilePlaying turned false cause the game to end
			}
		}
		// checks all the vertical values in the game to see if there is a vertical win
		for (int i = 0; i < board.length; i++) {
			if ((board[0][i] == board[1][i] && board[0][i] == board[2][i]) && board[0][i] != '_') {
				System.out.print("Player ");
				System.out.println(board[0][i] + " won!2");
				// the 2 in the sys.out.print is to show/ check what allowed the win
				whilePlaying = false;
				// whilePlaying turned false cause the game to end
			}
		}
		// checks to see if there is a diagonal win from top left to bottom right
		if ((board[0][0] == board[1][1]) && (board[0][0] == board[2][2]) && board[0][0] != '_') {
			System.out.print("Player ");
			System.out.println(board[0][0] + " won!3");
			// the 3 in the sys.out.print is to show/ check what allowed the win
			whilePlaying = false;
			// whilePlaying turned false cause the game to end
		}
		// checks to see if there is a diagonal win from top right to bottom left
		if ((board[0][2] == board[1][1]) && (board[0][2] == board[2][0]) && board[0][2] != '_') {
			System.out.print("Player ");
			System.out.println(board[0][2] + " won!4");
			// the 4 in the sys.out.print is to show/ check what allowed the win
			whilePlaying = false;
			// whilePlaying turned false cause the game to end
		}
		//the check if the game is a tie is bellow
		boolean flag = true;
		boolean flag2 = true;
		for (int i = 0; i < board.length; i++) {
			for(int j = 0; j<board.length; j++) {
			if ((board[i][j] == 'X') || (board[i][j] == 'O')) {
				flag2 = false;
				//loops as to check each row and column 
			}
			
			if (board[i][j]==('_')) {
				flag = false;
				//if there is space for a letter continue
			}
			}
		}
		//no space is left for letters so it is a tie
		if (flag && !flag2) {
			System.out.println("CAT'S GAME!");
			System.exit(1);
			//Gavin taught me exit!
		}

	}

	public static void choosePoint() {
		// use a global variable to tell who's turn it is (boolean).
		int x;
		int y;
		boolean flag = true;
		// if the game is done flag will = false concluding the loops cycle
		while (flag) {
			x = -1;
			// set to -1 to start it at a value to be changed till it works as a number from
			// 0-2 for the players user input
			y = -1;
			// set to -1 to start it at a value to be changed till it works as a number from
			// 0-2 for the players user input
			System.out.print("Player ");
			if (playerXTurn)
				System.out.print("X");
			else
				System.out.print("O");
			// for user identification of turn above lines
			// below is the users call for coordinates
			System.out.println(", what is your move on the coordinate plane?(row is first) ");
			while ((x < 0 || x > 2) || (y < 0 || y > 2)) {
				x = -1;
				y = -1;
				System.out.println("Between 0-2 please");
				x = in.nextInt();
				y = in.nextInt();
			}
			// the coordinates called are now setting the proper place on the 2D array of X
			// or O depending on turn
			if (board[x][y] == '_') {
				if (playerXTurn) {
					board[x][y] = 'X';
					// puts the value X on the array
					playerXTurn = false;
					// switches the turn to the other player
				} else {
					board[x][y] = 'O';
					// puts the value O on the array
					playerXTurn = true;
					// switches the turn to the other player
				}
				flag = false;
				// ends cycle for choosePoint (will be called again setting to true till game
				// ends allowing it to be used again)
			}
		}
	}

	public static void printBoard() {
		// prints board as to allow users to see where they can put their letter
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[0].length; j++) {
				System.out.print(board[i][j] + " ");
			}
			System.out.println();
		}
	}
}
