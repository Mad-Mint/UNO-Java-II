/**
 * Class containing the logic for the account.
 *
 * @author Shayne Mintling
 */
public class Account {
    /**
     * The current account balance in USD.
     */
    private double balance;
    /**
     * the Account ID.
     */
    private int id;

    /**
     * Constructs a default bank account object.
     * Default values: balance = 0.0, id = id.
     *
     * @param
     */
    public Account(int id) {
        balance = 0.0;
        this.id = id;
    }

    /**
     * Method to get the current ID.
     *
     * @return current ID.
     */
    public int getId() {
        return id;
    }

    /**
     * Method to get the current balance.
     *
     * @return current account balance.
     */
    public double getBalance() {
        return balance;
    }

    /**
     * Determines if a deposit is valid
     *
     * @param amount value of the deposit in USD
     * @return true if the value is valid and false if invalid
     */

    public boolean deposit(double amount) {
        if (amount < 0) {
            return false;
        } else {
            balance += amount;
            return true;
        }
    }

    /**
     * Determines if a withdrawal is valid
     *
     * @param amount value of the withdrawal in USD
     * @return true if the value is valid and false if the value is invalid
     */
    public boolean withdraw(double amount) {
        if (amount >= balance) {
            return false;
        } else {
            balance -= amount;
            return true;
        }
    }
}