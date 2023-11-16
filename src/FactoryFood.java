//concrete factory of the Factory Pattern
public class FactoryFood implements IFactory{
    //returns concrete product of the Factory Pattern with custom settings
    @Override
    public IProduct createProduct(double newPrice){
        return new ProductFood(newPrice);
    }
    @Override
    //returns concrete product of the Factory Pattern with default settings
    public IProduct createProduct(){
        return new ProductFood();
    }
}
