// Discount for membership club
public class MemberShipDiscountDecorator implements IDiscount{

    // Wrapable decorator
    private final IDiscount wrappee;

    // Discount decorator constructor
    public MemberShipDiscountDecorator(IDiscount wrappee) {
        this.wrappee = wrappee;
    }

    // Apply discount of 5% off
    @Override
    public double apply() {
        return wrappee.apply() * 0.95;
    }
}
