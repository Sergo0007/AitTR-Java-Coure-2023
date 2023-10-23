package practice;
 //Задание 2. Распечатать в консоли таблицу умножения от 1 до 10.

public class Multiply {
    public static void main(String[] args) {

        int n = 1;
        int m = 1;

        while (n < 10){
            while (m <= 10) {
                System.out.print(n + " * " + m + " = " + n * m + " | ");
                m++;
            }
            System.out.println();//переход на новую строку
            m = 1; // сброс на новую строку
            n++;// увеличиваем n на 1

        }


    }
}
