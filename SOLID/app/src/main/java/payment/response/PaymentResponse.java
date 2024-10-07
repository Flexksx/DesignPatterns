package main.java.payment.response;

import java.time.LocalDateTime;
import main.java.payment.PaymentMethod;
import main.java.payment.enums.PaymentMethodType;
import main.java.payment.enums.PaymentResponseStatus;

public interface PaymentResponse {
    public boolean isFullfilled();

    public PaymentMethod getPaymentMethod();

    public PaymentMethodType getPaymentMethodType();

    public PaymentResponseStatus getStatus();

    public String getMessage();

    public LocalDateTime getTimestamp();

    public double getRequestAmount();

    public String toString();
}
