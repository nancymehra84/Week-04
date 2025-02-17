package common_problem_test;

import org.junit.jupiter.api.Test;
import static  org.junit.jupiter.api.Assertions.*;
import common_problem.banking_system.*;


public class BankingSystemTest {
    @Test
    void testCreatAccount(){
        BankingSystem.createAccount("A123",500);
        assertEquals(500,BankingSystem.checkBalance("A123"));
    }

    @Test
    void testDeposit(){
        BankingSystem.createAccount("A123",500);

        BankingSystem.deposit("A123",200);
        assertEquals(700,BankingSystem.checkBalance("A123"));
    }

    @Test
    void testRequestWithdrawal(){
        BankingSystem.createAccount("A123",500);
        BankingSystem.deposit("A123",200);
        BankingSystem.requestWithdrawal("A123",100);
        BankingSystem.processWithdrawal();
        assertEquals(600,BankingSystem.checkBalance("A123"));
    }
}
