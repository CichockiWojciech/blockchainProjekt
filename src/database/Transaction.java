package database;

import java.sql.Timestamp;

public class Transaction {
    private String sender;
    private String recipient;
    private int amount;
    private Timestamp transactionTime;

    public Transaction(String sender, String recipient, int amount, Timestamp transactionTime) {
        this.sender = sender;
        this.recipient = recipient;
        this.amount = amount;
        this.transactionTime = transactionTime;
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "sender='" + sender + '\'' +
                ", recipient='" + recipient + '\'' +
                ", amount=" + amount +
                ", transactionTime=" + transactionTime +
                '}';
    }
}
