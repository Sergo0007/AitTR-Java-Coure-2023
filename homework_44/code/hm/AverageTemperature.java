package hm;

public class AverageTemperature {
    public static void main(String[] args) {
        double[] temperature1 = {10.5,12.0,13.5,15.3,11.4,10.2,9.4};
        double[] temperature2 = {9.5,11.0,12.5,11.3,8.4,7.5,6.9};

        double sum = 0.0;
        for (int i = 0; i < temperature1.length; i++) {
            sum += temperature1.length;
        }

        for (double temperature : temperature2){
            sum += temperature;
        }
        double average = sum  / (temperature1.length + temperature2.length);
        System.out.printf("Средняя температура за последнюю неделю октября и первую ноября: " + "%.2f",average );

    }
}
