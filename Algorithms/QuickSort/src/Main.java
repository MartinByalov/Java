public class Main {
    public static void main(String[] args) {

        int[] array = {1, 5, 8, 2, 4};

        // Печатаме масива преди сортиране
        System.out.println("Before sorting:");
        printArray(array);

        // Извикваме QuickSort
        quickSort(array, 0, array.length - 1);

        // Печатаме масива след сортиране
        System.out.println("\nAfter sorting:");
        printArray(array);
    }

    private static void quickSort(int[] array, int low, int high){

        // Ако е останал само един елемент за сортиране, то той е на правилното си място
        if(low >= high) return;

        // Избираме pivot

        int pivot = partition(array, low, high);

        // Сортираме отляво на pivot
        quickSort(array, low, pivot - 1);

        // Сортираме отдясно на pivot
        quickSort(array, pivot + 1, high);

    }

    // Връща pivot

    private static int partition(int[] array, int low, int high){

        // Избираме последния елемент за pivot
        int pivot = array[high];
        int leftPointer = low;
        int rightPointer = high - 1;

        // Докато показалците не се срещнат
        while (leftPointer <= rightPointer){

            // Се придвижваме надясно, докато не намерим елемент по-голям от pivot
            while (array[leftPointer] <= pivot && leftPointer <= rightPointer){
                leftPointer++;
            }

            // Се придвижваме наляво, докато не намерим елемент по-малък от pivot
            while (array[rightPointer] >= pivot && leftPointer <= rightPointer){
                rightPointer--;
            }

            // Намерили сме такива елементи, разменяме им местата
            if(leftPointer < rightPointer){
                swap(array, leftPointer, rightPointer);
            }
        }
        // Накрая показалците са се срещнали. Поставяме pivot на правилното му място
        swap(array, leftPointer, high);
        return leftPointer;
    }

    private static void swap(int[] array, int index1, int index2) {
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }

    public static void printArray(int[] array) {
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
