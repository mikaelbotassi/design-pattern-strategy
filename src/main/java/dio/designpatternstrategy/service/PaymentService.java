package dio.designpatternstrategy.service;

import dio.designpatternstrategy.model.CashPaymentStrategy;
import dio.designpatternstrategy.model.CreditCardPaymentStrategy;
import dio.designpatternstrategy.model.PayPalPaymentStrategy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PaymentService {
    private final CashPaymentStrategy cash;
    private final CreditCardPaymentStrategy credit;
    private final PayPalPaymentStrategy paypal;

    public PaymentService(CashPaymentStrategy cash, CreditCardPaymentStrategy credit, PayPalPaymentStrategy paypal) {
        this.cash = cash;
        this.credit = credit;
        this.paypal = paypal;
    }

    public String makePayment(String type){
        return "";
    }

}
