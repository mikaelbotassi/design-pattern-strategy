package dio.designpatternstrategy.model;

import org.springframework.stereotype.Component;

@Component
public class PayPalPaymentStrategy implements PaymentStrategy{
    @Override
    public void processPayment() {
        System.out.println("You made the payment via PayPal");
    }

    public PayPalPaymentStrategy() {
    }
}
