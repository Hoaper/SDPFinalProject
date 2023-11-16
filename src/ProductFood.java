public class ProductFood implements IProduct{
    double price;
    String description = "1500 calories, can be maintained up to 12 month";
    //default constructor with default price
    ProductFood (){
        this.price = 10;
    }
    //custom price constructor
    ProductFood (double newPrice){
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
