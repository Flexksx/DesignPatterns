import main.java.payment.PaymentMethod;
import main.java.payment.enums.PaymentResponseStatus;
import main.java.payment.processor.PaymentProcessor;
import main.java.payment.response.PaymentResponse;
import main.java.payment.response.impl.PaymentResponseImpl;

public class PaymentProcessorImpl implements PaymentProcessor {
    @Override
    public void processPayment(PaymentMethod paymentMethod, double amount) {
        //Simulate payment processing
        System.out.println("Processing payment with " + paymentMethod.getName() + "...");
        
        
    }
}
