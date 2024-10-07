package main.java.payment.methods.impl;
import main.java.payment.PaymentMethod;
import main.java.payment.enums.PaymentMethodType;

public abstract class AbstractPaymentMethod implements PaymentMethod {
    protected String name;
    protected String provider;
    protected PaymentMethodType type;

    public AbstractPaymentMethod(String name, String provider, PaymentMethodType type) {
        this.name = name;
        this.provider = provider;
        this.type = type;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public String getProvider() {
        return this.provider;
    }

    @Override
    public PaymentMethodType getType() {
        return this.type;
    }

    @Override
    public boolean pay(double amount) {
        System.out.println("Paying " + amount + " with " + this.getName() + "...");
        return true;
    }
}
