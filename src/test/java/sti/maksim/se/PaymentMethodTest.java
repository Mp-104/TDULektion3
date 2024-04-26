package sti.maksim.se;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PaymentMethodTest {

    PaymentMethod paymentMethod;

    @BeforeEach
    public void initialise () {

    }


    CreditCard creditCard = new CreditCard(10.0);




    @Test
    public void testThrow () {

        Assertions.assertThrows(MyException.class, ()-> creditCard.payment(11.0)  );

    }

    @Test
    public void checkBalanceNotEnough () {

        boolean notEnough = creditCard.enoughBalance(11.0);
        // Balance is 10 and amount 11 equals false
        assertFalse(notEnough);
    }

    @Test
    public void checkBalanceEnough () {

        boolean isEnough = creditCard.enoughBalance(8.0);

        assertTrue(isEnough);

    }

    @Test
    public void paymentEnough () throws MyException {

        creditCard.payment(8);

        //10-8 = 2
        assertEquals(2, creditCard.getBalance());

    }

    @Test
    public void paymentNotEnough () {

        //creditCard.payment(12);

        assertThrows(MyException.class, () -> creditCard.payment(12) );

    }
}
