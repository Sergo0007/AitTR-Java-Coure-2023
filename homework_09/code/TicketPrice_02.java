public class TicketPrice_02 {
    public static void main(String[] args) {

            double ticketPricePensioner = calculateTicketPrice(65, false, false);
            double ticketPriceStudent = calculateTicketPrice(20, true, false);
            double ticketPriceVIP = calculateTicketPrice(40, false, true);

            System.out.println("Стоимость билета для пенсионера: " + ticketPricePensioner + " евро");
            System.out.println("Стоимость билета для студента: " + ticketPriceStudent + " евро");
            System.out.println("Стоимость билета для VIP посетителя: " + ticketPriceVIP + " евро");
        }

        public static double calculateTicketPrice(int age, boolean isStudent, boolean isVIP) {
            double basePrice = 5.0;

            if (age >= 65) {
                basePrice *= 0.75; // Скидка 25% для пенсионеров
            } else if (isStudent) {
                basePrice *= 0.9; // Скидка 10% для студентов
            }

            if (isVIP) {
                basePrice *= 1.25; // Дополнительная плата 25% за VIP-место
            }

            return basePrice;
        }
    }

