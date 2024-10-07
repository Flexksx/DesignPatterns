package main.java.payment.methods.impl.card.credit;

import main.java.payment.PaymentMethod;
import main.java.payment.enums.PaymentMethodType;
import main.java.payment.methods.impl.AbstractPaymentMethod;

public class CreditCardPaymentMethodImpl extends AbstractPaymentMethod {
    public CreditCardPaymentMethodImpl() {
        super("Credit Card", "Visa Inc.", PaymentMethodType.CREDIT_CARD);
    }
}
