package Abstraction;

public class PaymentMain {
    public static void main(String[] args) {
        PaymentProcessor paymentProcessor = new PaymentProcessor(new PaymentGateWay());
        paymentProcessor.payment(1.0);
    }
}
