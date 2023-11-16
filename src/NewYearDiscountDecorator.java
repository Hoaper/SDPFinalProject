// Discount for new year
public class NewYearDiscountDecorator implements IDiscount{

    // Wrapable decorator
    private final IDiscount wrappee;

    // Discount decorator constructor
    public NewYearDiscountDecorator(IDiscount wrappee) {
        this.wrappee = wrappee;
    }

    // Apply discount of 5% off
    @Override
    public double apply() {
        return wrappee.apply() * 0.95;
    }
}
