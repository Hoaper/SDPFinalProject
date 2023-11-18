public class WorkerAdapter implements IWorkerSubscriber{
    private final Customer customer;
    WorkerAdapter (Customer customer){
        this.customer = customer;
    }
    @Override
    public void update() {
        customer.update();
        System.out.println("Add Products before sales!");
        addProduction();
    }
    @Override
    public void addProduction() {
        Storage storage = Storage.getInstance();
        IProduct beverage = new ProductBeverage();
        IProduct food = new ProductFood();
        storage.addProduct(beverage);
        storage.addProduct(food);
    }
}
