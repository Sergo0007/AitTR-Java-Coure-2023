import java.util.Scanner;

public class sumOfDigits { //поработать с кодом!!!
   // Задача 2. Вводится положительное целое число, найдите сумму его цифр.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input positive integer number: ");
        int number = scanner.nextInt();
        int number1 = number;// cохранил начальное значение числа number
        int sumOfDigits = 0;
        while (number > 0){
            sumOfDigits = sumOfDigits + number % 10;
            number = number/10;
        }
        System.out.println("Sum of digits" + number1 + "is: " + sumOfDigits);
        // aлгоритм
        // смысл цифры в числе опроеделяется  ее положением, единиц, десятки, сотни,...
        // будем делить в цикле наше число на 10 пока > 0
       // int count = 0;
        //while (number > 0){
         //   number = number / 10;
          //  count++;
       // }
        //System.out.println("Digits in number is: " + count);

    }
}
