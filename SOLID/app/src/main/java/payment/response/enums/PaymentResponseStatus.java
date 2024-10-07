package main.java.payment.enums;

public enum PaymentResponseStatus {
    SUCCESS("SUCCESS"),
    FAILED("FAILED");

    private final String value;

    PaymentResponseStatus(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }
}
