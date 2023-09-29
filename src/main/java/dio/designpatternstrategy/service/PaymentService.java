package dio.designpatternstrategy.service;

import dio.designpatternstrategy.enums.PaymentType;
import dio.designpatternstrategy.model.CashPaymentStrategy;
import dio.designpatternstrategy.model.CreditCardPaymentStrategy;
import dio.designpatternstrategy.model.PayPalPaymentStrategy;
import dio.designpatternstrategy.model.Payment;
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

    public String processPayment(PaymentType paymentType){
        Payment payment;
        payment = new Payment();

        switch (paymentType){
            case PAYPAL -> payment.setPaymentStrategy(paypal);
            case CASH -> payment.setPaymentStrategy(cash);
            case CREDIT_CARD -> payment.setPaymentStrategy(credit);
            default -> throw new RuntimeException("Payment Method not found");
        }

        return payment.processPayment();

    }

}
