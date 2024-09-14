public class ArrayExample {
    public static void main(String[] args) {

        int[] array = {12, 13, 5, 8, 9};
    }

    // Достъп до елемент

    public static int getElement(int[] array, int index) {

        if (index < 0 || index >= array.length) {

            throw new IndexOutOfBoundsException("Невалиден индекс: " + index);
        }

        return array[index];
    }

    // Промяна на елемент
    public static void setElement(int[] array, int index, int newValue) {

        if (index < 0 || index >= array.length) {

            throw new IndexOutOfBoundsException("Невалиден индекс: " + index);
        }

        array[index] = newValue;
    }

    // Търсене на елемент

    public static int searchElement(int[] array, int target){

        for(int i = 0; i < array.length; i++){

            if(array[i] == target){
                return i;
            }
        }
        return -1;
}

// Вмъкване на елемент

    public static void push(int[] array, int index, int value){

        if (index < 0 || index >= array.length) {

            throw new IndexOutOfBoundsException("Невалиден индекс: " + index);
        }

        int[] newArray = new int[array.length + 1];

        for(int i = 0; i < index; i++){

            newArray[i] = array[i];
        }

        newArray[index] = value;

        for(int j = index; j < array.length; j++){

            newArray[j + 1] = array[j];

        }
    }

    public static void deleteElement(int[] array, int index){

        if (index < 0 || index >= array.length) {

            throw new IndexOutOfBoundsException("Невалиден индекс: " + index);
        }

        int[] newArray = new int[array.length - 1];

        for(int i = 0; i < index; i++){

            newArray[i] = array[i];

        }

        for(int i = index + 1; i < array.length; i++){

            newArray[i - 1] = array[i];

        }
    }
}
