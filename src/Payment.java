public class Payment {

    private final IPaymentStrategy paymentStrategy;

    public Payment(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    public void executePayment() {
        this.paymentStrategy.pay();
    }
}
