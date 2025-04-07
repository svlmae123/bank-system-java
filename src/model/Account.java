package model;

public class Account {
    private String accountNumber;
    private double balance;
    private int clientId;

    // Constructor
    public Account(String accountNumber, double balance, int clientId) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.clientId = clientId;
    }

    // Getters and Setters
    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public int getClientId() {
        return clientId;
    }

    public void setClientId(int clientId) {
        this.clientId = clientId;
    }

    // Method to deposit money
    public void deposit(double amount) {
        this.balance += amount;
    }

    // Method to withdraw money
    public boolean withdraw(double amount) {
        if (this.balance >= amount) {
            this.balance -= amount;
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Account{" +
                "accountNumber='" + accountNumber + '\'' +
                ", balance=" + balance +
                ", clientId=" + clientId +
                '}';
    }
}
