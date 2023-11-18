public class ProductFood implements IProduct{
    double price;
    String description;
    String name;
    //default constructor with default price
    ProductFood (){
        this.price = 10.0;
        this.description = "1500 calories, can be maintained up to 12 month";
        this.name = "Roman Sandwich";
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
    @Override
    public String getName(){
        return name;
    }
    @Override
    public String toString(){
        return getName() + " " + "| " + getPrice();
    }
}
