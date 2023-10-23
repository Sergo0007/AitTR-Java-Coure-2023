public class Ticket {
    public static void main(String[] args) {

        int ticket = 55;
        int workingDays = 21;
        int weekend = 9;
        System.out.println("Общее количество поездок без округления до целого числа: " + totalTrips(workingDays, weekend));
        int roundedTotalTrips = 56; // Цель, решить данную задачу не выходя за рамки знаний полученных на занятии.
        System.out.println("Общее количество поездок: " + roundedTotalTrips);
        System.out.println("Средняя стоимость одной поездки: " + costTrip(100, 56) + " доллар");

    }

    public static double totalTrips(int workingDays, int weekend) {
        double totalTrips = workingDays * 2 + weekend * 1.5;
        return totalTrips;
    }

    public static int costTrip(int ticket, int roundedTotalTrips) {
        int costTrip = ticket / roundedTotalTrips;
        return costTrip;
    }
}