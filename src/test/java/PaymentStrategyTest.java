
import org.junit.jupiter.api.Test;

import ucu.edu.apps.flowerstore.payment.CreditCardPaymentStrategy;
import ucu.edu.apps.flowerstore.payment.PayPalPaymentStrategy;
import ucu.edu.apps.flowerstore.payment.Payment;

import static org.junit.jupiter.api.Assertions.*;

public class PaymentStrategyTest {

    @Test
    public void testPayPalPaymentStrategy() {
        Payment payPalPaymentStrategy = new PayPalPaymentStrategy();
        String result = payPalPaymentStrategy.pay(100.0);
        assertEquals("payed by PayPal", result);
    }

    @Test
    public void testCreditCardPaymentStrategy() {
        Payment creditCardPaymentStrategy = new CreditCardPaymentStrategy();
        String result = creditCardPaymentStrategy.pay(200.0);
        assertEquals("payed by credit card", result);
    }
}