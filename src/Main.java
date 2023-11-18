import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        FactoryBeverage factoryBeverage = new FactoryBeverage();
        FactoryFood factoryFood = new FactoryFood();
        Storage storage = Storage.getInstance();
        DiscountUpdate discounter = new DiscountUpdate();
        storage.addProduct(factoryBeverage.createProduct());
        storage.addProduct(factoryFood.createProduct());
        Basket basket = new Basket();
        while(true){
            System.out.println("Welcome to our mall! What kind of service do you need?");
            System.out.println("1. Buy Products" +
                    "\n2. Subscription to get information about sales"
                    );
            int answer = scanner.nextInt();
            switch(answer){
                case 1:
                    if(storage.isEmpty()){
                        System.out.println("Storage is empty");
                    }
                    else{
                        storage.showStorage();
                        System.out.println("Which product you would like to add to the basket?");
                        answer = scanner.nextInt();
                        basket.addProduct(answer);
                        System.out.println("This is your basket:");
                        basket.show();
                    }
                    break;
                case 2:

            }
        }


//            DebitCard card = new DebitCard(500);
//            Payment customerCard = new Payment(card);
//            ISubscriber customer = new Customer(customerCard);
//
//        IPaymentStrategy card = new DebitCard(2000);
//        IPaymentStrategy cash = new Cash(200);
//
//        Payment payment1 = new Payment(card);
//        Payment payment2 = new Payment(cash);
//
//        FactoryBeverage factoryBeverage = new FactoryBeverage();
//        IProduct product = factoryBeverage.createProduct(10);
//
//        IDiscount baseDiscount = new BaseDiscountDecorator(product);
//        System.out.println(baseDiscount.apply());
//
//        baseDiscount = new BlackFridayDiscountDecorator(baseDiscount);
//        System.out.println(baseDiscount.apply());
//
//        baseDiscount = new ElevenDiscountDecorator(baseDiscount);
//        System.out.println(baseDiscount.apply());
//
//        DiscountUpdate updater = new DiscountUpdate();
//        ISubscriber sub1 = new Customer(payment1);
//        ISubscriber sub2 = new Customer(payment2);
//
//        WorkerAdapter worker1 = new WorkerAdapter(sub1);
//        WorkerAdapter worker2 = new WorkerAdapter(sub2);
//
//        updater.addSubscriber(sub1);
//        updater.addSubscriber(sub2);
//        updater.addSubscriber(worker1);
//        updater.addSubscriber(worker2);
//        updater.notifySubscribers();
//
//        IProduct beverage = factoryBeverage.createProduct();
//        Storage storage = Storage.getInstance();
//        storage.addProduct(beverage);
//        storage.getProduct(beverage);
//        storage.getProduct(beverage);
    }
}
