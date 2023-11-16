//concrete factory of the Factory Pattern
public class FactoryBeverage implements IFactory{
    @Override
    //returns concrete product of the Factory Pattern with custom settings
    public IProduct createProduct(double newPrice){
        return new ProductBeverage(newPrice);
    }
    @Override
    //returns concrete product of the Factory Pattern with default settings
    public IProduct createProduct(){
        //returns concrete product of the Factory Pattern
        return new ProductBeverage();
    }
}
