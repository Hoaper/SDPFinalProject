public class Customer implements ISubscriber {

    private Subscriber subscriber;

    public Customer(Subscriber subscriber) {
        this.subscriber = subscriber;
    }

    public Customer() {

    }

    @Override
    public void update() {
        System.out.println("The User Was Updated");

        // observable.something();
    }

    public void pay(double cost) {
        this.payment.executePayment(cost);
    }
}
