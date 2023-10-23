import java.util.Scanner;

public class TicketPrice_03 {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите Ваш возраст: ");
        int age = scanner.nextInt();
        System.out.println("Вы студент? да = true : нет = false: ");
        boolean isStudent = scanner.nextBoolean();
        System.out.println("Берете Vip зал? да = true : нет = false: ");
        boolean isVip = scanner.nextBoolean();
        double ticketPrice = calculateTicketPrice(age, isStudent, isVip);
        System.out.println("Стоимость Вашего билета: " + ticketPrice + " евро");

    }

    public static double calculateTicketPrice(int age, boolean isStudent, boolean isVip) {
        double totalPrice = 5.0;
        if (age >= 65) {
            totalPrice -= 0.25 * totalPrice;
        } else if (isStudent) {
            totalPrice -= 0.1 * totalPrice;
        }
        if (isVip) {
            totalPrice += 0.25 * totalPrice;
        }
        return totalPrice;

    }
}
