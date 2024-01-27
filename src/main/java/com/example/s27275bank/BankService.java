package com.example.s27275bank;

import org.springframework.stereotype.Service;

@Service
public class BankService {
    private ClientStorage clientStorage;

    public BankService(ClientStorage clientStorage) {
        this.clientStorage = clientStorage;
    }

    public Client createClient(Double balance) {
        Client client = new Client(
                balance
        );

        this.clientStorage.addClient(client);

        return client;
    }

    public void makeTransfer() {

    }

    public void depositMoney() {

    }

    public void getClientData() {

    }

}
