public class Aufgabe {

    public static void main(String[] args) {

        int euro = 100;
        double course = 2.5;

        System.out.println("100 евро стоит: =  " + exchange(euro,course) +  " долларов" );
        System.out.println("Сегодня утром, при открыти биржи курс доллара был опущен ниже плитнуса");

        System.out.println("********");

        double m = 0.3048;
        int f = 100;
        System.out.println("100 футов: = " + footInMeters(f,m) + " метров");

        System.out.println("--------");

        int ticket = 55;
        int workingDays = 21;
        int weekend = 9;
        System.out.println("Общее количество поездок без округления до целого числа: " + totalTrips(workingDays,weekend));
        int roundedTotalTrips = 56; // Цель, решить данную задачу не выходя за рамки знаний полученных на занятии.
        System.out.println("Общее количество поездок: " + roundedTotalTrips);

        System.out.println("Средняя стоимость одной поездки: " + costTrip(100,56) + " доллар");






    }
    public static double exchange(int euro,double course){
        double exchange = euro * course;
        return exchange;
    }

    public static double footInMeters(int f,double m){
        double footInMeters = f / m;
        return footInMeters;


    }
    public static double totalTrips( int workingDays,int weekend){
        double totalTrips = workingDays * 2 + weekend * 1.5;
        return totalTrips;
    }
    public  static int costTrip(int ticket, int roundedTotalTrips){
        int costTrip = ticket / roundedTotalTrips;
        return costTrip;

    }

    }





