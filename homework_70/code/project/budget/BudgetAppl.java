package project.budget;

import project.budget.dao.BudgetImpl;
import project.budget.model.Menu;
import project.budget.model.Product;
import project.budget.model.Purchase;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;

public class BudgetAppl {
    private static final String SAVE_PATH = "lesson_68/code/family_budget/Family-budget.csv";
    public static void main(String[] args) {
        AtomicInteger idCounter = new AtomicInteger(1);//автоматический счетчик покупок
        List<Purchase> purchaseList = new ArrayList<>();
        List<Product>productList = new ArrayList<>();

        BudgetImpl budget = new BudgetImpl(purchaseList, 0);
        LocalDate now = LocalDate.now();

        Scanner scanner = new Scanner(System.in);
        System.out.println(" - Welcome to Family Budget Application - ");
        System.out.println(" - Enter month of purchase- ");
        String month = scanner.next();
        while (true){
            Menu.printMenu();
            System.out.println("Input your choice: ");

            int choice = scanner.nextInt();
            switch (choice){
                case 1 ->{ //Add Budget
                    System.out.println("Input your budget amount: ");
                    double budg = scanner.nextDouble();
                    budget = new BudgetImpl(purchaseList, budg);
                    System.out.println("Your budget for month " + month + " is: " + budg);
                }
                case 2 ->{//View of purchases
                    System.out.println("Your purchases for " + month);
                    budget.print();
                }
                case 3 -> {//Load new purchases
                    System.out.print(" \nEnter your family member:");
                    //  FamilyMember.printFamilyMenu();
                    int personId = scanner.nextInt();
                    System.out.print(" \nPlease enter the name of the store:");
                    String store = scanner.next();
                    System.out.print(" \nPlease enter your bill amount:");
                    double totalCost = scanner.nextDouble();
                   // budget.addPurchase(new Purchase(idCounter.getAndIncrement(),now,totalCost,store,person,productList));
                    budget.print();
                }
                case 4 ->{ //Remove purchase
                    budget.print();
                    System.out.println("Enter your purchase number to remove:");
                    int num = scanner.nextInt();
                    budget.removePurchase(num);
                    budget.print();
                }
                case 5 -> {//Searching purchases by store
                    System.out.print("Enter the store:");
                    String store = scanner.next();
                    purchaseList= budget.sortByStore(store);
                    purchaseList.forEach(System.out::println);
                    System.out.println(budget.budgetByStore(store));
                }
                case 6 -> {//Searching purchases by person
                    System.out.print("Enter your Name:");
                    String person = scanner.next();
                    purchaseList= budget.sortByPerson(person);
                    purchaseList.forEach(System.out::println);
                    System.out.println(budget.budgetGetPerson(person));
                }
                case 7 -> {//Searching purchases by period
                    System.out.print(" \nВведите Date From(yyyy-MM-dd):");
                    String startDay = scanner.next();
                    System.out.print(" \nВведите Date To(yyyy-MM-dd):");
                    String endDay = scanner.next();
                    DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("yyyy-MM-dd");
                    LocalDate  dateFrom= LocalDate.parse(startDay, dateFormat);
                    LocalDate dateTo = LocalDate.parse(endDay, dateFormat);
                    purchaseList= budget.sortByPeriod(dateFrom,dateTo);
                    purchaseList.forEach(System.out::println);
                    //budget.budgetByPeriod() todo подумать надо ли менять на дату?
                }
                case 8 -> {//Check your current budget
                    double currentBudget = budget.checkBudget();
                    System.out.println("Your budget for " + month + " : " + currentBudget);

                }
                case 9 -> {//Exit
                    savePurchases(budget.collect());
                    System.out.println(" - Good Bye! - ");
                    System.exit(0);
                }
                default -> {
                    System.out.println("Wrong choice");
                }
                /*catch (Exception e){
                        System.out.println("Wrong input");
                    }*/
            }
        }
    }
    private static void savePurchases(List<Purchase> purchases){
        try (PrintWriter writer = new PrintWriter(new FileWriter(SAVE_PATH, true))) {
            writer.println("Purchases: ");
            for (Purchase p :purchases){
                writer.printf("Number: %s, Date: %s, Price: %.2f, Store: %s, Person: %s, Products: %s%n",
                        p.getId(), p.getData(), p.getTotalCost(),
                        p.getStore(), p.getPerson(), p.getProducts());
            }
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Error saving purchases to file.");
        }
    }
}
