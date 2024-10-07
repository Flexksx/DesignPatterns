package main.java.payment.response;

import main.java.payment.enums.PaymentResponseStatus;

public interface PaymentResponse {
    public boolean isFullfilled();

    public PaymentResponseStatus getStatus();

    public String getMessage();

    public double getRequestAmount();
}
