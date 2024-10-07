import main.java.payment.PaymentMethod;

public class ApplePaymentMethodImpl implements PaymentMethod {
    private String name;
    private String provider;
    private PaymentMethodType type;

    public ApplePaymentMethodImpl() {
        this.name = "Apple Pay";
        this.provider = "Apple Inc.";
        this.type = PaymentMethodType.APPLE;
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

}
