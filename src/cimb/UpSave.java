package cimb;

/**
 * Concrete decorator of the Decorator Pattern.
 *
 * <p>Adds the UpSave product on top of an existing account: the highest 4.0% interest rate and
 * insurance, while every other property is taken from the wrapped account.</p>
 *
 * @author Alexander Campita
 */
public class UpSave implements BankAccountDecorator {

    private BankAccount bankAccount;

    public UpSave() {
    }

    public UpSave(BankAccount bankAccount) {
        setBankAccount(bankAccount);
    }

    @Override
    public void setBankAccount(BankAccount bankAccount) {
        this.bankAccount = bankAccount;
    }

    @Override
    public String showAccountType() {
        return "UpSave";
    }

    @Override
    public Double getInterestRate() {
        return 0.04;
    }

    @Override
    public Double getBalance() {
        return bankAccount.getBalance();
    }

    @Override
    public String showBenefits() {
        return bankAccount.showBenefits() + ", With Insurance";
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
