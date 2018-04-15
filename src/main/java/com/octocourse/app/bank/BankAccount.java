package com.octocourse.app.bank;

import java.util.ArrayList;

class BankAccount {

    private Integer balance = 0;
    private ArrayList<Transaction> transactions = new ArrayList<>();
    private BankDateTime bankDateTime;

    BankAccount(BankDateTime bankDateTime) {
        this.bankDateTime = bankDateTime;
    }

    BankAccount(BankDateTime bankDateTime, Integer initialBalance) {
        this.bankDateTime = bankDateTime;
        this.balance = initialBalance;
    }

    Integer showBalance() {
        return balance;
    }

    void deposit(Integer cash) {
        balance += cash;
        transactions.add(new Transaction(bankDateTime.now(), cash, balance));
    }

    void withdrawal(Integer cash) {
        balance -= cash;
        transactions.add(new Transaction(bankDateTime.now(), -cash, balance));
    }

    ArrayList<Transaction> showTransactions() {
        return transactions;
    }

}
