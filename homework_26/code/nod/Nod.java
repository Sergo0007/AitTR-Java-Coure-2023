package nod;

public class Nod {
    public int nod(Integer a, Integer b) {
        // Реализовать метод для нахождения наибольшего общего делителя двух натуральных чисел.
        // НОД (18, 24) = 6 ,  НОД (48, 24) = 24 , НОД (50, 40) = 10
        // шаг 1 - найти меньшее из данных двух чисел
        // шаг 2 - надо перебрать все числа меньше меньшего из наших данных двух чисел и проверить
        // делит ли оно большее
        Integer nod = 1;
        // шаг 1 - найти меньшее из данных двух чисел
        Integer min = a;
        if (a < b) {
            min = a;
        } else {
            min = b;
        }
        // шаг 2 - надо перебрать все числа меньше меньшего из наших данных двух чисел
        Integer res = 0;
        while (nod <= min) {
            if (a % nod == 0 && b % nod == 0) {
                res = nod;
            }
            nod++;
        }
        return res;
    }

}