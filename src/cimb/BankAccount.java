package cimb;

/**
 * Component interface of the Decorator Pattern.
 *
 * <p>Declares every operation that a savings account and every decorator wrapped around it
 * must provide, so decorators can stand in for the object they wrap.</p>
 *
 * @author Alexander Campita
 */
public interface BankAccount {

    /** Returns the name of the account type, for example {@code "Savings Account"}. */
    String showAccountType();

    /** Returns the interest rate applied to the account balance, for example {@code 0.025}. */
    Double getInterestRate();

    /** Returns the current balance of the account. */
    Double getBalance();

    /** Returns the benefits offered by the account. */
    String showBenefits();

    /** Returns the balance once the account's interest rate has been applied. */
    Double computeBalanceWithInterest();

    /** Returns the account number, account name and balance of the account. */
    String showInfo();
}
