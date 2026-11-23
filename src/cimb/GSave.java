package cimb;

/**
 * Concrete decorator of the Decorator Pattern.
 *
 * <p>Adds the GSave product on top of an existing account: a higher 2.5% interest rate and
 * GCash transfers, while every other property is taken from the wrapped account.</p>
 *
 * @author Alexander Campita
 */
public class GSave implements BankAccountDecorator {

    private BankAccount bankAccount;

    public GSave() {
    }

    public GSave(BankAccount bankAccount) {
        setBankAccount(bankAccount);
    }

    @Override
    public void setBankAccount(BankAccount bankAccount) {
        this.bankAccount = bankAccount;
    }

    @Override
    public String showAccountType() {
        return "GSave";
    }

    @Override
    public Double getInterestRate() {
        return 0.025;
    }

    @Override
    public Double getBalance() {
        return bankAccount.getBalance();
    }

    @Override
    public String showBenefits() {
        return bankAccount.showBenefits() + ", GCash Transfer";
    }

    @Override
    public Double computeBalanceWithInterest() {
        return getBalance() + (getBalance() * getInterestRate());
    }

    @Override
    public String showInfo() {
        return bankAccount.showInfo();
    }
}
