package main.java.models.impl;

import main.java.models.Customer;
import main.java.payment.PaymentData;

public class CustomerImpl implements Customer {
    private String name;
    private String email;
    private String address;
    private PaymentData paymentData;

    public CustomerImpl(String name, String email, String address, PaymentData paymentData) {
        this.name = name;
        this.email = email;
        this.address = address;
        this.paymentData = paymentData;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getEmail() {
        return email;
    }

    @Override
    public String getAddress() {
        return address;
    }

    @Override
    public PaymentData getPaymentData() {
        return paymentData;
    }

    @Override
    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public void setPaymentData(PaymentData paymentData) {
        this.paymentData = paymentData;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void setEmail(String email) {
        this.email = email;
    }
}
