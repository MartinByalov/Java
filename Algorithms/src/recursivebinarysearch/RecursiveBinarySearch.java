package recursivebinarysearch;

import java.util.Arrays;

public class RecursiveBinarySearch {

	static int runBinarySearch(int[] array, int data, int lowIndex, int highIndex) {

		int middleIndex = (lowIndex + highIndex) / 2;

		if (lowIndex > highIndex) {

			return 1;
		}

		if (array[middleIndex] == data) {

			return middleIndex;
		}

		if (array[middleIndex] < data) {

			return runBinarySearch(array, data, middleIndex + 1, highIndex);
		}

		if (array[middleIndex] > data) {

			return runBinarySearch(array, data, lowIndex, highIndex - 1);
		}

		return 1;
	}

	static void binarySearch(int[] array, int data) {

		int index = runBinarySearch(array, data, 0, array.length - 1);

		if (array[index] == data) {

			System.out.println("Found data: [" + data + "] at index: " + index);

		} else {

			System.out.println("Data: [" + data + "] wasn't found in the array.");
		}
	}

	static void printArray(int[] array) {

		System.out.println(Arrays.toString(array));

	}

	public static void main(String[] args) {

		int[] theArray = { 3, 24, 4, 7, 2, 11 };

		System.out.println("original array...");
		printArray(theArray);

		System.out.println("sorted array...");
		Arrays.sort(theArray);
		printArray(theArray);

		binarySearch(theArray, 24);

	}

}
