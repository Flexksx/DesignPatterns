package main.java.payment.response.impl;
import main.java.payment.enums.PaymentResponseStatus;
import main.java.payment.response.PaymentResponse;

public class PaymentResponseImpl implements PaymentResponse{
    private PaymentResponseStatus status;
    private String message;
    private double requestAmount;
    private boolean isFullfilled;

    public PaymentResponseImpl(PaymentResponseStatus status, String message, double requestAmount, boolean isFullfilled) {
        this.status = status;
        this.message = message;
        this.requestAmount = requestAmount;
        this.isFullfilled = isFullfilled;
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
