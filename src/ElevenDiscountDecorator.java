public class ElevenDiscountDecorator implements IDiscount {

    // Wrapable object
    private final IDiscount wrappee;

    public ElevenDiscountDecorator(IDiscount wrappee) {
        this.wrappee = wrappee;
    }

    @Override
    public double apply() {
        //        getting discount of 10%
        return wrappee.apply() * 0.90;
    }
}
