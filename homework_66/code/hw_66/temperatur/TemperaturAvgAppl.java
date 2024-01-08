package hw_66.temperatur;
//        Задача 2. В массиве с ночной температурой за прошедшие 2 недели выяснить сколько раз ночью была
//        минусовая температура. В какой из дней наблюдений случился первый заморозок?
//        Когда был такой последний день? Какая максимальная температура была за период наблюдений?
//        В какой день это было? Какая минимальная температура была за период наблюдений? В какой день это было?
//        Какая средняя ночная температура была за период наблюдений? Были ли периоды, когда минус ночью держался
//        несколько дней подряд?

public class TemperaturAvgAppl {
    public static void main(String[] args) {


        int[] nightTemperatures = {-2, 0, 3, -1, -5, 2, 1, -3, 0, -4, -2, 1, -1, -6};

        int negativeTemperatureCount = 0;
        int firstFreezeDay = -1;
        int lastFreezeDay = -1;
        int maxTemperature = Integer.MIN_VALUE;
        int minTemperature = Integer.MAX_VALUE;
        int totalTemperature = 0;
        int consecutiveFreezeDays = 0;
        int maxConsecutiveFreezeDays = 0;

        for (int i = 0; i < nightTemperatures.length; i++) {
            int temperature = nightTemperatures[i];

            if (temperature < 0) {
                negativeTemperatureCount++;
                if (firstFreezeDay == -1) {
                    firstFreezeDay = i + 1;
                }
                lastFreezeDay = i + 1;

                consecutiveFreezeDays++;
                if (consecutiveFreezeDays > maxConsecutiveFreezeDays) {
                    maxConsecutiveFreezeDays = consecutiveFreezeDays;
                }
            } else {
                consecutiveFreezeDays = 0;
            }

            if (temperature > maxTemperature) {
                maxTemperature = temperature;
            }

            if (temperature < minTemperature) {
                minTemperature = temperature;
            }

            totalTemperature += temperature;
        }

        int averageTemperature = totalTemperature / nightTemperatures.length;

        System.out.println("Количество минусовых ночных температур: " + negativeTemperatureCount);
        System.out.println("Первый заморозок произошел " + firstFreezeDay + " день наблюдений");
        System.out.println("Последний заморозок произошел " + lastFreezeDay + " день наблюдений");
        System.out.println("Максимальная температура: " + maxTemperature + " была зафиксирована в день " + (indexOf(nightTemperatures, maxTemperature) + 1));
        System.out.println("Минимальная температура: " + minTemperature + " была зафиксирована в день " + (indexOf(nightTemperatures, minTemperature) + 1));
        System.out.println("Средняя ночная температура: " + averageTemperature);
        System.out.println("Максимальное количество дней с минусовой ночной температурой подряд: " + maxConsecutiveFreezeDays);
    }

    private static int indexOf(int[] array, int value) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == value) {
                return i;
            }
        }
        return -1;


    }


}




