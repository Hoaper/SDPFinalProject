public class Customer implements ISubscriber {

    private ISubscriber ISubscriber;
    private final Payment payment;

    public Customer(Payment payment) {
        this.payment = payment;
    }

    @Override
    public void update() {
        System.out.println("The User Was Updated");

        // Method that invokes when the Subscribers have been updated about the Discounts;
    }

    public void pay(double cost) {
        this.payment.executePayment(cost);
    }
}
