package dio.designpatternstrategy.model;

import org.springframework.stereotype.Component;

@Component
public class PayPalPaymentStrategy implements PaymentStrategy{
    @Override
    public String processPayment() {
        return "You made the payment via PayPal";
    }

    public PayPalPaymentStrategy() {
    }
}
