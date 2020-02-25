package countingsort;

public class CountingSort {

	static int getMax(int[] array) {

		int max = array[0];

		for (int i = 0; i < array.length; i++) {

			if (array[i] > max) {

				max = array[i];

			}
		}

		return max;

	}

	static void countingSort(int[] array) {

		int n = getMax(array) + 1;

		int[] count = new int[n];
		int[] sorted = new int[array.length];

		for (int i = 0; i < count.length; i++) {

			count[i] = 0;

		}

		for (int i = 0; i < array.length; i++) {

			count[array[i]] += 1;

		}

		for (int i = 1; i < count.length; i++) {

			count[i] += count[i - 1];

		}

		for (int i = 0; i < sorted.length; i++) {

			sorted[count[array[i]] - 1] = array[i];

			count[array[i]] -= 1;

		}

		for (int i = 0; i < array.length; i++) {

			array[i] = sorted[i];

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
		printArray(theArray);

		countingSort(theArray);
		System.out.println("\nsorted array...");
		printArray(theArray);
	}

}