public class Customer implements Subscriber{

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
}
