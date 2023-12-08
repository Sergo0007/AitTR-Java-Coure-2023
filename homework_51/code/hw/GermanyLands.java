package hw;
//        Задача 1. Написать программу, которая:
//        прочитает с клавиатуры количество вводимых названий земель в Германии,
//        прочитает с клавиатуры названия земель и соберёт их в множество,
//        выведет полученные результаты на экран.

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class GermanyLands {
    public static void main(String[] args) {
        Set<String> lands = new HashSet<>();

        do{
            System.out.println("Welcome to Terminal.");
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter the number of lands' names in Germany.");
            int quantity = scanner.nextInt();
            scanner.nextLine();
            for (int i = 0; i < quantity; i++) {

                System.out.println("Enter the name of the land.");
                String land = scanner.nextLine();
                lands.add(land);

            }
            System.out.println("List  of Lands: ");
            for (String land : lands){
                System.out.println(land);
            }


        }while (true);

    }
}
