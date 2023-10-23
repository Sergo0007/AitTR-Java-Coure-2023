package hw28;
//        Задача 2. Создайте массив  случайных целых чисел в интервале от -10 до 10. Подсчитайте,
//        сколько в этом массиве оказалось:
//
//        положительных чисел;
//        отрицательных чисел;
//        четных чисел;
//        нулей.
//        Оформите решение данной задачи методами и напишите для них тесты.

public class Methods {

    public int positiveNumbers(int[] array) {
        int p = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0) {
                p++;

            }
        }
        return p;


    }

    public int negativeNumbers(int[] array) {
        int n = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0) {
                n++;

            }
        }
        return n;
    }

    public int evenNumbers(int[] array) {
        int e = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                e++;
            }

        }
        return e;
    }

    public int zeroNumbers(int[] array) {
        int z = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0) {
                z++;
            }

        }
        return z;
    }
}