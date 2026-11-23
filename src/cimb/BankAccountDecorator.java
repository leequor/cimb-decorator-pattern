package cimb;

/**
 * Decorator interface of the Decorator Pattern.
 *
 * <p>It extends the component interface so a decorator is usable wherever a
 * {@link BankAccount} is expected, and it adds the single hook a decorator needs: a way to
 * receive the account it wraps.</p>
 *
 * @author Alexander Campita
 */
public interface BankAccountDecorator extends BankAccount {

    /** Sets the account that this decorator wraps. */
    void setBankAccount(BankAccount bankAccount);
}
