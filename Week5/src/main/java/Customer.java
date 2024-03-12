public class Customer {
    private String name;

    /**
     * Constructs a new Customer object with a name and initial deposit.
     *
     * @param name           The name of the customer.
     * @param initialDeposit The initial deposit amount.
     */
    public Customer(String name, double initialDeposit) {
        this.name = name;
    }

    /**
     * Gets the name of the customer.
     *
     * @return The name of the customer.
     */
    public String getName() {
        return name;
    }
}
