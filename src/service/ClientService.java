package service;

import model.Client;

import java.util.ArrayList;
import java.util.List;

public class ClientService {
    private List<Client> clients = new ArrayList<>();

    // Add a new client
    public void addClient(Client client) {
        clients.add(client);
        System.out.println("✅ Client added: " + client);
    }

    // Get all clients
    public List<Client> getAllClients() {
        return clients;
    }

    // Find client by ID
    public Client getClientById(int id) {
        for (Client client : clients) {
            if (client.getId() == id) {
                return client;
            }
        }
        return null; // Not found
    }

    // Display all clients
    public void displayClients() {
        if (clients.isEmpty()) {
            System.out.println("No clients found.");
        } else {
            for (Client client : clients) {
                System.out.println(client);
            }
        }
    }
}
