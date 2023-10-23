import java.util.Scanner;

public class Hours24 {
    //       Задача 2. Определение времени суток. Напишите программу, которая принимает текущий час
//       (от 0 до 23) и выводит приветствие в зависимости от времени суток (утро, день, вечер, ночь).
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите время: ");
        int clock = scanner.nextInt();

        switch (clock){
            case (0),(1),(2),(3),(4):
                System.out.println("Good night");
                break;
            case (5),(6),(7),(8),(9),(10):
                System.out.println("Good morning");
                break;
            case (11),(12),(13),(14),(15),(16):
                System.out.println("Good day");
                break;
            case (17),(18),(19),(20),(21):
                System.out.println("Good evening");
                break;
            case (22),(23):
                System.out.println("Good night");
                break;
            default:
                System.out.println("Такое время суток еще не изобрели,повторите попытку лет через ...цать");
        }

    }

}