package service;

import model.Account;
import java.util.ArrayList;
import java.util.List;

public class AccountService {
    private List<Account> accounts = new ArrayList<>();

    // Add a new account
    public void addAccount(Account account) {
        accounts.add(account);
    }

    // Get all accounts
    public List<Account> getAllAccounts() {
        return accounts;
    }

    // Find account by account number
    public Account getAccountByNumber(String accountNumber) {
        for (Account account : accounts) {
            if (account.getAccountNumber().equals(accountNumber)) {
                return account;
            }
        }
        return null; // Not found
    }

    // Deposit money into account
    public void deposit(String accountNumber, double amount) {
        Account account = getAccountByNumber(accountNumber);
        if (account != null) {
            account.deposit(amount);
        }
    }

    // Withdraw money from account
    public boolean withdraw(String accountNumber, double amount) {
        Account account = getAccountByNumber(accountNumber);
        if (account != null) {
            return account.withdraw(amount);
        }
        return false; // Account not found or insufficient funds
    }
}
