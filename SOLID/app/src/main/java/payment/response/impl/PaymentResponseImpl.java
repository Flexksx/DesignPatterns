package main.java.payment.response.impl;

import java.time.LocalDateTime;

import main.java.payment.PaymentMethod;
import main.java.payment.enums.PaymentMethodType;
import main.java.payment.enums.PaymentResponseStatus;
import main.java.payment.response.PaymentResponse;

public class PaymentResponseImpl implements PaymentResponse {
    private PaymentResponseStatus status;
    private String message;
    private PaymentMethod paymentMethod;
    private double requestAmount;
    private boolean isFullfilled;
    private LocalDateTime timestamp;

    public PaymentResponseImpl(PaymentResponseStatus status, double requestAmount, boolean isFullfilled,
            PaymentMethod paymentMethod) {
        this.status = status;
        this.requestAmount = requestAmount;
        this.isFullfilled = isFullfilled;
        this.paymentMethod = paymentMethod;
        this.timestamp = LocalDateTime.now();
    }

    @Override
    public PaymentMethodType getPaymentMethodType() {
        return this.paymentMethod.getType();
    }

    @Override
    public LocalDateTime getTimestamp() {
        return this.timestamp;
    }

    @Override
    public PaymentMethod getPaymentMethod() {
        return this.paymentMethod;
    }

    @Override
    public String getMessage() {
        return this.message;
    }

    @Override
    public double getRequestAmount() {
        return this.requestAmount;
    }

    @Override
    public PaymentResponseStatus getStatus() {
        return this.status;
    }

    @Override
    public boolean isFullfilled() {
        return this.isFullfilled;
    }

}
