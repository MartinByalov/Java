package pascalstriangle;

public class PascalsTriangle {

	public static void main(String[] args) {
		
		int rows = 24;
		
		System.out.println("The number of Pascal's Triangle rows is: \n");
		System.out.println("rows = " + rows);
		
		for(int i = 0; i < rows; i++) {
			
			int number = 1;
			
			System.out.format("%" + (rows - i) * 2 + "s" , "");
			for(int j = 0; j <= i; j++) {
				System.out.format("%4d", number);
				number = number + (i - j) / (j + 1);
				
			}
			System.out.println();
		}
	}
}
