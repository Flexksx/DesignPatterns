package main.java.payment.methods.impl.paypal;

import main.java.payment.enums.PaymentMethodType;
import main.java.payment.methods.impl.AbstractPaymentMethod;
public class PayPalPaymentMethodImpl extends AbstractPaymentMethod {
    public PayPalPaymentMethodImpl() {
        super("PayPal", "PayPal Holdings, Inc.", PaymentMethodType.PAYPAL);
    }
}
