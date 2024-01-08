package project.transaction;

import java.util.HashMap;
import java.util.Map;

public class Exchange {
       Map<Currency, Double> purchases = new HashMap<>();
       Map<Currency, Double> sales = new HashMap<>();

//   public void addTransaction(Transaction transaction) {
//        if (transaction.getResult() > 0) {
//            purchases.put(transaction.getCurrency(), purchases.getOrDefault(transaction.getCurrency(), 0.0) + transaction.getAmount());
//        } else {
//           sales.put(transaction.getCurrency(), sales.getOrDefault(transaction.getCurrency(), 0.0) + transaction.getAmount());
//        }
//    }

    public void printReport() {
        System.out.println("Отчет о сумме обменов по каждой валюте:");
        System.out.println("Покупка:");
        for (Map.Entry<Currency, Double> entry : purchases.entrySet()) {
            System.out.printf("%s: %.2f\n", entry.getKey(), entry.getValue());
        }
        System.out.println("Продажа:");
        for (Map.Entry<Currency, Double> entry : sales.entrySet()) {
            System.out.printf("%s: %.2f\n", entry.getKey(), entry.getValue());
        }
    }


}
