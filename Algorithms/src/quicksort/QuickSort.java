package quicksort;

import java.util.Arrays;

public class QuickSort {

	static void runQuickSort(int[] array, int left, int right) {

		int i = left;
		int j = right;
		int pivot = array[left + (right - 1) / 2];

		while (i <= j) {

			// moves to the right until the left marker reaches number >= pivot
			while (array[i] < pivot) {
				i++; // inner loop iterator
			}
			// moves to the left until the right marker reaches number <= pivot
			while (array[j] > pivot) {
				j--;
			}
			// when both left and right markers have stopped, the marked numbers are swapped
			swapValues(array, i, j);

			i++;
			j--;

			// when both markers stop and they're in the same position, that number is
			// swapped with the pivot number

			// the first round is completed: we've placed the smaller numbers than the pivot
			// to the left and larger numbers to the right
		}

		// another round of operations will be performed recursively on both sequences
		// created by the division
		if (left < j)
			runQuickSort(array, left, j);
		if (right > i)
			runQuickSort(array, i, right);

		/*
		 * explanation : Android App - "Algorithms Explained and Animated"
		 */
	}

	static void quickSort(int[] array) {

		runQuickSort(array, 0, array.length - 1);

	}

	static void swapValues(int[] array, int i, int j) {

		int temp = array[i];
		array[i] = array[j];
		array[j] = temp;

	}

	static void printArray(int[] array) {

		for (int i = 0; i < array.length; i++) {

			System.out.print(array[i] + " ");
		}

	}

	public static void main(String[] args) {

		int[] theArray = { 1, 5, 2, 2, 3, 6, 0 };

		System.out.println("the original array...");
		System.out.println(Arrays.toString(theArray));

		quickSort(theArray);

		System.out.println("sorted array...");
		System.out.println(Arrays.toString(theArray));

	}
}