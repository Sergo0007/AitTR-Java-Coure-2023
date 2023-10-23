import java.util.Scanner;

public class Month {
    //    Пользователь с клавиатуры вводит число от 1 до 12, программа сообщает,
//    какому времени года принадлежит введенный месяц.
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter numbers from 1 to 12 : " + "Введите числа от 1 до 12");
        int month = scanner.nextInt();


        switch (month) {
            case 1:
            case 2:
                System.out.println("Winter");
                break;

            case 3:
            case 4:
            case 5:
                System.out.println("Spring");
                break;

            case 6:
            case 7:
            case 8:
                System.out.println("Summer");
                break;


            case 9:
            case 10:
            case 11:
                System.out.println("Autumn");
                break;

            case 12:
                System.out.println("Winter");
                break;

            default:
                System.out.println("Бухабрь");

        }


    }

}

