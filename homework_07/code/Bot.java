import java.util.Scanner;
//   Написать бот, который задет не менее 3-х вопросов (последовательно),
//    принимает ответы от пользователя и реагирует на эти ответы.

public class Bot {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("If I'm an online assistant,how can I help?");
        // System.out.println("Java is a programming language");
        String question = scanner.nextLine();

        switch (question) {
            case "What is this java?" -> System.out.println("It is a programming language");
            case "Where can I tech?" -> System.out.println("AIT-TR school");
            case "When  is the best time to start?" -> System.out.println("Yesterday");
            default -> System.out.println("Sorry an update is in progress");


        }

    }

}