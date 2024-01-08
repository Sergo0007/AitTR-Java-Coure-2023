package practice.family_budget.dao;

import practice.family_budget.model.Budget;
import practice.family_budget.model.Purchase;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class BudgetImpl implements Budget {
    //field
    List<Purchase> purchaseList;
    double budget;

    //constructor


    public BudgetImpl(List<Purchase> purchaseList, double budget) {
        this.purchaseList = new ArrayList<>();//возможен HashSet ,TreeSet подумать
        this.budget = budget;
    }

    @Override
    public boolean addPurchase(Purchase purchase) {
        //если бюджет позволяет ?
        //проверка на уникальность
        if (purchase == null || purchaseList.contains(purchase)){
            return false;

        }
        return purchaseList.add(purchase);

    }

    @Override
    public double calcBudget() {

        return purchaseList.stream()
                .mapToDouble(Purchase::getCost)
                .sum();
    }

    @Override
    public double budgetByPerson(String person) {
        return purchaseList.stream()
                .filter(purchase -> purchase.getPerson().equals(person))
                .mapToDouble(Purchase::getCost)
                .sum();
    }

    @Override
    public double budgetByStore(String store) {
        return purchaseList.stream()
                .filter(purchase -> purchase.getStore().equals(store))
                .mapToDouble(Purchase::getCost)
                .sum();
    }

    @Override
    public double budgetByPeriod(LocalDate from, LocalDate to) {
        return purchaseList.stream()
                .filter(purchase -> purchase.getData().isAfter(from) && purchase.getData().isBefore(to))
                .mapToDouble(Purchase::getCost)
                .sum();
    }

    @Override
    public double addMoney(double money) {
        return budget + money;
    }

    @Override
    public boolean checkBudget(Purchase purchase) {
        return budget >= calcBudget();
    }

    @Override
    public double checkMoney(Purchase purchase) {
        return budget - calcBudget();
    }

    @Override
    public Purchase removePurchase(int id) {
        return null;
    }


}
