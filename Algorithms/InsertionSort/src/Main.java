public class Main {
    public static void main(String[] args) {

        int[] array = {6, 12, 3, 4, 88};
        printArray(array);

        insertionSort(array);
        printArray(array);
    }

    public static void insertionSort(int[] array) {

      for(int i = 1; i < array.length; i++){

          int temp = array[i];

          int j = i - 1;

          while (j >= 0 && array[j] > temp){

              array[j + 1] = array[j];

              j--;
          }

          array[j + 1] = temp;
      }

    }

    public static void printArray(int[] array) {

        for (int i : array) {

            System.out.print(i + " ");
        }
        System.out.println();
    }
}