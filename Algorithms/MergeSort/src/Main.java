public class Main {
    public static void main(String[] args) {
        int[] array = {8, 2, 5, 3, 4, 7, 6, 1};

        mergeSort(array);

        for (int i = 0; i < array.length; i++) {

            System.out.print(array[i] + " ");

        }
    }

    private static void mergeSort(int[] array) {

        int length = array.length;

        if(length <= 1) return;

        int middle = length / 2;

        int[] leftArray = new int[middle];
        int[] rightArray = new int[length - middle];

        int j = 0;

        for(int i = 0; i < length; i++){

            if(i < middle){
                leftArray[i] = array[i];
            } else{
                rightArray[j] = array[i];
                j++;
            }
        }

        mergeSort(leftArray);
        mergeSort(rightArray);
        merge(array, leftArray, rightArray);
    }

    public static void merge(int[] array, int[] leftArray, int[] rightArray){

        int leftSize = array.length / 2;
        int rightSize = array.length - leftSize;

        int i = 0; //оригинален масив
        int l = 0; // ляв подмасив
        int r = 0; // десен подмасив

        while (l < leftSize && r < rightSize){

            if(leftArray[l] < rightArray[r]){
                array[i] = leftArray[l];
                i++;
                l++;
            } else{
                array[i] = rightArray[r];
                i++;
                r++;
            }
        }

        // Ако са останали по един елемент в някой подмасив

        while (l < leftSize){
            array[i] = leftArray[l];
            i++;
            l++;
        }

        while (r < rightSize){
            array[i] = rightArray[r];
            i++;
            r++;
        }
    }
}