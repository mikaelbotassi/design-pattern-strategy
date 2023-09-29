package dio.designpatternstrategy.model;

import org.springframework.stereotype.Component;

@Component
public class CashPaymentStrategy implements PaymentStrategy{
    @Override
    public String processPayment() {
        return  "You made the payment via cash";
    }

    public CashPaymentStrategy() {
    }
}
