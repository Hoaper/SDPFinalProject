public class BaseDiscountDecorator implements IDiscount{

//    Product to get price from
    Double cost;

    public BaseDiscountDecorator(Double cost) {
        this.cost = cost;
    }

//    getting price from product
    @Override
    public double apply() {
        return cost;
    }
}
