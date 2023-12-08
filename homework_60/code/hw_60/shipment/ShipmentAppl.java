package hw_60.shipment;
//         Задание 1. Создайте класс Container с полями: String label (маркировка) и List - список коробок
//                 с посылками. Создайте класс Box с полем: List - список посылок. Классы Container и Box
//                 являются итерируемыми. Создайте класс Parcel (посылка) с полем double weight - вес посылки.
//                 Создайте класс ShipmentAppl с методом main. Задумайте случайное количество
//                 контейнеров (от 100 до 200). В каждом контейнере задумайте случайное количество
//                 коробок (от 10 до 20). В каждой коробке задумайте случайное количество посылок (от 5 до 10).
//                 Предположим, что каждая посылка в среднем имеет вес = 2 кг.
//
//                 Задание 2. Подсчитайте общее количество посылок во всех ящиках и их общий вес.
//
//                 Задание 3. Найдите label того из контейнеров, в котором оказалось максимальное количество
//                 посылок.
//
//                 Задание 4. Найдите все контейнеры с максимальным количеством посылок.

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class ShipmentAppl {

    public static void main(String[] args) {
        List<Container> containers = generateContainers(100, 200);

        //Задание 2. Подсчитайте общее количество посылок во всех ящиках и их общий вес.
        int totalParcels = countParcels(containers);
        double totalWeight = calculateTotalWeight(containers);
        System.out.println("Total parcels: " + totalParcels);
        System.out.println("total weight: " + totalWeight + " kg");

        //3. Найдите label того из контейнеров, в котором оказалось максимальное количество посылок.

        String maxLabel = findContainerWithMaxParcels(containers);
        System.out.println("Label with maximum parcels: " + maxLabel);

        //4.Найдите все контейнеры с максимальным количеством посылок.
        List<Container> containersWithMaxParcels = findContainersWithMaxParcels(containers);
        System.out.println("Containers with maximum parcels: " + containersWithMaxParcels);


    }

    private static List<Container> generateContainers(int minContainers, int maxContainers) {
        Random random = new Random();
        List<Container> containers = new ArrayList<>();

        for (int i = 0; i < random.nextInt(maxContainers - maxContainers + 1) + maxContainers; i++) {
            containers.add(new Container("Container: " + (i + 1), generateBoxes()));
        }
        return containers;
    }

    private static List<Box> generateBoxes() {
        Random random = new Random();
        List<Box> boxes = new ArrayList<>();
        for (int i = 0; i < random.nextInt(20 - 10 + 1) + 10; i++) {
            boxes.add(new Box(generateParcels()));
        }
        return boxes;
    }

    private static List<Parcel> generateParcels() {
        Random random = new Random();
        List<Parcel> parcels = new ArrayList<>();

        for (int i = 0; i < random.nextInt(10 - 5 + 1) + 5; i++) {
            parcels.add(new Parcel(2.0));

        }
        return parcels;
    }

    private static int countParcels(List<Container> containers) {
        /*Метод stream() вызывается в списке контейнеров для создания потока объектов Container.
       Метод flatMap() вызывается в потоке для преобразования потока объектов Container в поток объектов Box.
       Метод mapToInt() вызывается в потоке объектов Box для сопоставления каждого объекта Box с количеством
       содержащихся в нем посылок.
       Метод sum() вызывается для потока целых чисел для вычисления общего количества посылок во всех контейнерах.*/

        return containers.stream()
                .flatMap(container -> container.boxes.stream())
                .mapToInt(box -> (int) box.parcels.stream().count())
                .sum();
    }

    private static double calculateTotalWeight(List<Container> containers) {
        /*Метод flatMap() вызывается в списке контейнеров для создания потока объектов Container.
        Метод flatMap() вызывается для потока объектов Container для преобразования потока объектов
        Box в поток объектов Parcel.
        Метод mapToDouble() вызывается в потоке объектов Parcel для сопоставления каждого объекта
        Parcel с его весом.
        Метод sum() вызывается в потоке doubles для вычисления общего веса всех посылок во всех контейнерах.*/
        return containers.stream()
                .flatMap(container -> container.boxes.stream())
                .flatMap(box -> box.parcels.stream())
                .mapToDouble(parcel -> parcel.weight)
                .sum();
    }

    /*
    Метод max() вызывается на потоке целых чисел, чтобы найти максимальное количество посылок
    во всех контейнерах.
    Метод orElse() вызывается на объекте OptionalInt, возвращаемом методом max(),
    чтобы вернуть “No containers”, если в контейнерах нет посылок.
    Метод map() вызывается на объекте Optional<Container>, возвращаемом методом max(),
    чтобы отобразить метку контейнера.
     */
    private static String findContainerWithMaxParcels(List<Container> containers) {
        return containers.stream()
                .max(Comparator.comparingInt(container -> (int) container.boxes.stream().flatMap(box -> box.parcels.stream()).count()))
                .map(container -> container.label)
                .orElse("No containers");
    }/*Метод stream() вызывается на списке containers для создания потока объектов Container.
     Метод flatMap() вызывается на потоке для преобразования потока объектов Container в поток объектов Box.
     Метод mapToInt() вызывается на потоке объектов Box для отображения каждого объекта Box на количество посылок, которые он содержит.
     Метод max() вызывается на потоке целых чисел, чтобы найти максимальное количество посылок во всех контейнерах.
     Метод orElse() вызывается на объекте OptionalInt, возвращаемом методом max(), чтобы вернуть 0, если в контейнерах нет посылок.
     Метод filter() вызывается на потоке объектов Container, чтобы отфильтровать все контейнеры, которые не содержат максимальное количество посылок.
     Метод collect() вызывается на отфильтрованном потоке объектов Container, чтобы собрать их в список.*/

    private static List<Container> findContainersWithMaxParcels(List<Container> containers) {
        int maxParcels = containers.stream()
                .flatMap(container -> container.boxes.stream())
                .mapToInt(box -> (int) box.parcels.stream().count())
                .max()
                .orElse(0);


        return containers.stream()
                .filter(container -> container.boxes.stream().flatMap(box -> box.parcels.stream()).count() == maxParcels)
                .collect(Collectors.toList());
    }
      /*
      Вывод на консоль
      Total parcels: 17339
      total weight: 34678.0 kg
      Label with maximum parcels: Container: 185
      Containers with maximum parcels: []
       */

}
