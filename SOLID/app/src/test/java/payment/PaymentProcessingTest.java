package payment;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import main.java.payment.PaymentMethod;
import main.java.payment.enums.PaymentMethodType;
import main.java.payment.methods.impl.PaymentMethodFactory;

class PaymentProcessingTest {
    public PaymentMethod create(PaymentMethodType type){
        return PaymentMethodFactory().createPaymentMethod(type);
    }

    @Test
    void testApplePaymentMethod() {
        PaymentMethod applePaymentMethod = this.create(PaymentMethodType.APPLE_PAY);
        assertEquals("Apple Pay", applePaymentMethod.getName());
        assertEquals("Apple Inc.", applePaymentMethod.getProvider());
        assertEquals(PaymentMethodType.APPLE_PAY, applePaymentMethod.getType());
    }

    @Test
    void testDebitCardPaymentMethod() {
        PaymentMethod debitCardPaymentMethod = this.create(PaymentMethodType.DEBIT_CARD);
        assertEquals("Debit Card", debitCardPaymentMethod.getName());
        assertEquals("Visa Inc.", debitCardPaymentMethod.getProvider());
        assertEquals(PaymentMethodType.DEBIT_CARD, debitCardPaymentMethod.getType());
    }

    @Test
    void testCreditCardPaymentMethod() {
        PaymentMethod creditCardPaymentMethod = this.create(PaymentMethodType.CREDIT_CARD);
        assertEquals("Credit Card", creditCardPaymentMethod.getName());
        assertEquals("Visa Inc.", creditCardPaymentMethod.getProvider());
        assertEquals(PaymentMethodType.CREDIT_CARD, creditCardPaymentMethod.getType());
    }
}
