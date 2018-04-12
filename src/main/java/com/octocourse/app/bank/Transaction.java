package com.octocourse.app.bank;

import java.time.LocalDateTime;

class Transaction {

    private LocalDateTime dateTimeOfTheTransaction;
    private Integer amount;
    private Integer balance;

    Transaction(LocalDateTime dateTimeOfTheTransaction,
                Integer amount,
                Integer balance) {
        this.dateTimeOfTheTransaction = dateTimeOfTheTransaction;
        this.amount = amount;
        this.balance = balance;
    }

}
