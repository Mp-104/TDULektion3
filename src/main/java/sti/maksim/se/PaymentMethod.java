package sti.maksim.se;

public interface PaymentMethod {

    public void payment (double amount ) throws MyException;

    public boolean enoughBalance (double amount) ;

    public double getBalance () ;
}
