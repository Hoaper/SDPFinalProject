import java.util.ArrayList;
import java.time.LocalDate;

public class DiscountUpdate { // Observable class that updates the subscribers
    private ArrayList<ISubscriber> ISubscribers = new ArrayList<>(); // The list of subscribers
    private ArrayList<IWorkerSubscriber> IWorkerSubscribers = new ArrayList<>();

    private LocalDate newYearDate = LocalDate.of(2023, 12, 31);
    private LocalDate blackFridayDate = LocalDate.of(2023, 10, 13);
    private LocalDate currentDate = LocalDate.now();

    public DiscountUpdate() {}

    public void addSubscriber(ISubscriber ISubscriber) {
        /*
           Method that adds a customer into the list of Subscribers
         */
        this.ISubscribers.add(ISubscriber);
    }
    public void addSubscriber(IWorkerSubscriber IWorkerSubscriber) {
        /*
           Method that adds a customer into the list of Subscribers
         */
        this.IWorkerSubscribers.add(IWorkerSubscriber);
    }
    public void removeSubscribers(ISubscriber ISubscriber) {
        /*
           Method that removes a customer from the list of subscribers
         */
        this.ISubscribers.remove(ISubscriber);
    }
    public void removeSubscribers(IWorkerSubscriber IWorkerSubscriber) {
        /*
           Method that removes a customer from the list of subscribers
         */
        this.IWorkerSubscribers.remove(IWorkerSubscriber);
    }
    public void notifySubscribers() { // Method that notifies subscribers
        if(currentDate.equals(newYearDate)) {
            System.out.println("The New Year Discounts have started!");
        } else if(currentDate.equals(blackFridayDate)) {
            System.out.println("The Black Friday Discounts have started");
        } else {
            System.out.println("You've been given a 'Subscriber discount' of 10% !");
        }
        for(ISubscriber ISubscriber : ISubscribers) {
            /*
                Iterating through the list of
                Subscribers using the for-each loop
                and invoking the update method of those subscribers
             */
            ISubscriber.update();
        }
        for(IWorkerSubscriber ISubscriber : IWorkerSubscribers) {
            /*
                Iterating through the list of
                Subscribers using the for-each loop
                and invoking the update method of those subscribers
             */
            ISubscriber.update();
        }
    }
}
