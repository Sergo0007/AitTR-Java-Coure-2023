package practice;
//        Задание 2. Родители позволяют ребенку играть на компьютере 1 час.
//                Напишите программу, которая будет реагировать на полученную в школе оценку:
//                "Молодец!", время для игр на компьютере увеличивается на 30 мин.
//        "Хорошо", ты можешь играть на компьютере обычные 60 минут.
//        "Посредственно.", время для игр уменьшается на 30 мин.
//        "Плохо!", сегодня никаких игр на компьютере.
//        "Позор семьи!", никаких игр на компьютере 2 дня.

import java.util.Scanner;

public class Evaluation {
    public static void main(String[] args) {

        int timeForGame = 60;//сколько можно инрать на компьютере

        Scanner scanner = new Scanner(System.in);// включили ввод данных с клавиатуры
        System.out.println("Input today's mark: "); //приглашене ко вводу
        int mark = scanner.nextInt();// получение оценки с клавиатуры

        switch (mark){
            case 1: {
                System.out.println("Good child!");
                timeForGame = timeForGame + 30;//увеличили время
                System.out.println("Time for game = " + timeForGame + "min. ");
                break;
            }
            case 2: {
                System.out.println("Sehr gut");
                break;
            }
            case 3: {
                System.out.println("No so good!");
                timeForGame = timeForGame - 30;
                break;
            }
            case 4:{
                System.out.println("Very bad!");
                timeForGame = 0;
                break;
            }
            case 5: {
                System.out.println("Shame you");
                System.out.println("No games  for 2 days!");
                break;
            }
        }

    }
}
