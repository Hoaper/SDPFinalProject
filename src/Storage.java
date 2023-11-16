import java.util.ArrayList;
import java.util.List;

public class Storage {
    private final List<IProduct> products = new ArrayList<>();
    private static Storage storage;
    private Storage() {}

    public static Storage getInstance() {
        if(storage == null) {
            storage = new Storage();
        }
        return storage;
    }
    public void addProduct(IProduct product){
        products.add(product);
    }
    public IProduct getProduct(IProduct neededProduct){
        for(IProduct product : products){
            if(product.getName().equals(neededProduct.getName())){
                products.remove(product);
                return neededProduct;
            }
        }
        System.out.println(neededProduct.getName() + " not found");
        return null;
    }
}
