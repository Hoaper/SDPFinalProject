public class WorkerAdapter implements IWorkerSubscriber{
    private final Customer customer;
    WorkerAdapter (ISubscriber customer){
        this.customer = new Customer(new Payment(new DebitCard(500)));
    }
    @Override
    public void update() {
        customer.update();
        addProduction();
    }
    @Override
    public void addProduction() {
        System.out.println("Add products to stash before sales");
    }
}
