import java.util.Scanner;

public class Multiples {
    //    Задача 1. Распечатайте все числа меньшие 200 и кратные 13.
    public static void main(String[] args) {

        int count = 1;
        while (count <= 200) {
            if (count % 13 == 0) {
                System.out.print(count + " | ");
            }
            count++;
        }
        System.out.println();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число  кратное 13: ");
        int count1 = scanner.nextInt();
        if (count1 % 13 == 0) {
            System.out.println("Вы ввели правильное число ");
        } else {
            System.out.println("Вы ввели не правильное число ");
        }
    }


}

