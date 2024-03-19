package models;

import enums.TransactionType;

import java.util.Date;

public abstract class Transaction {
    private String transactionId;

    private TransactionType transactionType;
    private Date creationTime;

    public boolean makeTransaction(){
        //save details in db()
        return false;
    };
}
