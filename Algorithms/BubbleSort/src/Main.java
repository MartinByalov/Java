import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Random random = new Random();

        int[] array = new int[10];

        for (int i = 0; i < array.length; i++) {

            array[i] = random.nextInt(1000);

        }

        printArray(array);
        bubbleSort(array);
        printArray(array);
    }

    public static void bubbleSort(int[] array) {

        for(int i = 0; i < array.length - 1; i++){

            for(int j = 1; j < array.length - i; j++){
                if(array[j - 1] > array[j]){
                    int temp = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = temp;
                }
            }

        }
    }

    public static void printArray(int[] array) {

        for (int i : array) {

            System.out.print(i + " ");

        }
        System.out.println();
    }
}