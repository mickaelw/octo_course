package com.octocourse.app.bank;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;
import java.time.Month;
import java.util.ArrayList;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class bankTest {

    private BankDateTime stubBankDateTime;
    private BankAccount bankAccount;

    @BeforeEach
    void setUp() {
        stubBankDateTime = mock(LocalDateTimeBankDateTime.class);
        bankAccount = new BankAccount(stubBankDateTime);
    }

    @Test
    void showTheBalanceOfTheAccount() {
        Integer emptyBalance = 0;
        assertEquals(emptyBalance, bankAccount.showBalance());
    }

    @Test
    void depositsMoneyInBankAccount() {
        Integer balanceAfterDepositsMoneyInAccount = 2;

        bankAccount.deposit(1);
        bankAccount.deposit(1);

        assertEquals(balanceAfterDepositsMoneyInAccount, bankAccount.showBalance());
    }

    @Test
    void withdrawalsMoneyInBankAccount() {
        Integer balanceAfterWithdrawalsMoneyInAccount = -2;

        bankAccount.withdrawal(1);
        bankAccount.withdrawal(1);

        assertEquals(balanceAfterWithdrawalsMoneyInAccount, bankAccount.showBalance());
    }

    @Test
    void showTransactionsOfTheBankAccount() {
        ArrayList<Transaction> noTransactions = new ArrayList<>();

        assertEquals(noTransactions, bankAccount.showTransactions());
    }

    @Test
    void showTransactionOfTheBankAccountAfterDepositMoney() {
        LocalDateTime dateOfTheTransaction = LocalDateTime.of(2012, Month.JANUARY, 14, 13, 39);
        Transaction transactionAfterDeposit = new Transaction(dateOfTheTransaction, 50, 50);

        when(stubBankDateTime.now()).thenReturn(dateOfTheTransaction);
        bankAccount.deposit(50);

        assertThat(transactionAfterDeposit).isEqualToComparingFieldByField(bankAccount.showTransactions().get(0));
    }

    @Test
    void showTransactionOfTheBankAccountAfterWithdrawalMoney() {
        LocalDateTime dateOfTheTransaction = LocalDateTime.of(2012, Month.JANUARY, 14, 13, 39);
        Transaction transactionAfterDeposit = new Transaction(dateOfTheTransaction, -50, -50);

        when(stubBankDateTime.now()).thenReturn(dateOfTheTransaction);
        bankAccount.withdrawal(50);

        assertThat(transactionAfterDeposit).isEqualToComparingFieldByField(bankAccount.showTransactions().get(0));
    }

    @Test
    void showTransactionsAfterSomeMoneyMovesOnNewBankAccount() {
        LocalDateTime dateOfTheTransaction = LocalDateTime.of(2012, Month.JANUARY, 14, 13, 39);
        LocalDateTime dateOfTheTransaction2 = LocalDateTime.of(2013, Month.FEBRUARY, 15, 12, 40);
        Transaction transactionAfterDeposit = new Transaction(dateOfTheTransaction, 50, 50);
        Transaction transactionAfterDeposit2 = new Transaction(dateOfTheTransaction2, 30, 80);
        Transaction transactionAfterDeposit3 = new Transaction(dateOfTheTransaction2, -15, 65);

        ArrayList<Transaction> transactionsAfterDeposit = new ArrayList<>();
        transactionsAfterDeposit.add(transactionAfterDeposit);
        transactionsAfterDeposit.add(transactionAfterDeposit2);
        transactionsAfterDeposit.add(transactionAfterDeposit3);

        when(stubBankDateTime.now()).thenReturn(dateOfTheTransaction).thenReturn(dateOfTheTransaction2);
        bankAccount.deposit(50);
        bankAccount.deposit(30);
        bankAccount.withdrawal(15);

        final Integer[] index = {0};
        transactionsAfterDeposit.forEach(transaction -> {
            assertThat(transaction).isEqualToComparingFieldByField(bankAccount.showTransactions().get(index[0]));
            index[0]++;
        });
    }

    @Test
    void showTransactionsAfterSomeMoneyMovesOnBankAccountWithAlreadyBalance() {
        LocalDateTime dateOfTheTransaction = LocalDateTime.of(2012, Month.JANUARY, 14, 13, 39);
        LocalDateTime dateOfTheTransaction2 = LocalDateTime.of(2013, Month.FEBRUARY, 15, 12, 40);
        Transaction transactionAfterDeposit = new Transaction(dateOfTheTransaction, 50, 80);
        Transaction transactionAfterDeposit2 = new Transaction(dateOfTheTransaction2, 30, 110);
        Transaction transactionAfterDeposit3 = new Transaction(dateOfTheTransaction2, -15, 95);

        ArrayList<Transaction> transactionsAfterDeposit = new ArrayList<>();
        transactionsAfterDeposit.add(transactionAfterDeposit);
        transactionsAfterDeposit.add(transactionAfterDeposit2);
        transactionsAfterDeposit.add(transactionAfterDeposit3);

        BankAccount bankAccount = new BankAccount(stubBankDateTime, 30);
        when(stubBankDateTime.now()).thenReturn(dateOfTheTransaction).thenReturn(dateOfTheTransaction2);
        bankAccount.deposit(50);
        bankAccount.deposit(30);
        bankAccount.withdrawal(15);

        final Integer[] transactionNumber = {0};
        transactionsAfterDeposit.forEach(transaction -> {
            assertThat(transaction).isEqualToComparingFieldByField(bankAccount.showTransactions().get(transactionNumber[0]));
            transactionNumber[0]++;
        });
    }

    @Test
    void testRest() {
        RESTBankTransfer restBankTransfer = new RESTBankTransfer();
        restBankTransfer.post();
    }
}
