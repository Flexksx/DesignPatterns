import main.java.payment.PaymentMethod;

public class CreditCardPaymentMethodImpl implements PaymentMethod{
    private String name;
    private String provider;
    private PaymentMethodType type;

    public CreditCardPaymentMethodImpl() {
        this.name = "Credit Card";
        this.provider = "Visa Inc.";
        this.type = PaymentMethodType.CREDIT_CARD;
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
