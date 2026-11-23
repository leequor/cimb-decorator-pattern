package cimb;

/**
 * Concrete component of the Decorator Pattern.
 *
 * <p>The standard CIMB savings account: 1% interest and no extra benefits. It is the object
 * every decorator in this program wraps.</p>
 *
 * @author Alexander Campita
 */
public class SavingsAccount implements BankAccount {

    private int accountNumber;
    private String accountName;
    private double balance;

    public SavingsAccount() {
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public String getAccountName() {
        return accountName;
    }

    @Override
    public String showAccountType() {
        return "Savings Account";
    }

    @Override
    public Double getInterestRate() {
        return 0.01;
    }

    @Override
    public Double getBalance() {
        return balance;
    }

    @Override
    public String showBenefits() {
        return "Standard Savings Account";
    }

    @Override
    public Double computeBalanceWithInterest() {
        return balance + (balance * getInterestRate());
    }

    @Override
    public String showInfo() {
        return "Account number: " + accountNumber + "\n"
                + "Account name: " + accountName + "\n"
                + "Balance: " + balance;
    }
}
