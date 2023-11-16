import java.util.ArrayList;

public class DiscountUpdate { // Observable class that updates the subscribers
    private ArrayList<Subscriber> subscribers = new ArrayList<>(); // The list of subscribers

    protected DiscountUpdate() {}

    public void addSubscriber(Subscriber subscriber) {
        /*
           Method that adds a customer into the list of Subscribers
         */
        this.subscribers.add(subscriber);
    }
    public void removeSubscribers(Subscriber subscriber) {
        /*
           Method that removes a customer from the list of subscribers
         */
        this.subscribers.remove(subscriber);
    }
    public void notifySubscribers() { // Method that notifies subscribers
        for(Subscriber subscriber : subscribers) {
            /*
                Iterating through the list of
                Subscribers using the for-each loop
                and invoking the update method of those subscribers
             */
            subscriber.update();
        }
    }
}
