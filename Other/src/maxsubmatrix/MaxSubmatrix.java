package maxsubmatrix;

public class MaxSubmatrix {

	static void printMatrix(int[][] matrix) {

		for (int row = 0; row < matrix.length; row++) {
			for (int col = 0; col < matrix[0].length; col++) {

				System.out.printf("%d ", matrix[row][col]);

			}
			System.out.println();
		}
		System.out.println();
	}

	public static void main(String[] args) {

		int[][] matrix = {

				{ 0, 2, 4, 0, 9, 5 },

				{ 7, 1, 3, 3, 2, 1 },

				{ 1, 3, 9, 8, 5, 6 },

				{ 4, 6, 7, 9, 1, 0 }

		};

		int bestSum = 0;
		int bestRow = 0;
		int bestCol = 0;

		for (int row = 0; row < matrix.length - 1; row++) {
			for (int col = 0; col < matrix[0].length - 1; col++) {

				int sum = matrix[row][col] + matrix[row][col + 1] + matrix[row + 1][col] + matrix[row + 1][col + 1];

				if (sum > bestSum) {

					bestSum = sum;
					bestRow = row;
					bestCol = col;

				}
			}
		}

		System.out.println("original matrix...");
		printMatrix(matrix);

		System.out.println("max submatrix...");
		System.out.printf("%d %d\n%d %d", matrix[bestRow][bestCol], 
										  matrix[bestRow][bestCol + 1],
										  matrix[bestRow + 1][bestCol], 
										  matrix[bestRow + 1][bestCol + 1]);

		System.out.println("\n\nmax sum..." + bestSum);
	}

}
