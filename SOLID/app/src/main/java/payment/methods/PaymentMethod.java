package main.java.payment;

import main.java.payment.enums.PaymentMethodType;

public interface PaymentMethod {
    public String getName();

    public String getProvider();

    public PaymentMethodType getType();
}
