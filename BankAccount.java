public class BankAccount {

    private double balance;

    /**
     * Constructor requiring a balance on instantiation
     * @param balance the balance the user provided when creating their bank account
     */
    public BankAccount(double balance) {
        this.balance = balance;
    }

    /**
     * Will take the depositAmount and add it to the existing balance
     * @param depositAmount the amount that should be added to the existing balance
     */
    public void deposit(double depositAmount) {
        this.balance += depositAmount;
    }

    /**
     * Will tak the withdrawalAmount and subtract it from the existing balance
     * @param withdrawalAmount the amount that should be removed from the existing balance
     */
    public void withdraw(double withdrawalAmount) {
        this.balance -= withdrawalAmount;
    }

    public double getBalance() {
        return this.balance;
    }
    
}