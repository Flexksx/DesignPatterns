import java.time.LocalDateTime;

public interface Payment {
    public LocalDateTime getDateTime();

    public double getAmount();

    public PaymentMethod getPaymentMethod();

    public String getPaymentStatus();

    public String getPaymentMethodName();
}
