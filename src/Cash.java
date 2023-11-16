public class Cash implements IPaymentStrategy {

    private double bank;
    public Cash(double bank) {
        this.bank = bank;
    }

    @Override
    public void pay() {
        System.out.println("The payment was provided by the Cash.");;
    }
}
