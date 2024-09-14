package arraysymmetry;

import java.util.Arrays;
import java.util.Scanner;

public class ArraySymmetry {

	static void symmetry(int[] array) {

		boolean symmetry = true;

		for (int i = 0; i < (array.length + 1) / 2; i++) {

			if (array[i] != array[array.length - 1 - i]) {

				symmetry = false;

			}
		}

		if (symmetry) {

			System.out.println("array is symmetric...");
		} else {

			System.out.println("array isn't symmetric...");
		}
	}

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("enter number of elements...");

		int n = input.nextInt();

		int[] array = new int[n];

		System.out.println("enter new element...");

		for (int i = 0; i < n; i++) {

			array[i] = input.nextInt();

			System.out.println(array[i] + " was added...");
		}

		input.close();

		System.out.println("original array..." + Arrays.toString(array));

		symmetry(array);
	}
}
