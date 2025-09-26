abstract class PaymentGateWay{

    abstract public void pay();

}

class PayPalPayment extends PaymentGateWay {
    @Override
    public void pay() {

            System.out.println("Payment method is Paypal ");


    }
}

class MomoPayment extends PaymentGateWay {
    @Override
    public void pay() {

        System.out.println("Payment method is Momo ");


    }
}


class MasterCardPayment extends PaymentGateWay {
    @Override
    public void pay() {

        System.out.println("Payment method is MasterCard ");


    }
}

class PaymentProcessor{
    private PaymentGateWay paymentGateWay;
    public PaymentProcessor(PaymentGateWay paymentGateWay) {
        paymentGateWay.pay();
    }
}

public class Abrastruction {
    public static void main(String[] args) {
        PayPalPayment payPalPayment = new PayPalPayment();
        MomoPayment momoPayment = new MomoPayment();
        MasterCardPayment masterCardPayment = new MasterCardPayment();

        PaymentProcessor paymentProcess = new PaymentProcessor(masterCardPayment);
    }
}
