package dio.designpatternstrategy.model;

import org.springframework.stereotype.Component;

@Component
public class CreditCardPaymentStrategy implements PaymentStrategy {
    @Override
    public String processPayment() {
        return "You made the payment via credit card";
    }

    public CreditCardPaymentStrategy() {
    }
}
