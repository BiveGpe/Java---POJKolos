package com.example.s27275bank;

import org.springframework.stereotype.Service;

@Service
public class BankService {
    private ClientStorage clientStorage;

    public BankService(ClientStorage clientStorage) {
        this.clientStorage = clientStorage;
    }

    public Client createClient(Double balance) {
        Client client = new Client(balance);
        this.clientStorage.addClient(client);

        return client;
    }

    public Client makeTransfer(Integer clientId, Double amount) throws Exception {
        if (!clientStorage.isClientExist(clientId)) {
            throw new Exception("Client does not exist");
        }

        if (clientStorage.getClientBalance(clientId) < amount) {
            clientStorage.addTransferToClient(
                    clientId,
                    new Transfer(
                        amount,
                        TransferDirection.OUTGOING,
                        TransferStatus.DECLINED
                    )
            );

            throw new Exception("Not enough balance");
        }

        clientStorage.subtractFromClientBalance(clientId, amount);
        clientStorage.addTransferToClient(
                clientId,
                new Transfer(
                        amount,
                        TransferDirection.OUTGOING,
                        TransferStatus.ACCEPTED
                )
        );

        return clientStorage.getClient(clientId);
    }

    public void depositMoney() {

    }

    public void getClientData() {

    }

}
