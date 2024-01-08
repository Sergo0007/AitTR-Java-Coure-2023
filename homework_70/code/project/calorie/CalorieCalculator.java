package project.calorie;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CalorieCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Integer> foodCalories = new HashMap<>();
        foodCalories.put("яблоко", 52);
        foodCalories.put("банан", 89);
        foodCalories.put("гречка", 130);
        foodCalories.put("куриная грудка", 165);
        foodCalories.put("рыба", 200);
        foodCalories.put("макароны", 131);
        foodCalories.put("хлеб", 265);
        foodCalories.put("сыр", 402);
        foodCalories.put("йогурт", 59);
        foodCalories.put("кофе", 2);
        foodCalories.put("чай", 0);
        foodCalories.put("вода", 0);

        System.out.println("Введите продукты, которые вы съели сегодня (через запятую):");
        String[] foods = scanner.nextLine().split(",");
        int totalCalories = Arrays.stream(foods)
                .map(String::trim)
                .filter(foodCalories::containsKey)
                .mapToInt(foodCalories::get)
                .sum();
        System.out.printf("Вы съели %d калорий сегодня.%n", totalCalories);
    }

    }

