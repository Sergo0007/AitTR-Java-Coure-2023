package hw_57;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class DigitFrqAppl {
    public static void main(String[] args) {

        int[] numbers = new int[1000000];
        numbers = generateNum(numbers);
        //3444444444
        //678453332277
        //90563428444111
        //щаг 1 каждое число надо разбить на цифры
        // шаг 2 все эти цифры направить в МАР
        Map<Integer, Integer> digits = printNumbersFrq(numbers);
        printDigitFrequency(digits);
    }

    private static void printDigitFrequency(Map<Integer, Integer> digitFrequency) {
        System.out.println("Частота встречаемости цифр: ");
        for (Map.Entry<Integer, Integer> entry : digitFrequency.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }


    }

    private static Map<Integer, Integer> printNumbersFrq(int[] numbers) {
        Map<Integer, Integer> digitFrequency = new HashMap<>();
        for (int number : numbers) {
            while (number > 0) {
                int digit = number % 10;

                digitFrequency.put(digit, digitFrequency.getOrDefault(digit, 0) + 1);
                number /= 10;
            }

        }return digitFrequency;

    }


    private static int[] generateNum(int[] arr) {
        Random random = new Random();
        int min = 1;
        int max = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(max + 1 - min) + min;

        }
        return arr;

    }


}

