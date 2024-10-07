public class DebitCardPaymentMethodImpl implements PaymentMethod {
    private String name;
    private String provider;
    private PaymentMethodType type;

    public DebitCardPaymentMethodImpl() {
        this.name = "Debit Card";
        this.provider = "Visa Inc.";
        this.type = PaymentMethodType.DEBIT_CARD;
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
