import java.util.ArrayList;
import java.util.List;

public class Bank {
    private List<Account> accounts;
    private int nextAccountId;

    /**
     * Constructs a new Bank object.
     */
    public Bank() {
        accounts = new ArrayList<>();
        nextAccountId = 1;
    }

    /**
     * Creates an account for a customer.
     *
     * @param customer The customer for whom the account is to be created.
     * @return The newly created Account object.
     */
    public Account createAccount(Customer customer) {
        Account account = new Account(nextAccountId++, customer);
        accounts.add(account);
        return account;
    }

    /**
     * Retrieves an account based on account ID.
     *
     * @param accountId The ID of the account to retrieve.
     * @return The Account object if found, null otherwise.
     */
    public Account getAccount(int accountId) {
        for (Account account : accounts) {
            if (account.getAccountId() == accountId) {
                return account;
            }
        }
        return null;
    }
}
