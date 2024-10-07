package main.java.payment.methods.impl;

import main.java.payment.PaymentMethod;
import main.java.payment.enums.PaymentMethodType;
import main.java.payment.methods.impl.apple.ApplePaymentMethodImpl;
import main.java.payment.methods.impl.card.credit.CreditCardPaymentMethodImpl;
import main.java.payment.methods.impl.card.debit.DebitCardPaymentMethodImpl;
import main.java.payment.methods.impl.google.GooglePaymentMethodImpl;
import main.java.payment.methods.impl.paypal.PayPalPaymentMethodImpl;

public class PaymentMethodFactory {
    public static PaymentMethod createPaymentMethod(PaymentMethodType type) {
        switch (type) {
            case CREDIT_CARD:
                return new CreditCardPaymentMethodImpl();
            case DEBIT_CARD:
                return new DebitCardPaymentMethodImpl();
            case PAYPAL:
                return new PayPalPaymentMethodImpl();
            case GOOGLE_PAY:
                return new GooglePaymentMethodImpl();
            case APPLE_PAY:
                return new ApplePaymentMethodImpl();
            default:
                System.err.println("Invalid payment method type");
                return null;
        }
    }
}
