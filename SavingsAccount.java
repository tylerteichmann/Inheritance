public class SavingsAccount extends BankAccount {

    private final int minBalance = 100;

    public SavingsAccount(double balance) {
        super(balance);
    }

    public void withdraw(double withdrawalAmount) {
        if (this.getBalance() - withdrawalAmount >= minBalance) {
            super.withdraw(withdrawalAmount);
        } else {
            System.out.println("Insufficient funds. Balance would be less than 100");
        }
    }

}
