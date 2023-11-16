public class BlackFridayDiscountDecorator implements IDiscount{

    //    wrappable decorator
    private final IDiscount wrappee;

    public BlackFridayDiscountDecorator(IDiscount wrappee) {
        this.wrappee = wrappee;
    }

    //    30% off
    @Override
    public double apply() {
        return wrappee.apply() * 0.70;
    }
}
