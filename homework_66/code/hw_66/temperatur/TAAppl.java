package hw_66.temperatur;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalInt;

public class TAAppl {
    public static void main(String[] args) {
//        В массиве с ночной температурой за прошедшие 2 недели выяснить сколько раз ночью была
//        минусовая температура.
        List<Integer> nighTemperatures = Arrays.asList(-2, 0, 3, -1, -5, 2, 1, -3, 0, -4, -2, 1, -1, -6);
        long nightsWithSubzeroTemperatures = nighTemperatures.stream()
                .filter(n -> n < 0)
                .count();
        System.out.println("the number of nights with sub-zero temperatures in two weeks: "
                + nightsWithSubzeroTemperatures);

        //В какой из дней наблюдений случился первый заморозок?
        int firstFreezeDay = nighTemperatures.indexOf(nighTemperatures.stream()
                .filter(f -> f < 0)
                .findFirst()
                .orElse(-1));
        System.out.println(firstFreezeDay >= 0 ? "The first day with sub-zero temperatures is day "
                + (firstFreezeDay + 1) : firstFreezeDay);

        //Когда был такой последний день?
        int lastFreezeDay = nighTemperatures.lastIndexOf(nighTemperatures.stream()
                .filter(l -> l < 0)
                .findFirst()
                .orElse(-1));
        System.out.println("The last day with sub-zero temperatures " + (lastFreezeDay + 1));

        //Какая максимальная температура была за период наблюдений?
        // В какой день это было?
        int maxTemperature = nighTemperatures.stream()
                .mapToInt(Integer::intValue)
                .max()
                .orElse(0);
        System.out.println("Maximum temperature:" + maxTemperature + " ,on day: " +
                (nighTemperatures.indexOf(maxTemperature) + 1));

        // Какая минимальная температура была за период наблюдений? В какой день это было?
        int minTemperature = nighTemperatures.stream()
                .mapToInt(Integer::intValue)
                .min()
                .orElse(0);
        System.out.println("Minimum temperature: " + minTemperature + " ,on day: " +
                (nighTemperatures.indexOf(minTemperature) + 1));

        //Какая средняя ночная температура была за период наблюдений?
        double averageTemperature = nighTemperatures.stream()
                .mapToInt(Integer::intValue)
                .average()
                .orElse(0);
        System.out.printf("Average night temperature: %.2f ", averageTemperature);

        // Были ли периоды, когда минус ночью держался
        // несколько дней подряд?
        /*
        Метод anyMatch() вызывается на потоке nighTemperatures. Он возвращает логическое значение,
        указывающее, соответствует ли какой-либо элемент потока заданному предикату.
        Предикат определяется как лямбда-выражение, которое проверяет, является ли текущий элемент меньше нуля,
        и если следующий элемент также меньше нуля. Если оба условия истинны, то предикат возвращает true.
        Метод indexOf() вызывается на списке nighTemperatures, чтобы получить индекс текущего элемента.
        Метод size() вызывается на списке nighTemperatures, чтобы получить размер списка.
        Метод indexOf() вызывается снова на списке nighTemperatures, чтобы получить индекс следующего элемента.
        Метод get() вызывается на списке nighTemperatures, чтобы получить следующий элемент.
        Если предикат возвращает true для любого элемента в потоке, то метод anyMatch() возвращает true.
        Вызов System.out.println() выводит результат метода anyMatch() в консоль.
         */
        boolean consecutiveSubZeroNights = nighTemperatures.stream()
                .anyMatch(n -> n < 0 && nighTemperatures.indexOf(n) < nighTemperatures.size() - 1 &&
                        nighTemperatures.get(nighTemperatures.indexOf(n) + 1) < 0);
        System.out.println("Consecutive nights with sub-zero temperatures: " + consecutiveSubZeroNights);


    }
}
