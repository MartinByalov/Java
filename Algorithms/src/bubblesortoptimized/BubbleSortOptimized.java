package bubblesortoptimized;

public class BubbleSortOptimized {

	public static void bubbleSort(int[] array) {

		for (int i = 1; i < array.length; i++) {

			for (int j = 0; j < (array.length - i); j++) {

				if (array[j] > array[j + 1]) {

					swapValues(array, j, j + 1);
				}
			}
		}
	}

	public static void swapValues(int[] array, int i, int j) {

		int temp = array[i];
		array[i] = array[j];
		array[j] = temp;

	}

	public static void printArray(int[] array) {

		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
	}

	public static void main(String[] args) {

		int[] theArray = { 3, 24, 4, 7, 2, 11 };

		System.out.println("original array...");
		printArray(theArray);

		System.out.println("\nsorted array...");
		bubbleSort(theArray);
		printArray(theArray);

	}
}
