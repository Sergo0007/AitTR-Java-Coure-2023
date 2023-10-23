public class ArrayMethods_02 {

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");

        }
        System.out.println();

    }

    public static int minArray(int[] array) {
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];

            }

        }
        return min;
    }

    public static int minArrayIndex(int[] array) {
        int min = array[0];
        int minIndex = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
                minIndex = i;
            }

        }
        return minIndex;
    }

    public static void sortArrayIntAsc(int[] array) {  // если долго мучиться,кто нибудь получится :)
        int max = array[0];
        int indexMax = 0;
        for (int i = 0; i < array.length - 1; i++) {
            max = array[i];
            indexMax = i;
            for (int j = i; j < array.length; j++) {
                if (array[j] > max) { //происходит разворот если сделать запись так:if(arra[j] < max

                    max = array[j];
                    indexMax = j;
                }

            }
            int temp = array[i];
            array[i] = array[indexMax];
            array[indexMax] = temp;

        }


    }

    public static void split() {
        System.out.println("******************");
    }

}