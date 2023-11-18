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
        System.out.println("Welcome to our mall! What kind of service do you need?");
        while(true){
            System.out.println(
                    "Menu:" +
                    "\n1. Buy Products" +
                    "\n2. Subscription to get information about sales" +
                    "\n3. Get info about products" +
                    "\n4. Show Basket" +
                    "\n5. Buy all from my basket" +
                    "\n9. Exit"
                    );
            int answer = scanner.nextInt();
            switch(answer){
                case 1:
                    if(storage.isEmpty()){
                        System.out.println("Storage is empty");
                    }
                    else{
                        while(true){
                            storage.showStorage();
                            System.out.println("Which product you would like to add to the basket?");
                            answer = scanner.nextInt();
                            basket.addProduct(answer);
                            if(!storage.isEmpty()) {
                                System.out.println("Do you want to get more products?" +
                                        "\n1. Yes" +
                                        "\n2. No");
                                answer = scanner.nextInt();
                            } else {
                                break;
                            }
                            if(answer == 2){
                                break;
                            }
                        }
                    }
                    break;
                case 2:
                    System.out.println("Enter your type of payment: 1 - Debit Card, 2 - Cash");
                    discounter.addSubscriber(new Customer(scanner.next()));
                    break;
                case 3: // EDIT
                    storage.showStorage();
                    break;
                case 4:
                    basket.show();
                    break;
                case 5:
                    if(basket.basket.isEmpty()){
                        System.out.println("Basket is empty");
                    }
                    else{
                        System.out.println("Enter your type of payment: 1 - Debit Card, 2 - Cash");
                        int typeOfPayment = scanner.nextInt();
                        System.out.println("Enter your dollars");
                        double cost = scanner.nextDouble();
                        IPaymentStrategy newStrategy1;
                        if(typeOfPayment == 1){
                            newStrategy1 = new DebitCard(cost);
                        }
                        else{
                            newStrategy1 = new Cash(cost);
                        }
                        System.out.println("Enter your email");
                        ICustomer customer = new Customer(new Payment(newStrategy1), scanner.next());
                        customer.pay(basket.countSum());
                        basket.clearBasket();
                    }
                    break;
                case 9:
                    System.exit(0);
                    break;
            }
        }
    }
}
