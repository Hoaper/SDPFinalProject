public class Payment {

    private final IPaymentStrategy paymentStrategy;

    public Payment(IPaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    public void executePayment(double cost) {
        this.paymentStrategy.pay(cost);
    }
}
