import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class BankTest {
    @Test
    public void testCreateAndRetrieveAccount() {
        Bank bank = new Bank();
        Customer customer = new Customer("John Doe", 1000);
        Account account = bank.createAccount(customer);
        assertNotNull(account);
        assertEquals(1, account.getAccountId());

        Account retrievedAccount = bank.getAccount(account.getAccountId());
        assertNotNull(retrievedAccount);
        assertEquals(account.getAccountId(), retrievedAccount.getAccountId());
    }
}
