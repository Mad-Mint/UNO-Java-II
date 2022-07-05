import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Class containing unit tests for Account.java
 *
 * @author Shayne Mintling
 * @see Account
 */
public class AccountTest {
    private static final double TOLERANCE = .001;

    /**
     * Test the constructor
     */
    @Test
    void testConstructor() {
        // Account i = new Account(ATM.Input.nextInt());
        Account i = new Account(0);
        assertEquals(0, i.getId());
        assertEquals(0, i.getBalance());

    }

    @Test
    void testDeposit() {
        Account i = new Account(ATM.Input.nextInt());
        assertEquals(0, i.getId());
        assertEquals(0, i.getBalance());


        i.deposit(5);
        assertEquals(5, i.getBalance());

    }

    @Test
    void testWithdraw() {
        Account i = new Account(ATM.Input.nextInt());
        assertEquals(0, i.getId());
        assertEquals(0, i.getBalance());

        i.withdraw(5);
        assertEquals(5, i.getBalance());

    }
}
