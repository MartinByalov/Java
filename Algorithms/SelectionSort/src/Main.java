public class Main {
    public static void main(String[] args) {

        int[] array = {5, 12, 3, 19, 8, 4};

        printArray(array);
        selectionSort(array);
        printArray(array);
    }

    public static void selectionSort(int[] array){

       for(int i = 0; i < array.length - 1; i ++){

           int min = array[i];
           int minIndex = i;

           for(int j = i + 1; j < array.length; j++){

               if(array[j] < min){

                   min = array[j];
                   minIndex = j;
               }
           }

           swap(array, i, minIndex);

       }

    }

    public static void swap(int[] array, int index1, int index2){

        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }

    public static void printArray(int[] array){

        for(int i : array){

            System.out.print(i + " ");

        }
        System.out.println();
    }
}