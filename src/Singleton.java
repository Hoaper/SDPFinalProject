public class Singleton {
    private static DiscountUpdate discountUpdate;

    private Singleton() {}

    public static DiscountUpdate getInstance() {
        if(discountUpdate == null) {
            discountUpdate = new DiscountUpdate();
        }
        return discountUpdate;
    }
}
