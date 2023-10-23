public class ArrMeth {
    //    Задача 1. Напишите метод, принимающий массив целых чисел, и печатающий его в обратном порядке.
//    Сначала последний элемент, потом предпоследний, и т.д.
//    Измените (лучше скопируйте и сделайте еще один метод) метод так,
//    чтобы он работал с массивом, заполненном "цифрами прописью": zero, one, two, three, ...,
//    nine Выполните "разворот" это массива.
    public static void main(String[] args) {


        int[] intArray = {1, 2, 5, 7, 9, 6, 9, 10, 11};
        String[] stringArray = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};

        System.out.println("Массив целых чисел в обратном порядке: ");
        reverseArray(intArray);
        printIntArray(intArray);
        System.out.println("Массив, заполненный цифрами прописью в обратном порядке: ");
        reverseArray(stringArray);
        printStringArray(stringArray);
    }

    public static void reverseArray(int[] array) {
        int temp;
        for (int i = 0; i < array.length / 2; i++) {
            temp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = temp;
        }
    }

    public static void reverseArray(String[] array) {
        String temp;
        for (int i = 0; i < array.length / 2; i++) {
            temp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = temp;
        }
    }

    public static void printIntArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();  // добавлен перенос строки после вывода
    }

    public static void printStringArray(String[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();  // добавлен перенос строки после вывода

    }

}

