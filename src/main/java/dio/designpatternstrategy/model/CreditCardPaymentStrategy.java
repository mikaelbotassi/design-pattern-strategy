package dio.designpatternstrategy.model;

import org.springframework.stereotype.Component;

@Component
public class CreditCardPaymentStrategy implements PaymentStrategy {
    @Override
    public void processPayment() {
        System.out.println("You made the payment via credit card");
    }

    public CreditCardPaymentStrategy() {
    }
}
