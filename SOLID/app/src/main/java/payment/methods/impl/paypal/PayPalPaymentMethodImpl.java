import main.java.payment.methods.PaymentMethod;
import main.java.payment.response.PaymentResponse;
import main.java.payment.enums.PaymentMethodType;

public class PayPalPaymentMethodImpl implements PaymentMethod {
    private String name;
    private String provider;
    private PaymentMethodType type;

    public PayPalPaymentMethodImpl() {
        this.name = "PayPal";
        this.provider = "PayPal Holdings, Inc.";
        this.type = PaymentMethodType.PAYPAL;
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
