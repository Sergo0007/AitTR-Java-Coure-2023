package project.converter;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CurrencyConverter {
    private static final String CURRENCY_FILE_PATH = "currencies.txt";
    private static final String TRANSACTION_FILE_PATH = "transactions.txt";

    private static Map<String, Double> exchangeRates = new HashMap<>();

    public static void main(String[] args) {
        loadExchangeRates();

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Введите код валюты (USD, EUR, etc.) или 'exit' для завершения:");
            String currencyCode = scanner.nextLine().toUpperCase();

            if (currencyCode.equals("EXIT")) {
                break;
            }

            if (!exchangeRates.containsKey(currencyCode)) {
                System.out.println("Неверный код валюты. Повторите попытку.");
                continue;
            }

            System.out.println("Введите сумму для обмена:");
            double amount = scanner.nextDouble();

            double result = exchangeCurrency(currencyCode, amount);

            System.out.println("Сумма к выдаче: " + result);

            // Здесь вы можете добавить логику для сохранения транзакции в файл

            scanner.nextLine(); // Очистка буфера после ввода числа
        }

        // Здесь вы можете добавить логику для сохранения отчета по всем транзакциям в файл
    }

    private static void loadExchangeRates() {
        try (BufferedReader reader = new BufferedReader(new FileReader(CURRENCY_FILE_PATH))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                String currencyCode = parts[0].toUpperCase();
                double exchangeRate = Double.parseDouble(parts[1]);
                exchangeRates.put(currencyCode, exchangeRate);
            }
        } catch (IOException | NumberFormatException e) {
            e.printStackTrace();
        }
    }

    private static double exchangeCurrency(String currencyCode, double amount) {
        double exchangeRate = exchangeRates.get(currencyCode);
        return amount * exchangeRate;
    }
}
