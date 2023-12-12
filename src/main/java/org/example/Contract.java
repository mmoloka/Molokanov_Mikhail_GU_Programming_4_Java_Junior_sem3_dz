package org.example;

public class Contract {
    private int clientId;
    private String clientName;
    private long accountNumber;

    public Contract(int clientId, String clientName, long accountNumber) {
        this.clientId = clientId;
        this.clientName = clientName;
        this.accountNumber = accountNumber;
    }

    public int getClientId() {
        return clientId;
    }

    public void setClientId(int clientId) {
        this.clientId = clientId;
    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public long getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }
}
