package model;

import java.time.LocalDate;
import java.util.Objects;

public class Prod {
    private long barCode;
    private String name;
    private String brand;
    private String category;
    private double price;
    private LocalDate expDate;

    public Prod(long barCode, String name, String brand, String category, double price, LocalDate expDate) {
        this.barCode = barCode;
        this.name = name;
        this.brand = brand;
        this.category = category;
        this.price = price;
        this.expDate = expDate;
    }

    public long getBarCode() {
        return barCode;
    }

    public String getName() {
        return name;
    }

    public String getBrand() {
        return brand;
    }

    public String getCategory() {
        return category;
    }

    public double getPrice() {
        return price;
    }

    public LocalDate getExpDate() {
        return expDate;
    }

    @Override
    public String toString() {
        return "Prod{" +
                "barCode=" + barCode +
                ", name='" + name + '\'' +
                ", brand='" + brand + '\'' +
                ", category='" + category + '\'' +
                ", price=" + price +
                ", expDate=" + expDate +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Prod prod = (Prod) o;
        return barCode == prod.barCode;
    }

    @Override
    public int hashCode() {
        return Objects.hash(barCode);
    }
}
