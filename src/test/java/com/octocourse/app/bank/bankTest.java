package com.octocourse.app.bank;

import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;
import java.time.Month;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class bankTest {

    @Test
    void showTheBalanceOfTheAccount() {
        Integer emptyBalance = 0;
        BankAccount emptyBankAccount = new BankAccount();
        assertEquals(emptyBalance, emptyBankAccount.showBalance());
    }

    @Test
    void depositsMoneyInBankAccount() {
        Integer balanceAfterDepositsMoneyInAccount = 2;
        BankAccount bankAccount = new BankAccount();

        bankAccount.depositMoney(1);
        bankAccount.depositMoney(1);

        assertEquals(balanceAfterDepositsMoneyInAccount, bankAccount.showBalance());
    }

    @Test
    void withdrawalsMoneyInBankAccount() {
        Integer balanceAfterWithdrawalsMoneyInAccount = -2;
        BankAccount bankAccount = new BankAccount();

        bankAccount.withdrawalMoney(1);
        bankAccount.withdrawalMoney(1);

        assertEquals(
                balanceAfterWithdrawalsMoneyInAccount,
                bankAccount.showBalance()
        );
    }

    @Test
    void showTransactionsOfTheBankAccount() {
        Transaction noTransactions = null;
        BankAccount bankAccount = new BankAccount();

        assertEquals(noTransactions, bankAccount.showTransactions());
    }

    @Test
    void showTransactionOfTheBankAccountAfterDepositMoney() {
        LocalDateTime dateOfTheTransaction = LocalDateTime.of(2012, Month.JANUARY, 14, 13, 39);
        Transaction transactionAfterDeposit = new Transaction(dateOfTheTransaction, 50, 50);

        CustomDate customLocalDateTime = new LocalDateTimeCustom();
        BankAccount bankAccount = new BankAccount(customLocalDateTime);

        LocalDateTime mockLocalDateTime = mock(LocalDateTime.class);
        when(mockLocalDateTime.now()).thenReturn(dateOfTheTransaction);

        bankAccount.depositMoney(50);

        assertThat(transactionAfterDeposit).isEqualToComparingFieldByField(bankAccount.showTransactions());
    }

    /*
* Connaitre le solde de son compte
* Faire un dépot
* Faire une retrait
Faire la liste des transactions sous la forme :
date | heure | transaction | balance
14/01/2012 | 00:00 | -50 | 30
15/01/2012 | 01:00 | 50 | 30
 */
/*
TestList
Retourner le solde du compte
Si je fais un depot  alors le solde est mis à jour
Si je fais un retrait le solde est mis à jour
Je vois la liste des transactions de mon compte
avec un balance diff de 0
 */
}
