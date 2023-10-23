package practice;
//    Задание 2. Напишите программу для машины на светофоре. Что нужно делать, если горит красный,
//     жёлтый или зелёный свет. Цвет светофора задается в программе, затем с клавиатуры.

import java.util.Scanner;

public class TrafficLights {
    public static void main(String[] args) {

        //как будем кодировать цвет светофора?
        // либо цифрами 1,2,3, либо пользователь вводит строку,либо задаем в программе строкой ( перемнная типа стринг)
        Scanner scanner = new Scanner(System.in);
        System.out.println("what is color?(Red,Yellow,Green): ");
        String color = scanner.next();//// задаем переменную строкового типа String

        switch (color) {
            case "Red" -> System.out.println("Stop, wait!");
            case "Yellow" -> System.out.println("Be ready to go.");
            case "Green" -> System.out.println("You can go!");


        }

    }
}
