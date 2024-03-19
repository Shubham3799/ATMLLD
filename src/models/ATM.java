package models;

public class ATM {

    private String atmId;
    private Address address;

    private CashDispenser cashDispenser;
    private Keypad keypad;
    private Screen screen;
    private Printer printer;
    private CashDeposit cashDeposit;

    public boolean authenticateUser(){
        //logic to auth
        return true;
    }
    public boolean makeTransaction(Customer customer, Transaction transaction){
        //logic to make transaction
        return true;
    }
}
