public class Account {  private int accountId;
    private Customer customer;
    private double balance;

    /**
     * Constructs a new Account object.
     *
     * @param accountId The unique ID of the account.
     * @param customer  The customer associated with the account.
     */
    public Account(int accountId, Customer customer) {
        this.accountId = accountId;
        this.customer = customer;
        this.balance = 0;
    }

    /**
     * Deposits money into the account.
     *
     * @param amount The amount to deposit.
     */
    public void deposit(double amount) {
        balance += amount;
    }

    /**
     * Withdraws money from the account.
     *
     * @param amount The amount to withdraw.
     * @return true if withdrawal is successful, false otherwise (insufficient funds).
     */
    public boolean withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            return true;
        }
        return false;
    }

    /**
     * Checks the balance of the account.
     *
     * @return The current balance of the account.
     */
    public double checkBalance() {
        return balance;
    }

    /**
     * Gets the ID of the account.
     *
     * @return The account ID.
     */
    public int getAccountId() {
        return accountId;
    }
}
