package com.example.s27275bank;

import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public class ClientStorage {
    private Map<Integer, Client> clientMap;

    public ClientStorage() {
        this.clientMap = new HashMap<Integer, Client>();
    }

    public void addClient(Client client) {
        clientMap.put(client.getId(), client);
    }

    public Boolean isClientExist(Integer clientId) {
        return clientMap.containsKey(clientId);
    }

    public Client getClient(Integer clientId) {
        return clientMap.get(clientId);
    }

    public Double getClientBalance(Integer clientId) {
        return clientMap.get(clientId).getBalance();
    }

    public void addTransferToClient(Integer clientId, Transfer transfer) {
        clientMap.get(clientId).getTransfersHistory().add(transfer);
    }

    public void subtractFromClientBalance(Integer clientId, Double amount) {
        Double oldBalance = clientMap.get(clientId).getBalance();

        clientMap.get(clientId).setBalance(oldBalance - amount);
    }

    public void addToClientBalance(Integer clientId, Double amount) {
        Double oldBalance = clientMap.get(clientId).getBalance();

        clientMap.get(clientId).setBalance(oldBalance + amount);
    }
}
