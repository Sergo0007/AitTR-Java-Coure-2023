import java.util.Scanner;

public class YearAndMonth {
    //    Задача 3.(*) Написать программу, которая принимает с клавиатуры номер месяца
//    и год и выводит на экран название месяца и количество дней в нем.
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input the number month and year: ");
        String number = scanner.nextLine();


        switch (number) {
            case "09.2023" -> System.out.println("September, 30 days");
            case "10.2022" -> System.out.println("October,31 days");
            case "12.1976" -> System.out.println("December,31 days");
            default -> System.out.println("музыкальная пауза");


        }
    }
}