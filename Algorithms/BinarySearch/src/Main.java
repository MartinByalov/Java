public class Main {
    public static void main(String[] args) {
        int[] array = {2, 3, 4, 10, 40};

        System.out.print(binarySearch(array, 3));
    }

    private static int binarySearch(int[] array, int target){

        int low = 0;
        int high = array.length - 1;

        // Докато показалците се срещнат
        while (low <= high){

            int mid = (low + high) / 2;
            int midNumber = array[mid];

            if(target == midNumber){
                return mid;
            }
            if(target < midNumber){
                high = mid - 1;
            } else{
                low = mid + 1;
            }
        }

        return -1; // Не сме намерили търсената стойност
    }
}