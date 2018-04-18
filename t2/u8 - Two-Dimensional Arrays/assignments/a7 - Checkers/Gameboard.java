public class Gameboard {
	public char[][] board = new char [8][8];
	public Gameboard(boolean setup) {
		// every element is -
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[0].length; j++) {
				board[i][j] = '-';
			}
		}

		if (setup) { // board will be populated with pieces as per the standard game setup
			for (int i = 0; i < board.length; i++) {
				for (int j = 0; j < board[0].length; j++) {
					if ((i == 0 || i == 2) && (j % 2 != 0)) { // red rows - rows 0, 2
						board[i][j] = 'r';
					} else if ((i == 1) && (j % 2 == 0)) { // red rows - row 1
						board[i][j] = 'r';
					} else if ((i == 5 || i == 7) && (j % 2 == 0)) { // white rows - rows 5, 7
						board[i][j] = 'w';
					} else if ((i == 6) && (j % 2 != 0)) { // white rows - row 6
						board[i][j] = 'w';
					}
				}
			}
		}
	}

	public boolean move (int x, int y, boolean left) {
		// check if it can jump another piece forward left/right
		// if (jump(x, y)) {
		// 	return true;
		// } else 
		if (board[y][x] != '-') {
			int a = 0;
			int b = 0;
			// did player want to move forward left, or forward right?
			if (left) {
				if (board[y][x] == 'r') { // red
					if (x == 7) {
						return false;
					}
					a = y+1; b = x+1;
				} else if (board[y][x] == 'w') { // white
					if (x == 0) {
						return false;
					}
					a = y-1; b = x-1;
				}
			} else {
				if (board[y][x] == 'r') { // red
					if (x == 0) {
						return false;
					}
					a = y+1; b = x-1;
				} else if (board[y][x] == 'w') { // white
					if (x == 7) {
						return false;
					}
					a = y-1; b = x+1;
				}
			}

			// check if it can move left, if so, move
			if (board[a][b] == '-') {
				board[a][b] = board[y][x];
				board[y][x] = '-';
				return true;
			}
		}
		return false; // move was not successfully executed
	}

	public boolean jump (int x, int y) {
		// System.out.println("jump(" + x + ", " + y + ") was called.");
		int a = 0;
		int b = 0;
		int c = 0;
		int d = 0;
		if (board[y][x] != '-') {
			if (board[y][x] == 'r') {
				// x != 6, 7 because then it is jumping off (if jumping left)
				// x != 0, 1 because then it is jumping off (if jumping right)
				if (x != 6 && x != 7 && board[y+1][x+1] == 'w' && board[y+2][x+2] == '-') { // check left
					a = y+1; b = x+1; c = y+2; d = x+2;
				} else if (x != 0 && x != 1 && board[y+1][x-1] == 'w' && board[y+2][x-2] == '-') { // check right
					a = y+1; b = x-1; c = y+2; d = x-2;
				} else {
					return false;
				}
			} else if (board[y][x] == 'w') {
				// x != 6, 7 because then it is jumping off (if jumping right)
				// x != 0, 1 because then it is jumping off (if jumping left)
				if (x != 0 && x != 1 && board[y-1][x-1] == 'r' && board[y-2][x-2] == '-') { // check left
					a = y-1; b = x-1; c = y-2; d = x-2;
				} else if (x != 6 && x != 7 && board[y-1][x+1] == 'r' && board[y-2][x+2] == '-') { // check right
					a = y-1; b = x+1; c = y-2; d = x+2;
				} else {
					return false;
				}
			}
			board[a][b] = '-'; // capture opponent
			board[c][d] = board[y][x]; // move [y][x] to new spot [c][d]
			board[y][x] = '-'; // remove piece at [y][x]
			// System.out.println(this.toString());
			jump(d, c);
			return true;
		}
		return false;
	}

	public boolean kingMe(int x, int y) {
		if (board[x][y] == 'r') {
			board[x][y] = 'R';
			return true;
		} else if (board[x][y] == 'w') {
			board[x][y] = 'W';
			return true;
		}
		return false;
	}

	public String toString() {
		String temp = ""; // add 2 spaces for numbered board
		// uncomment for numbered board
		// for (int k = 0; k < 8; k++) {
		// 	temp += k + " ";
		// }
		// temp += "\n";
		for (int i = 0; i < board.length; i++) {
			// temp += i + " "; // uncomment for numbered board
			for (int j = 0; j < board[0].length; j++) {
				temp += board[i][j] + " ";
			}
			temp += "\n";
		}
		return temp;
	}
}