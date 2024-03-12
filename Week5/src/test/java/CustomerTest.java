import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CustomerTest {
    @Test
    public void testGetName() {
        Customer customer = new Customer("John Doe", 1000);
        assertEquals("John Doe", customer.getName());
    }
}
