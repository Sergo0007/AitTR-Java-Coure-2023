package project.budget.test;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import project.budget.dao.BudgetImpl;
import project.budget.model.Product;
import project.budget.model.Purchase;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BudgetImplTest {
    List<Purchase> purchaseList = new ArrayList<>();
    List<Product> productList = new ArrayList<>();
    List<Product> productList1 = new ArrayList<>();
    List<Product> productList2 = new ArrayList<>();
    List<Product> productList3 = new ArrayList<>();
    List<Product> productList4 = new ArrayList<>();

    BudgetImpl budget = new BudgetImpl(purchaseList ,0);

    @BeforeEach
    void setUp() {
        productList = List.of(
                new Product("milk", 1.0, 2),
                new Product("wine", 3.0, 1),
                new Product("bred", 1.5, 3),
                new Product("chocolate", 0.5, 2),
                new Product("salt", 1, 3)
        );
        productList1 = List.of(
                new Product("milk", 1.0, 2),
                new Product("wine", 3.0, 1),
                new Product("bred", 1.5, 3),
                new Product("chocolate", 0.5, 2),
                new Product("salt", 1, 3)
        );
        productList2 = List.of(
                new Product("milk", 1.0, 2),
                new Product("wine", 3.0, 1),
                new Product("bred", 1.5, 3)
        );
        productList3 = List.of(
                new Product("bred", 1.5, 3),
                new Product("chocolate", 0.5, 2),
                new Product("salt", 1, 3)
        );
        productList4 = List.of(
                new Product("sofa", 900, 1)
        );
        purchaseList = List.of(
                new Purchase(1,LocalDate.of(2023,12,10),10,"Penny","Mama",productList1),
                new Purchase(2, LocalDate.of(2023,12,11), 23,"Aldi", "Mama", productList2),
                new Purchase(3, LocalDate.of(2023,12,01), 55,"Penny", "Mama", productList1),
                new Purchase(4, LocalDate.of(2023,12,12),  65,"Action", "Tolik", productList3),
                new Purchase(5, LocalDate.of(2023, 12, 20), 70,"Ikea", "Dad", productList4)
        );
        for (Purchase p : purchaseList) {
            budget.addPurchase(p); //заполняем бюджет
        }

    }

    @Test
    void addPurchase() {
        assertFalse(budget.addPurchase(null));
        assertTrue(budget.addPurchase(purchaseList.get(0)));
        Purchase p = new Purchase(5, LocalDate.of(2023,10,11), 5.0,"Aldi", "Mama", productList2);
        assertTrue(budget.addPurchase(p));
//        double b = budget.calcBudget();
//        System.out.println(b);
    }

    @Test
    void budgetGetPerson() {
        assertEquals(88.0, budget.budgetGetPerson("Mama"));
    }

    @Test
    void sortByPerson() {
        List<Purchase> sortedList = budget.sortByPerson("Dad");
        assertFalse( sortedList.isEmpty());
    }

    @Test
    void budgetByStore() {
        assertEquals( 0.0,budget.budgetByStore("xxx"));
        //assertEquals(0.0, budget.budgetByStore("Action"));
    }

    @Test
    void sortByStore() {
        List<Purchase> sortedList = budget.sortByStore("Penny");
        assertFalse(sortedList.isEmpty());

    }

    @Test
    void budgetByPeriod() {
        assertEquals(168, budget.budgetByPeriod(LocalDate.of(2023, 12, 01), LocalDate.of(2023, 12, 21)));
    }

    @Test
    void sortByPeriod() {
        LocalDate from = LocalDate.of(2023, 1, 1);
        LocalDate to = LocalDate.of(2023, 1, 15);
        List<Purchase> sortedList = budget.sortByPeriod(from, to);
        assertTrue(sortedList.isEmpty());
    }

    @Test
    void calcBudget() {
        assertEquals(223.0, budget.calcBudget());
    }

    @Test
    void checkBudget() {
        assertEquals(-223.0, budget.checkBudget());

    }

    @Test
    void removePurchase() {
        assertEquals(5, budget.collect().size());

    }

    @Test
    void print() {
        budget.print();
    }

    @Test
    void collect() {
        budget.collect();
        
    }
}