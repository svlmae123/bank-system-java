package model;

import java.time.LocalDateTime;

public class Transaction {
    private int id;
    private String type; // e.g., deposit, withdraw, transfer
    private double amount;
    private String accountNumber;
    private LocalDateTime date;

    // Constructor
    public Transaction(int id, String type, double amount, String accountNumber) {
        this.id = id;
        this.type = type;
        this.amount = amount;
        this.accountNumber = accountNumber;
        this.date = LocalDateTime.now();
    }

    // Getters
    public int getId() {
        return id;
    }

    public String getType() {
        return type;
    }

    public double getAmount() {
        return amount;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public LocalDateTime getDate() {
        return date;
    }

    // ToString
    @Override
    public String toString() {
        return "Transaction{" +
                "id=" + id +
                ", type='" + type + '\'' +
                ", amount=" + amount +
                ", accountNumber='" + accountNumber + '\'' +
                ", date=" + date +
                '}';
    }
}
