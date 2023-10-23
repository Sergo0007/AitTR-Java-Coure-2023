

import java.util.Random;

public class pelm {


    public static void main(String[] args) {



    // Часть 2:
// ```java


            int n = 30; // количество пельменей
            int minWeight = 25; // минимальный вес
            int maxWeight = 35; // максимальный вес
            int coinWeight = 15; // вес монеты

            int[] weights = new int[n];

            Random random = new Random();

// Помещение монеты в случайный пельмень
            int luckyPelmenIndex = random.nextInt(n);
            weights[luckyPelmenIndex] += coinWeight;

            for (int i = 0; i < n; i++) {
                int weight = random.nextInt(maxWeight - minWeight + 1) + minWeight;
                weights[i] += weight;
            }

// Поиск счастливого пельменя
            for (int i = 0; i < n; i++) {
                if (weights[i] > (minWeight + coinWeight)) {
                    System.out.println("Счастливый пельмень найден! Это пельмень номер " + (i + 1) + " с весом " + weights[i] + " г");
                    break;
                }
            }

        }
    }
