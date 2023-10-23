package practice;
//        Задача 1. Создайте массив и заполните его символами латинского алфавита
//        от A до Z .Раcпечатайте полученный массив.

public class ArrayAlphabet {
    public static void main(String[] args) {
        //заполнить массив числами от 1 до 20

        int[] arrayNum = new int[20];// обьявили массив

        for (int i = 0; i < arrayNum.length; i++) {// запускаем цикл
            arrayNum[i] = i + 1; //заполняем элементы массива
        }
        //цикл для печати массива
        for (int i = 0; i < arrayNum.length; i++) {
            System.out.print(arrayNum[i] + ",");

        }
        System.out.println();//переход на новую строку
        System.out.println("нулевой по индексу элемент " + arrayNum[0]);
        System.out.println("19 по индексу элемент " + arrayNum[19]);
        // System.out.println("20й по индексу элемент" + arrayNum[20]);//выход за пределы массива
        //char это приведение int к типу char

        char[] alphabet = new char[26];
        //заполнение
        for (int i = 0; i < alphabet.length; i++) {
            alphabet[i] = (char) (65 + i); //65 это код большой буквы А латинского алфавита
            System.out.print(alphabet[i] + " ");// можно сразу распечатать

        }
        //печать массива
        for (int i = 0; i < alphabet.length; i++) { //for (int i = 0; i < alphabet.length/2; i++)
            System.out.print(alphabet[i] + " ");

        }
        System.out.println();
        System.out.println(alphabet);


    }


}

