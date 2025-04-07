import model.Client;
import model.Account;
import model.Transaction;
import service.ClientService;
import service.AccountService;
import service.TransactionService;

public class App {
    public static void main(String[] args) {
        // Create the service objects
        ClientService clientService = new ClientService();
        AccountService accountService = new AccountService();
        TransactionService transactionService = new TransactionService();

        // Create some clients
        Client client1 = new Client(1, "Salma", "123 Main St", "123-456-7890");
        Client client2 = new Client(2, "John", "456 Oak St", "987-654-3210");

        // Add clients to the service
        clientService.addClient(client1);
        clientService.addClient(client2);

        // Create some accounts
        Account account1 = new Account("AC123", 1000.00, client1.getId());
        Account account2 = new Account("AC124", 500.00, client2.getId());

        // Add accounts to the service
        accountService.addAccount(account1);
        accountService.addAccount(account2);

        // Perform some transactions
        // Deposit into account1
        accountService.deposit("AC123", 200.00);
        // Withdraw from account2
        accountService.withdraw("AC124", 50.00);

        // Create some transactions
        Transaction transaction1 = new Transaction(1, "Deposit", 200.00, "AC123");
        Transaction transaction2 = new Transaction(2, "Withdraw", 50.00, "AC124");

        // Add transactions to the service
        transactionService.addTransaction(transaction1);
        transactionService.addTransaction(transaction2);

        // Output current status
        System.out.println("All Clients:");
        for (Client client : clientService.getAllClients()) {
            System.out.println(client);
        }

        System.out.println("\nAll Accounts:");
        for (Account account : accountService.getAllAccounts()) {
            System.out.println(account);
        }

        System.out.println("\nAll Transactions:");
        for (Transaction transaction : transactionService.getAllTransactions()) {
            System.out.println(transaction);
        }
    }
}
