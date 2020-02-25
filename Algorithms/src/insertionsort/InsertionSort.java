package insertionsort;

import java.util.Arrays;

public class InsertionSort {

	public static void insertionSort(int[] array) {

		for (int i = 1; i < array.length; i++) {

			int key = array[i];
			int j = i - 1;

			while (j >= 0 && array[j] > key) {

				array[j + 1] = array[j];

				j--;

			}

			array[j + 1] = key;
		}
	}

	public static void printArray(int[] array) {

		for (int i = 0; i < array.length; i++) {

			System.out.print(array[i] + " ");
		}

	}

	public static void main(String[] args) {

		int[] theArray = { 1, 5, 2, 2, 3, 6, 0 };

		System.out.println("original array...");
		System.out.println(Arrays.toString(theArray));

		insertionSort(theArray);

		System.out.println("sorted array...");
		System.out.println(Arrays.toString(theArray));

	}
}