package project.transaction;

public enum Currency {
    USD(1.0),EUR(0.85),GBR(0.72),JPY(110.0);
    private double rate;

    Currency(double rate) {
        this.rate = rate;
    }
}
