package main.java.payment.methods.impl.google;

import main.java.payment.enums.PaymentMethodType;
import main.java.payment.methods.impl.AbstractPaymentMethod;

public class GooglePaymentMethodImpl extends AbstractPaymentMethod {

    public GooglePaymentMethodImpl() {
        super("Google Pay", "Google LLC", PaymentMethodType.GOOGLE_PAY);
    }
}