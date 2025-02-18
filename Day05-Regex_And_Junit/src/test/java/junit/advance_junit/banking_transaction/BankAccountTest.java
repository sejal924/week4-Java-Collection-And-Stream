package junit.advance_junit.banking_transaction;

import junit_problems.advance_junit.banking_transaction.BankAccount;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BankAccountTest {
    BankAccount bankAccount = new BankAccount();

    @Test
    void deposite(){
        assertEquals(2000.0,bankAccount.deposite(1000));
        assertEquals(1500.0,bankAccount.withdraw(500));
        assertEquals(1500.0,bankAccount.getBalance());
    }
}
