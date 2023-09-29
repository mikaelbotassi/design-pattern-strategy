package dio.designpatternstrategy.controller;

import dio.designpatternstrategy.DTO.PaymentDTO;
import dio.designpatternstrategy.enums.PaymentType;
import dio.designpatternstrategy.service.PaymentService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PaymentController {
    private final PaymentService paymentService;

    public PaymentController(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    @GetMapping
    public String getAll(){
        return PaymentType.showOptions();
    }

    @PostMapping("/make-payment")
    public ResponseEntity<String> post(@RequestBody PaymentDTO paymentDTO){
        try{
            PaymentType paymentType = paymentDTO.getPaymentType();
            return ResponseEntity.ok(this.paymentService.processPayment(paymentType));

        }catch (Exception e){
            return ResponseEntity.status(HttpStatus.METHOD_NOT_ALLOWED).body("Payment Method not allowed");
        }
    }


}
