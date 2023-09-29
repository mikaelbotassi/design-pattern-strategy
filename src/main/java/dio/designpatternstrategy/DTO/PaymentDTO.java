package dio.designpatternstrategy.DTO;

import dio.designpatternstrategy.enums.PaymentType;

public class PaymentDTO {

    private PaymentType paymentType;

    public PaymentType getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(PaymentType paymentType) {
        this.paymentType = paymentType;
    }

    public PaymentDTO(PaymentType paymentType) {
        this.paymentType = paymentType;
    }

    public PaymentDTO() {
    }
}
