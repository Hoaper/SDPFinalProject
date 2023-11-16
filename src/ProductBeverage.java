public class ProductBeverage implements IProduct{
    double price;
    String description = "800 calories, contains vitamins A, B, C";
    //default constructor with default price
    ProductBeverage(){
        this.price = 5.0;
    }
    //custom price constructor
    ProductBeverage(double newPrice){
        this.price = newPrice;
    }
    @Override
    //return of price
    public double getPrice(){
        return price;
    }
    @Override
    //return of description
    public String getDescription(){
        return description;
    }
}
