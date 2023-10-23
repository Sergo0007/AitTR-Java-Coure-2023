import java.util.Scanner;

public class Calculator {
    //    Задача 1. Написать приложение - калькулятор для работы с целыми числами:
//
//    oper == 1 => +, oper == 2 => -, oper == 3 => *, oper == 4 => /, oper == 5 => % ,
//    other print "Wrong operation"
    public static void main(String[] args) {
        //обьявляем переменную,в кторую будем записывать то,что введет пользователь
        int  num1,num2,action;
        double result;
        //заводим  экземпляр класса Сканер в переменной сканер
        Scanner scanner = new Scanner(System.in);
        //говорим пользователю ввести певрое число
        System.out.println("Input first number: ");
        num1 = scanner.nextInt();
        System.out.println("Input second number: ");
        num2 = scanner.nextInt();
        //говорим пользрвателю ввести число от 1 до 5,обозначающие логические операции
        System.out.println("Input a number between 1 and 5: ");
        //" заставляем" переменную " слушать" и записывать в себя то,что напечаетет пользователь
        action = scanner.nextInt();

        switch (action){
            case(1):
                result = num1 + num2;
                System.out.println("Your result is: " + result);
                break;
            case(2):
                result = num1 - num2;
                System.out.println("Your result is: " + result);
                break;
            case(3):
                result = num1 * num2;
                System.out.println("Your result is: " + result);
                break;
            case(4):
                result = num1 / num2;
                System.out.println("Your result is: " + result);
                break;
            case(5):
                result = num1 % num2;
                System.out.println("Your result is: " + result);
                break;
            default:
                System.out.println("Your made a mistake in last number.It must be between 1 and 5!");
        }

    }

}

