package printmatrix;

/*
 * one dimensional array - vector
 * two dimensional array - matrix
 */

public class PrintMatrix {

	public static void main(String[] args) {

		int[][] matrix = { 
				{ 1, 2, 3, 4 }, 
				{ 5, 6, 7, 8 } }; // 2 rows, 4 columns
			  
		System.out.println("original matrix...");

		for (int row = 0; row < matrix.length; row++) {
			for (int col = 0; col < matrix[0].length; col++) {

				System.out.printf("%d ", matrix[row][col]);

			}

			System.out.println();
		
		}
	}
}
