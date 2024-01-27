package com.example.s27275bank;

public class Transfer {
    private Double amount;
    private TransferDirection transferDirection;
    private TransferStatus transferStatus;

    public Transfer(
            Double amount,
            TransferDirection transferDirection,
            TransferStatus transferStatus
    ) {
        this.amount = amount;
        this.transferDirection = transferDirection;
        this.transferStatus = transferStatus;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public TransferDirection getTransferDirection() {
        return transferDirection;
    }

    public void setTransferDirection(TransferDirection transferDirection) {
        this.transferDirection = transferDirection;
    }

    public TransferStatus getTransferStatus() {
        return transferStatus;
    }

    public void setTransferStatus(TransferStatus transferStatus) {
        this.transferStatus = transferStatus;
    }
}
