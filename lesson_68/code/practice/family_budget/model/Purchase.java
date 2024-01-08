package practice.family_budget.model;

import java.time.LocalDate;
import java.util.List;
import java.util.Objects;

public class Purchase implements Comparable<Purchase> {

    private int id;
    private LocalDate data;
    private double cost;
    private String store;//поставщик
    private String person;
    private List<Product> products;

    public Purchase(int id, LocalDate data, double totalCast, String store, String person, List<Product> products) {
        this.id = id;
        this.data = data;
        this.cost = calculatePurchaseCost(products);
        this.store = store;
        this.person = person;
        this.products = products;
    }

    public int getId() {
        return id;
    }

    public LocalDate getData() {
        return data;
    }

    public double getCost() {
    return calculatePurchaseCost(products);
    }

    public String getStore() {
        return store;
    }

    public String getPerson() {
        return person;
    }

    public List<Product> getProducts() {
        return products;
    }
    public double calculatePurchaseCost(List<Product>productList){
        return productList.stream()
                .mapToDouble(p -> p.getPrice() * p.getQuantity())
                .sum();



    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Purchase purchase = (Purchase) o;
        return id == purchase.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "Purchase{" +
                "id=" + id +
                ", data=" + data +
                ", totalCast=" + cost +
                ", store='" + store + '\'' +
                ", person='" + person + '\'' +
                ", products=" + products +
                '}';
    }


    @Override
    public int compareTo(Purchase o) {
        return this.data.compareTo(o.getData());
    }
}
