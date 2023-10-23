public class WeatherUndArray {
    //     Собрать в массив данные о дневной температуре в вашем городе да прошедшую неделю.
//     Выведите на печать температуру, которая была во вторник и затем в четверг.
//     Найти среднюю температуру за прошлую неделю.
    public static void main(String[] args) {

        double[] temperature = {17.0, 20.0, 22.0, 23.0, 25.0, 24.0, 23.0};
        System.out.println("Температура во вторник: " + temperature[1] + " градуса");
        System.out.println("Температура во четверг: " + temperature[3] + " градуса");

        double sum = 0.0;
        for (int i = 0; i < temperature.length; i++) {
            sum += temperature[i];

        }
        double averageTemperature = sum / temperature.length;

        System.out.println("Средеяя температура за неделю:   " + averageTemperature + " градуса");

    }

}



