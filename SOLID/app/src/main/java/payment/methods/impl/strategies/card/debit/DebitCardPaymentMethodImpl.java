package main.java.payment.methods.impl.card.debit;

import main.java.payment.PaymentMethod;
import main.java.payment.enums.PaymentMethodType;
import main.java.payment.methods.impl.AbstractPaymentMethod;

public class DebitCardPaymentMethodImpl extends AbstractPaymentMethod {
    public DebitCardPaymentMethodImpl() {
        super("Debit Card", "Visa Inc.", PaymentMethodType.DEBIT_CARD);
    }
}
