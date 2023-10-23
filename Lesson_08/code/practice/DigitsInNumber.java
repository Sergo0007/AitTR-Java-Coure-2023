package practice;
//          Задача 4. Пользователь вводит натуральное число (целое, положительное).
//          Выясните, сколько цифр в числе.

import java.util.Scanner;

public class DigitsInNumber {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input positive integer number: ");
        int number = scanner.nextInt();
        System.out.println("Your number is : " + number);

        //aлгоритм
        // смысл цифры в числе опроеделяется  ее положением, единиц, десятки, сотни,...
        // будем делить в цикле наше число на 10 пока > 0
        int count = 0;
        while (number > 0){
            number = number / 10;
            count++;
        }
        System.out.println("Digits in number is: " + count);

    }
}
