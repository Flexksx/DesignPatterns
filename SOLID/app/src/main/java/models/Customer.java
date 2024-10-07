package main.java.models;

import main.java.payment.PaymentData;

public interface Customer {
    public String getName();

    public String getEmail();

    public String getAddress();

    public PaymentData getPaymentData();

    public void setAddress(String address);

    public void setPaymentData(PaymentData paymentData);

    public void setName(String name);

    public void setEmail(String email);
}
