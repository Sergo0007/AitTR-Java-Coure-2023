public class ReturningArr {

    public static void main(String[] args) {

    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");

        }
        System.out.println();
    }

    public static void fillArray(int[] arr, int a, int b) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * (b - a + 1) + a);

        }

    }

    public static void bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                }

            }

        }
    }

    //метод для полученя массива с положительными числами
    public static int[] positiveNumbers(int[] firstArray) {
        int count = 0; //создается переменная count для подсчета положительных чисел в исходном массиве

        for (int i = 0; i < firstArray.length; i++) { //подсчет положительных чисел в исходном массиве
            if (firstArray[i] > 0) {
                count++;
            }


        }
        int[] lastArray = new int[count]; //массив для положительных чисел
        int index = 0;//переменная для отслеживания текущей позиции
        for (int i = 0; i < firstArray.length; i++) { //заполняем массив положительными числами
            if (firstArray[i] > 0) {
                lastArray[index] = firstArray[i];
                index++;
            }
        }
        return lastArray;// возращение массива с положительными числами
    }

    public static void split() {
        System.out.println("____________________________");
    }

}
