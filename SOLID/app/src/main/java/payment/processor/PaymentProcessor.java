package main.java.payment.processor;

import main.java.payment.PaymentMethod;

public interface PaymentProcessor {
    public void processPayment(PaymentMethod paymentMethod, double amount);
}
