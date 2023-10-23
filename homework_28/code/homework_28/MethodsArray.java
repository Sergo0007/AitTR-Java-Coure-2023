package homework_28;
//        Задача 1. Реализуйте в классе ArrayMethods следующие методы для массивов целых чисел:
//
//        сумма всех элементов массива;
//        поиск элемента в массиве;
//        Разработайте тесты для этих методов.

public class MethodsArray {


    public int sum(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];

        }
        return sum;
    }

    public boolean search(int[] array, int num) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == num) {
                return true;
            }

        }
        return false;
    }
}
