import java.util.ArrayList;
import java.util.List;

public class Storage {
    private final List<IProduct> products = new ArrayList<>();
    private static Storage storage;
    private Storage() {

    }
    public static Storage getInstance() {
        if(storage == null) {
            storage = new Storage();
        }
        return storage;
    }
    public void addProduct(IProduct product){
        products.add(product);
    }
    public IProduct getProduct(int itemIndex){
        IProduct item = products.get(itemIndex);
        products.remove(itemIndex);
        return item;
    }
    public boolean isEmpty(){
        return products.isEmpty();
    }
    public void showStorage(){
        for(int i = 0; i < products.size(); i++){
            System.out.println(i + 1 + " " + products.get(i).toString());
        }
    }
}
