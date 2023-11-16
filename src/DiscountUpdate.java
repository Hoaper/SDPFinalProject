import java.util.ArrayList;

public class DiscountUpdate { // Observable class that updates the subscribers
    private ArrayList<ISubscriber> ISubscribers = new ArrayList<>(); // The list of subscribers

    protected DiscountUpdate() {}

    public void addSubscriber(ISubscriber ISubscriber) {
        /*
           Method that adds a customer into the list of Subscribers
         */
        this.ISubscribers.add(ISubscriber);
    }
    public void removeSubscribers(ISubscriber ISubscriber) {
        /*
           Method that removes a customer from the list of subscribers
         */
        this.ISubscribers.remove(ISubscriber);
    }
    public void notifySubscribers() { // Method that notifies subscribers
        for(Subscriber subscriber : subscribers) {
            /*
                Iterating through the list of
                Subscribers using the for-each loop
                and invoking the update method of those subscribers
             */
            ISubscriber.update();
        }
    }
}
