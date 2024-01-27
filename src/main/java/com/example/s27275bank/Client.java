package com.example.s27275bank;

import java.util.ArrayList;
import java.util.List;

public class Client {
    private static Integer clientCounter = 0;
    private Integer id;
    private Double balance;
    private List<Transfer> transfersHistory = new ArrayList<>();

    public Client(
            Double balance
    ) {
        clientCounter++;
        this.id = clientCounter;
        this.balance = balance;
    }

    public Integer getId() {
        return id;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public List<Transfer> getTransfersHistory() {
        return transfersHistory;
    }


}
