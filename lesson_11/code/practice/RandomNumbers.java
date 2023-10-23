package practice;
//         Задача 1. Написать метод, принимающий массив целых чисел, и возвращающий
//                 сумму всех его нечетных элементов (не индексы!, а сами элементы).


import java.util.Scanner;

public class RandomNumbers {
    public static void main(String[] args) {

        //создаем массив
        int[] randomInt = new int[10];
        // int n = (int)(Math.random() * (b - a + 1) + a) - генерирует случайное **целое**
        // число в интервале [a, b] a  - может быть, b  - может быть

        int a = -20;
        int b = 20;
        for (int i = 0; i < randomInt.length; i++) {
            randomInt[i] = (int) (Math.random() * (b - a + 1) + a);

        }
        //напечатаем полученный массив
        for (int i = 0; i < randomInt.length; i++) {
            System.out.print(randomInt[i] + " ");

        }
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input number: ");
        int num = scanner.nextInt();

        boolean isInArray = searchInArray(randomInt, num);
        if (isInArray) {
            System.out.println("Number " + num + " presents in array");
        } else {
            System.out.println("Number " + num + " does NOT present in array");
        }

    }

    public static boolean searchInArray(int[] arr, int n) {
        boolean res = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == n) {
                res = true;
            }

        }
        return res;

    }
}
