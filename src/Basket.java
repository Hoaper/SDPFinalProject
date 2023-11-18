import java.util.ArrayList;
import java.util.List;

public class Basket implements IBasket{
    List<IProduct> basket = new ArrayList<>();
    Storage storage = Storage.getInstance();
    @Override
    public void addProduct(int index){
        basket.add(storage.getProduct(index - 1));
    }
    @Override
    public void removeProduct(int index){
        basket.remove(index - 1);
    }
    @Override
    public void clearBasket(){
        basket.clear();
    }
    @Override
    public void show(){
        if (basket.isEmpty()) {
            System.out.println("Basket is empty");
            return;
        }
        for(int i = 0; i < basket.size(); i++){
            System.out.println(i + 1 + " " + basket.get(i).toString());
        }
    }
    public double countSum(){
        double sum = 0;
        for(IProduct product : basket){
            IDiscount discount = new BaseDiscountDecorator(product.getPrice());
            discount = new CouponDiscountDecorator(discount);
            discount = new BlackFridayDiscountDecorator(discount);
            sum += discount.apply();
        }
        return sum;
    }
}
