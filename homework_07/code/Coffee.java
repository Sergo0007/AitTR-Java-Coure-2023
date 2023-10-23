import java.util.Scanner;

public class Coffee {
    //        Задача 1. Написать программу для "Кофе-машины", которая позволяет
//        пользователю выбрать напиток:
//        Эспрессо
//        Американо
//        Латте
//        Капучино.
//        После выбора программа должна сообщить стоимость выбранного напитка.
    public static void main(String[] args) {
//        int espresso = 1;
//        int americano = 2;
//        int latte = 3;
//        int cappuccino = 4;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Выберите кофе и нажмите нужный номер: ");
        System.out.println("1: espresso, 2:  americano, 3: latte,4: cappuccino ");
        int num = scanner.nextInt();

        double price;


        if (num == 1 ){
            price = 1.50;
            System.out.println("You have chosen espresso ,the cost: " + price + " euro");
        }
       else if (num == 2){
            price = 2.50;
            System.out.println("You have chosen americano ,the cost: " + price + " euro");
        }
      else   if (num == 3 ){
            price = 3.00;
            System.out.println("You have chosen latte ,the cost: " + price + " euro");
        }
       else if (num == 4){
            price = 2.20;
            System.out.println("You have chosen cappuccino ,the cost: " +price + " euro");
        }else {
            System.out.println("нет здесь мороженного");
        }

    }
}
