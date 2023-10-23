public class TicketPrice {
    //    Задача 3. В кинотеатре есть разные типы билетов:
//    стандартный, студенческий (-10%) и для пенсионеров(-25%). Каждый тип билета имеет
//    свою стоимость. Клиент может также выбрать место в VIP-зоне, что увеличит стоимость билета на 25%.
//    Создайте метод calculateTicketPrice, который принимает возраст клиента,
//    статус студента и флаг VIP-места.
    public static void main(String[] args) {

        double ticketPrice = calculateTicketPrice(65, false, false);
        System.out.println("Стоимость билета для пенсионера: " + ticketPrice + " евро");
        double ticketPriceStudent = calculateTicketPrice(20, true, true);
        System.out.println("Стоимость билета для для студента: " + ticketPriceStudent + " евро");
        double ticketPriceVip = calculateTicketPrice(40, false, true);
        System.out.println("Стоимость билета для для VIP посетителя: " + ticketPriceVip + " евро");


    }

    public static double calculateTicketPrice(int age, boolean isStudent, boolean isVip) {
        double totalPrice = 5.0;
        if (age >= 65) {
            totalPrice -= 0.25 * totalPrice;
        } else if (isStudent ) {
            totalPrice -= 0.1 * totalPrice;
        }
        if (isVip ) {
            totalPrice += 0.25 * totalPrice;
        }
        return totalPrice;

    }
}

