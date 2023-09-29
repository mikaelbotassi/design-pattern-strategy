package dio.designpatternstrategy.model;

public class Payment{

    private PaymentStrategy paymentStrategy;

    public Payment() {
    }

    public String processPayment(){
        return this.paymentStrategy.processPayment();
    }

    public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }
}
