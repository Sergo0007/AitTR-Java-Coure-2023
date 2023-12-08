package hw;
//        Задача 2. Написать программу, которая:
//        прочитает с клавиатуры количество вводимых чисел,
//        прочитает с клавиатуры сами числа и соберёт их в множество,
//        удалить из множества числа большие 10 и выведет полученные результаты на экран. Все числа, которые подаются на вход программы, целые.

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class NumbersAppl {
    public static void main(String[] args) {
        Set<Integer> numbers = new HashSet<>();


        do {

            System.out.println("Welcome to Terminal.");
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter the number of numbers: ");
            int count = scanner.nextInt();
            scanner.nextLine();//Считываем лишний перевод строки

            for (int i = 0; i < count; i++) {
                System.out.println("Enter number: ");
                int number = scanner.nextInt();
                scanner.nextLine();
                numbers.add(number);


            }
            Set<Integer> removeNumber = new HashSet<>();
            for (int number : numbers) {
                if (number > 10) {
                    removeNumber.add(number);
                }

            }
            //numbers.removeIf(number -> number > 10);
            numbers.removeAll(removeNumber);
            System.out.println(" Numbers less than or equal to 10: ");
            for (int n : numbers) {
                System.out.println(n);

            }
        }while (true) ;


        }

        }

