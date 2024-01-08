package recursion;
//В методе SumArrayRecursion  условие надо изменить на if (i==arr.length), иначе последний элемент не прибавляется

import java.util.Arrays;

public class SumArrayRecursion {
    public static void main(String[] args) {
        Integer[] arr = {1, 3, 6, 9, 11, 13, 15, 17, 19, 21,10,5};//массив как есть
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " | ");

        }
        System.out.println();

        //задача сложить все элементы массива
        int sum = sumArrayRecursion(arr);
        System.out.print("Sum of arrays elements: " + sum);
    }
    public static int sumArrayRecursion(Integer[] arr){
        return sumArrayRecursion(arr,0);
    }
    // метод должен идти слева направо и суммировать в первый элемент все остальные по очереди
    private static int sumArrayRecursion(Integer[] arr,int i) {
        int sum = 0;
        if(i == arr.length - 1){
            sum = arr[i];
        }else {
            sum = arr[i] + sumArrayRecursion(arr, i + 1);
        }
        return sum;

    }
}
