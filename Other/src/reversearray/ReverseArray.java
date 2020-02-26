package reversearray;

import java.util.Arrays;

public class ReverseArray {

	static int[] reverseArray(int[] array) {

		int n = array.length;
		int[] reversed = new int[n];

		for (int i = 0; i < n; i++) {

			reversed[n - 1 - i] = array[i];

		}

		return reversed;
	}

	static void printArray(int[] array) {

		System.out.println(Arrays.toString(array));

	}

	public static void main(String[] args) {

		int[] theArray = { 1, 2, 3, 4, 5, 6 };

		System.out.println("original array...");
		printArray(theArray);

		System.out.println("reversed array...");
		printArray(reverseArray(theArray));

	}
}
