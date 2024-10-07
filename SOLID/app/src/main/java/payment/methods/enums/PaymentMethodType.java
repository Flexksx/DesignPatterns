package main.java.payment.enums;

public enum PaymentMethodType {
    CREDIT_CARD("CREDIT_CARD"),
    DEBIT_CARD("DEBIT_CARD"),
    PAYPAL("PAYPAL"),
    GOOGLE_PAY("GOOGLE_PAY"),
    APPLE_PAY("APPLE_PAY");

    private final String value;

    PaymentMethodType(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }
}
