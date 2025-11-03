package Abstraction;

public class PaymentProcessor {
    private PaymentGateWay paymentGateWay;

    public PaymentProcessor(PaymentGateWay paymentGateWay) {
       this.paymentGateWay = paymentGateWay;
    }

    public void payment(double amount) {
        paymentGateWay.payment(amount);
    }
}
