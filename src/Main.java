public class Main {
    public static void main(String[] args) {
        IPaymentStrategy card = new DebitCard(2000);
        IPaymentStrategy cash = new Cash(200);

        Payment payment1 = new Payment(card);
        Payment payment2 = new Payment(cash);

        FactoryBeverage factoryBeverage = new FactoryBeverage();
        IProduct product = factoryBeverage.createProduct(10);

        IDiscount baseDiscount = new BaseDiscountDecorator(product);
        System.out.println(baseDiscount.apply());

        baseDiscount = new BlackFridayDiscountDecorator(baseDiscount);
        System.out.println(baseDiscount.apply());

        baseDiscount = new ElevenDiscountDecorator(baseDiscount);
        System.out.println(baseDiscount.apply());

        DiscountUpdate updater = new DiscountUpdate();
        ISubscriber sub1 = new Customer(payment1);
        ISubscriber sub2 = new Customer(payment2);

        WorkerAdapter worker1 = new WorkerAdapter(sub1);
        WorkerAdapter worker2 = new WorkerAdapter(sub2);

        updater.addSubscriber(sub1);
        updater.addSubscriber(sub2);
        updater.addSubscriber(worker1);
        updater.addSubscriber(worker2);
        updater.notifySubscribers();

        IProduct beverage = factoryBeverage.createProduct();
        Storage storage = Storage.getInstance();
        storage.addProduct(beverage);
        storage.getProduct(beverage);
        storage.getProduct(beverage);
    }
}
