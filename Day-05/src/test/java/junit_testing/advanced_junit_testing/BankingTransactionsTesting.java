package junit_testing.advanced_junit_testing;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import junit.advanced_junit_test.testing_banking_transactions.BankingTransactions;
public class BankingTransactionsTesting {
    private BankingTransactions account;

    @BeforeEach
    void setUp() {
        account = new BankingTransactions(100.0);
    }

    @Test
    void testDeposit() {
        account.deposit(50.0);
        assertEquals(150.0, account.getBalance());
    }

    @Test
    void testWithdraw() {
        account.withdraw(40.0);
        assertEquals(60.0, account.getBalance());
    }

    @Test
    void testWithdrawInsufficientFunds() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            account.withdraw(200.0);
        });
        assertEquals("Insufficient funds.", exception.getMessage());
    }

    @Test
    void testDepositNegativeAmount() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            account.deposit(-10.0);
        });
        assertEquals("Deposit amount must be positive.", exception.getMessage());
    }

    @Test
    void testWithdrawNegativeAmount() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            account.withdraw(-5.0);
        });
        assertEquals("Withdrawal amount must be positive.", exception.getMessage());
    }

    @Test
    void testInitialBalance() {
        assertEquals(100.0, account.getBalance());
    }
}

