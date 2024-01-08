package project.transaction;

import java.util.Currency;
import java.util.Objects;

public class Transaction {
    private Currency currency;
    private double amount;
    private double result;

    public Transaction(Currency currency, double amount, double result) {
        this.currency = currency;
        this.amount = amount;
        this.result = result;
    }

    public Currency getCurrency() {
        return currency;
    }

    public double getAmount() {
        return amount;
    }

    public double getResult() {
        return result;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Transaction that = (Transaction) o;
        return Double.compare(that.amount, amount) == 0 && Double.compare(that.result, result) == 0 && Objects.equals(currency, that.currency);
    }

    @Override
    public int hashCode() {
        return Objects.hash(currency, amount, result);
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "currency=" + currency +
                ", amount=" + amount +
                ", result=" + result +
                '}';
    }
}
