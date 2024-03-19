package models;

public abstract class Account {
    private int accountNumber;
    private double totalBalance;
    private double availableBalance;

    public double getAvailableBalance() {
        return availableBalance;
    }
}
