import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AccountTest {
    @Test
    public void testDeposit() {
        Customer customer = new Customer("John Doe", 1000);
        Account account = new Account(1, customer);
        account.deposit(500);
        assertEquals(500, account.checkBalance(), 0);
    }

    @Test
    public void testWithdrawSufficientFunds() {
        Customer customer = new Customer("Jane Smith", 2000);
        Account account = new Account(2, customer);
        account.deposit(1000);
        boolean result = account.withdraw(500);
        assertTrue(result);
        assertEquals(500, account.checkBalance(), 0);
    }

    @Test
    public void testWithdrawInsufficientFunds() {
        Customer customer = new Customer("John Doe", 1000);
        Account account = new Account(3, customer);
        account.deposit(500);
        boolean result = account.withdraw(1000);
        assertFalse(result);
        assertEquals(500, account.checkBalance(), 0);
    }
}
