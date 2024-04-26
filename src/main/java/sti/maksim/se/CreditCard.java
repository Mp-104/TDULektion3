package sti.maksim.se;

public class CreditCard implements PaymentMethod {


    @Override
    public void payment (double amount ) throws MyException {
        if (enoughBalance(amount)) {
            balance -= amount;
        } else {
            throw new MyException("Inte tillräckligt med balance");
        }

    }

    private double balance;

    @Override
    public double getBalance () {
        return balance;
    }

    public CreditCard(double balance) {
        this.balance = balance;
    }

    @Override
    public boolean enoughBalance (double amount) {
        if (balance >= amount) {
            return true;
        } else {

            return false;
        }
    }
}
