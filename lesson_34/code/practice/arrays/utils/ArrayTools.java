package practice.arrays.utils;

import java.util.function.Predicate;

public class ArrayTools {
    public static void printArray(Object[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);

        }
        System.out.println("------------------");
    }

    public static <T> int search(T[] arr , T value) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals(value)) {
                return i;
            }

        }
        return -1;
    }
    public static <T> T findByPredicate(T[] arr, Predicate<T> predicate){
        for (int i = 0; i <arr.length ; i++) {
            if (predicate.test(arr[i])) {
                return  arr[i];
            }

        }
        return null;

    }
}