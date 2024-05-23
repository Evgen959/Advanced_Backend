package model;

public class Account {
    private String iban;
    private double balance;
    private Person owner;
    private MyDate openDate;

    public Account(String iban, double balance, Person owner, MyDate openDate) {
        this.iban = iban;
        this.balance = balance;
        this.owner = owner;
        this.openDate = openDate;
    }

    @Override
    public String toString() {
        return String.format("%s (%.2f) %s open:%s", iban, balance, owner, openDate);
    }

    public String getIban() {
        return iban;
    }

    public double getBalance() {
        return balance;
    }

    public Person getOwner() {
        return owner;
    }

    public MyDate getOpenDate() {
        return openDate;
    }
}
