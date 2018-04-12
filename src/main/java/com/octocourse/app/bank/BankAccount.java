package com.octocourse.app.bank;

import java.time.LocalDateTime;

class BankAccount {

    private Integer balance = 0;
    private Transaction transactions = null;
    private CustomDate customLocalDateTime;

    BankAccount(CustomDate customLocalDateTime) {
        this.customLocalDateTime = customLocalDateTime;
    }

    Integer showBalance() {
        return balance;
    }

    void depositMoney(Integer cash) {
        balance += cash;
        transactions = new Transaction(LocalDateTime.now(), cash, balance);
    }

    void withdrawalMoney(Integer cash) {
        balance -= cash;
    }

    Transaction showTransactions() {
        return transactions;
    }

}
