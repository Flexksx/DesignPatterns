import main.java.payment.PaymentMethod;

public class GooglePaymentMethodImpl implements PaymentMethod{
    private String name;
    private String provider;
    private PaymentMethodType type;

    public GooglePaymentMethodImpl() {
        this.name = "Google Pay";
        this.provider = "Google LLC";
        this.type = PaymentMethodType.GOOGLE;
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
