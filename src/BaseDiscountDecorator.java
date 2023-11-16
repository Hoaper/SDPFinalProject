public class BaseDiscountDecorator implements IDiscount{

//    Product to get price from
    IProduct product;

    public BaseDiscountDecorator(IProduct product) {
        this.product = product;
    }

//    getting price from product
    @Override
    public double apply() {
        return product.getPrice();
    }
}
