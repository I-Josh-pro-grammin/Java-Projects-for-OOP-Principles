package Abstraction;

public class Paypal extends PaymentGateWay {
    public void payment(Double amount) {
        System.out.println("Your payment is " + amount + "$");
    }
}
