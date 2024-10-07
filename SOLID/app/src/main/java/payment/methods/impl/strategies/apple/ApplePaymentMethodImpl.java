package main.java.payment.methods.impl.apple;
import main.java.payment.enums.PaymentMethodType;
import main.java.payment.methods.impl.AbstractPaymentMethod;

public class ApplePaymentMethodImpl extends AbstractPaymentMethod {
    public ApplePaymentMethodImpl() {
        super("Apple Pay", "Apple Inc.", PaymentMethodType.APPLE_PAY);
    }
}
