//creator of the Factory Pattern
public interface IFactory {
    //creation of product with default settings
    IProduct createProduct();
    //creation of product with custom settings, this method will be used to assign discounts
    IProduct createProduct(double newPrice);
}
