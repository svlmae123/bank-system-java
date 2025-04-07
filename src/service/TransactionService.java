package service;

import model.Transaction;
import java.util.ArrayList;
import java.util.List;

public class TransactionService {
    private List<Transaction> transactions = new ArrayList<>();

    // Add a new transaction
    public void addTransaction(Transaction transaction) {
        transactions.add(transaction);
    }

    // Get all transactions
    public List<Transaction> getAllTransactions() {
        return transactions;
    }

    // Get all transactions for a specific account
    public List<Transaction> getTransactionsByAccount(String accountNumber) {
        List<Transaction> accountTransactions = new ArrayList<>();
        for (Transaction transaction : transactions) {
            if (transaction.getAccountNumber().equals(accountNumber)) {
                accountTransactions.add(transaction);
            }
        }
        return accountTransactions;
    }
}
