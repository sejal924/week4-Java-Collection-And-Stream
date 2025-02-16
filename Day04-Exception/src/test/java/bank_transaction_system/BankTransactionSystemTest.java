package bank_transaction_system;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class BankTransactionSystemTest {
    private BankTransactionSystem account;
    @BeforeEach
    void setUp(){
        account=new BankTransactionSystem(1000);
    }
    @Test
    void successfulWithdrawalTest() throws InsufficientBalanceException{
        account.withdraw(500);
        assertEquals(500,account.getBalance());
    }
    @Test
    void withdrawMoreThanAmount() throws InsufficientBalanceException {
        Exception
                exception=assertThrows(InsufficientBalanceException.class,()->account.withdraw(5000
        ));
        assertEquals("Insufficient balance!",exception.getMessage());
    }
    @Test
    void withdrawNegativeAmount(){
        Exception
                exception=assertThrows(IllegalArgumentException.class,()->account.withdraw(-1));
        assertEquals("Invalid amount!",exception.getMessage());
    }
}

