package iterativebinarysearch;

import java.util.Arrays;

/*
 * BinarySearch requires array to be sorted.
 * Running time: O(log(n)).
 */

public class IterativeBinarySearch {

	static int runBinarySearch(int[] array, int data) {

		int theIndex = 0;
		int lowIndex = 0;
		int highIndex = array.length - 1;

		while (lowIndex <= highIndex) {

			int middleIndex = (lowIndex + highIndex) / 2;

			if (array[middleIndex] < data) {

				lowIndex = middleIndex + 1;

			} else if (array[middleIndex] > data) {

				highIndex = middleIndex - 1;
			}

			else {

				theIndex = middleIndex;
				break;
			}
		}

		return theIndex;
	}

	static void binarySearch(int[] array, int data) {

		int index = runBinarySearch(array, data);

		if (array[index] == data) {

			System.out.println("Found data: [" + data + "] at index: " + index);
		} else {

			System.out.println("Data: [" + data + "] wasn't found in the array.");
		}

	}

	static void bubbleSort(int[] array) {

		for (int i = 0; i < array.length - 1; i++) {

			for (int j = 0; j < array.length - 1; j++) {

				if (array[j] > array[j + 1]) {

					swapValues(array, j, j + 1);
				}
			}
		}
	}

	static void swapValues(int[] array, int i, int j) {

		int temp = array[i];
		array[i] = array[j];
		array[j] = temp;

	}

	static void printArray(int[] array) {

		System.out.println(Arrays.toString(array));

		/*
		 * for(int i = 0; i < array.length; i++) {
		 * 
		 * //System.out.print(array[i] + " "); //System.out.printf("%d " + array[i]);
		 * 
		 * }
		 */
	}

	public static void main(String[] args) {

		int[] theArray = { 3, 24, 4, 7, 2, 11 };

		System.out.println("original array...");
		printArray(theArray);

		bubbleSort(theArray);
		System.out.println("sorted array...");
		printArray(theArray);

		binarySearch(theArray, 24);
	}

}