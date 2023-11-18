public class Customer implements ICustomer {

    private final String email;
    private final Payment payment;

    public Customer(Payment payment, String email) {
        this.payment = payment;
        this.email = email;
    }
    public Customer(String email) {
        this.email = email;
        this.payment = null;
    }

    @Override
    public void update() {
        System.out.println(this.email + " has been notified about the Discounts.");

        // Method that invokes when the Subscribers have been updated about the Discounts;
    }

    public void pay(double cost) {
        assert this.payment != null;
        this.payment.executePayment(cost);
    }
}
