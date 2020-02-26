package selectionsort;

import java.util.Arrays;

public class SelectionSort {

	public static void selectionSort(int[] array) {

		for (int i = 0; i < array.length - 1; i++) {

			int index = i;

			for (int j = i + 1; j < array.length; j++) {

				if (array[j] < array[index]) {

					index = j; // searching for the lowest number

				}
			}

			int smallest = array[index];
			array[index] = array[i];
			array[i] = smallest;

		}
	}

	public static void main(String[] args) {

		int[] theArray = { 13, 5, 6, 124, 3, -1, 2 };

		System.out.println("original array...");
		System.out.println(Arrays.toString(theArray));

		selectionSort(theArray);

		System.out.println("sorted array...");
		System.out.println(Arrays.toString(theArray));
	}
}