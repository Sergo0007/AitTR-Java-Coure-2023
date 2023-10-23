import java.util.Scanner;
//           Задача 3(*). Написать программу, определяющую, является ли год високосным.
//           Для того чтобы год был високосным, он должен: делится без остатка на 4 и,
//           либо не должен делится без остатка на 100, либо если он делится на 100,
//           то он должен делится также на 400. Проверить на годах 1700, 1800, 1900 - не високосные,a
//           2000 високосный.

public class LeapYear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Year");
        int year1 = scanner.nextInt();
        int ost = year1 % 4;
        int ost2 = year1 % 100;
        int ost3 = year1 % 400;
        int ost4 = year1 % 1000;

        if (ost == 0 & ost2 != 0 | ost2 == 0 & ost3 == 0 | ost4 == 0){
            System.out.println("Год високосний.");
        }else{
            System.out.println("Год не високосний.");
        }

    }
}
