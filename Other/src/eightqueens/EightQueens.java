/**
 * @title Eight queens puzzle extended
 * @description Using a regular chess board, the challenge is to place eight queens
 *  on the board such that no queen is attacking any of the others.
 * @author Martin Byalov / FN: 50438
 *
 */

package eightqueens;

import java.util.ArrayList;

public class EightQueens {

	private final int N = 8;

	/*
	 * Representing the board rows by array indices and columns by given values.
	 */
	private int[] board = new int[N];
	private ArrayList<String> solutions;
	int count = 0; // Count the number of solutions.

	public EightQueens() {

		solutions = new ArrayList<String>();

	}

	// Check if queen can be placed
	boolean legitPlacement(int row, int col) {

		// loop through every row
		for (int i = 0; i < row; i++) {

			/*
			 * If there is a queen on the same column or the same diagonals. Diagonal 1 is
			 * given by (row - column). Example: for Queen on position (1, 1) -> (row -
			 * column) = 0, so any cell for which (row - column) = 0 will be on the same
			 * diagonal and will be under attack by the given Queen. Diagonal 2 is given by
			 * (row + column).
			 */
			if (board[i] == col || (i - board[i]) == (row - col) || (i + board[i]) == (row + col)) {
				return false;
			}
		}
		return true;
	}

	// For the given row
	void solve(int row) {

		// loop through every column,
		for (int col = 0; col < N; col++) {

			// check if Queen can be placed.
			if (legitPlacement(row, col)) {

				board[row] = col;

				// If every Queen is placed return the solution.
				if (row == N - 1) {

					solutions.add(getSolution());

				} else {

					solve(row + 1);
				}
			}
		}
	}

	// Print the solution as a String.
	String getSolution() {

		StringBuilder sb = new StringBuilder();

		sb.append("\nSolution: " + (count + 1) + "\n------------------");

		for (int i = 0; i < N; i++) {

			sb.append("\n");

			for (int j = 0; j < N; j++) {

				if (board[i] == j) {
					sb.append("Q ");

				} else {
					sb.append("* ");
				}
			}
		}
		
		count++;

		sb.append("\n");

		return sb.toString();
	}

	String toString(int count) {

		return solutions.get(count).toString();
	}
}
