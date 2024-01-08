package practice.family_budget.test;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import practice.family_budget.dao.BudgetImpl;
import practice.family_budget.model.Budget;
import practice.family_budget.model.Product;
import practice.family_budget.model.Purchase;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BudgetImplTest {
    List<Purchase> purchaseList = new ArrayList<>();
    List<Product> productList = new ArrayList<>();
    List<Purchase> purchaseList2 = new ArrayList<>();


    BudgetImpl budget = new BudgetImpl(purchaseList,0);



    @BeforeEach
    void setUp() {
        productList = List.of(new Product("Milk",1.0,2),
                new Product("wine",3.0,1),
                new Product("bread",1.5,3),
                new Product("chocolate",0.6,2),
                new Product("salt",0.7,3)
                );
        purchaseList = List.of(
                new Purchase(1, LocalDate.of(2023,12,01),50,"Lidl","Mama",productList),
                new Purchase(2, LocalDate.of(2023,12,11),150,"Lidl","Mama",productList),
                new Purchase(3, LocalDate.of(2023,12,02),20,"Aldi","Mama",productList),
                new Purchase(4, LocalDate.of(2023,12,04),70,"Penny","Papa",productList)

        );
//        purchaseList2 = List.of( new Product("bread",1.5,3),
//                new Product("chocolate",0.6,2),
//                new Product("salt",0.7,3),
//                new Product("bread",1.5,3)
//        );
//        for (Purchase p : purchaseList){
   //         budget.addPurchase(p);//заполняем бюджет
        }
       double b = budget.calcBudget();
    //    System.out.println(b);
    //}

    @Test
    void addPurchase() {
        assertFalse(budget.addPurchase(null));
        assertFalse(budget.addPurchase(purchaseList.get(0)));
       Purchase p = new Purchase(5, LocalDate.of(2023,10,11),70,"Penny","Papa",productList);
        assertTrue(budget.addPurchase(p));
        double b = budget.calcBudget();
        System.out.println(b);

    }

    @Test
    void calcBudget() {
    //    assertEquals(945,budget.checkBudget());

    }

    @Test
    void budgetByPerson() {
        assertEquals(900,budget.budgetByPerson("Ded"));

    }

    @Test
    void budgetByStore() {
        assertEquals(10.5,budget.budgetByStore("Lidl"));
    }

    @Test
    void budgetByPeriod() {
        assertEquals(100,budget.budgetByPeriod(LocalDate.of(2023,12,01),LocalDate.of(2023,12,20)));
    }

    @Test
    void addMoney() {
        assertEquals(100,budget.addMoney(1000));
    }

    @Test
    void checkBudget() {
    }

    @Test
    void checkMoney() {
    }
}