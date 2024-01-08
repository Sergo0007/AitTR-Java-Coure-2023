package practice.family_budget.model;

import java.time.LocalDate;
import java.util.List;

public interface Budget {
    boolean addPurchase(Purchase purchase);

    double calcBudget();

    double budgetByPerson(String person);



    double budgetByStore(String store);

    double budgetByPeriod(LocalDate from, LocalDate to);

    double addMoney(double money);

    boolean checkBudget(Purchase purchase);

    double checkMoney(Purchase purchase);

    Purchase removePurchase(int id);

}
