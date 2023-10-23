public class massiveTasks {
    // Напишите программу, которая удаляет из массива элемент по условиям:
    //по заданной позиции.
    //по значению
    public static void main(String[] args) {
        int[] source = new int[5];
        // int[] source = {1,2,6,9,-5};
        source[0] = 1;// так массив стартует с нуля
        source[1] = 2;
        source[2] = 6;
        source[3] = 9;
        source[4] = -5;//длина массива

        // source[1] = x;
        // int x = source[1]; //значение по индексу 1,это второй элемент в массиве = 2
        printArray(source);
        dellByPosition(source, 2);
        printArray(source);
        dellByElement(source, -5);
        printArray(source);


    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "\t");

        }
        System.out.println();

        // 1
//    int i = 0;
//    if (i < array.length){
//        System.out.print(array[i] + " ");// i = 0,array[i] -> array[0] -> 1(выводится число 1 т,к i это нащ индекс и i равен 0
//        i++; // тут прибавили к текущему значению i единицу,после этой строки значение i,будет равно

    }

    public static void dellByPosition(int[] abc, int position) {
        for (int i = 0; i < abc.length; i++) {
            if (i == position) {
                abc[i] = 0;
            }
        }
    }

    public static void dellByElement(int[] abc, int element) {
        for (int i = 0; i < abc.length; i++) {
            if (abc[i] == element) {
                abc[i] = 0;
            }
            //2}
//    if (i < array.length){// i = 1,array.length = 5 => 1 < 5? да
//        System.out.print(array[i] + " ");// i
//        i++;
        }
    }
} //3