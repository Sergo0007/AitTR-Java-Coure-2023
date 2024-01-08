package project.transaction;

//import java.io.File;
//import java.io.FileWriter;
//import java.io.IOException;
//import java.io.PrintWriter;
//import java.util.Scanner;
//
//public class CurrencyConverter {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        Exchange exchange = new Exchange();
//        try (Scanner fileScanner = new Scanner(new File("currencies.txt"))) {
//            while (fileScanner.hasNextLine()) {
//                String[] parts = fileScanner.nextLine().split(" ");
//                Currency currency = Currency.valueOf(parts[0]);
//                double rate = Double.parseDouble(parts[1]);
//                currency =  new Currency(rate);
//            }
//        } catch (IOException e) {
//            System.err.println("Ошибка чтения из файла: " + e.getMessage());
//        }
//        System.out.println("Введите валюту, которую вы хотите обменять (USD, EUR, GBP, JPY):");
//        Currency currency = Currency.valueOf(scanner.nextLine().toUpperCase());
//        System.out.println("Введите количество денег, которые вы хотите обменять:");
//        double amount = scanner.nextDouble();
//        double result = amount * currency.getRate();
//        System.out.printf("Сумма к выдаче: %.2f %s\n", result, currency);
//        exchange.addTransaction(new Transaction(currency, amount, result));
//        // Сохраняем все сделанные транзакции в файл
//        try (PrintWriter writer = new PrintWriter(new FileWriter("transactions.txt", true))) {
//            writer.printf("%s %.2f -> %.2f RUB\n", currency, amount, result);
//        } catch (IOException e) {
//            System.err.println("Ошибка записи в файл: " + e.getMessage());
//        }
//        exchange.printReport();
//    }
//    }

