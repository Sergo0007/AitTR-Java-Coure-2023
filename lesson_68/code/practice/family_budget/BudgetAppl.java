package practice.family_budget;

import practice.family_budget.dao.BudgetImpl;
import practice.family_budget.model.Menu;
import practice.family_budget.model.Product;
import practice.family_budget.model.Purchase;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;

public class BudgetAppl {
    public static void main(String[] args) {
        AtomicInteger idCounter = new AtomicInteger(1);
        List<Purchase> purchaseList = new ArrayList<>();// ?
        List<Product> productList = new ArrayList<>();// ok

        BudgetImpl budget = new BudgetImpl(purchaseList, 0);
        LocalDate now = LocalDate.now();

        while (true) {

            Menu.printMenu();
            Scanner scanner = new Scanner(System.in);
            System.out.println("Input your choice: ");


            int choice = scanner.nextInt();

            switch (choice) {
                case 1 -> {
                    System.out.println("Input budget amount: ");
                    double b = scanner.nextDouble();


                    break;
                }
                case 2 -> {
                    //load data
                    //распечатать
                    System.out.println("Ввод данных");
                    System.out.println("\nВведите Person ");
                    String person = scanner.next();

                    break;

                }
                case 3 -> {
                    System.out.println("Purchases by Stores: ");
                    //вызвать метод и распечатать

                    System.out.print(" \nВведите Store:");
                    String store = scanner.next();
                 //   purchaseList = budget.sortByStore(store);
                    purchaseList.forEach(System.out::println);
                }
                case 4 -> {
                    System.out.println("Purchases by Person: ");
                    //вызвать метод и распечатать
                    System.out.println(" \nВведите Store:");
                    String person = scanner.next();
                  //  purchaseList = budget.sortByPerson(person);
                    purchaseList.forEach(System.out::println);
                }
                case 5 -> {
                    System.out.println("Purchases by Period: ");
                    //вызвать метод и распечатать
                    System.out.println("Purchases by Period: ");
                    System.out.println("\nEnter start date (yyyy-MM-dd): ");
                    String startDateString = scanner.next();
                    LocalDate startDate = LocalDate.parse(startDateString);

                    System.out.println("Enter end date (yyyy-MM-dd): ");
                    String endDateString = scanner.next();
                    LocalDate endDate = LocalDate.parse(endDateString);

                  //  purchaseList = budget.sortByPeriod(startDate, endDate);
                    purchaseList.forEach(System.out::println);
                }
                case 6 -> {
                    System.out.println("Input amount of purchase: ");
                    //вызвать метод и распечатать  System.out.println("Check budget: ");
                     //  double currentBudget = budget.checkBudget();
                      // System.out.println("Current budget: " + currentBudget);
                }
                case 7 ->{
                    System.out.println("Remove purchase: ");
                    System.out.println("Enter purchase ID to remove: ");
                    int purchaseIdToRemove = scanner.nextInt();
                  //  boolean removed = budget.removePurchase(purchaseIdToRemove);

                 //   if (removed) {
                        System.out.println("Purchase with ID " + purchaseIdToRemove + " removed successfully.");
                 //   } else {
                        System.out.println("Purchase not found with ID " + purchaseIdToRemove);
                    }

                }
//                case 8 ->{
//                    System.out.println("Exiting the program.");
//                    return;


                }
            }


            }
  //      }
  //  }