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

}
