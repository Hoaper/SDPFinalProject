public class Cash implements IPaymentStrategy {

    private double bank;
    public Cash(double bank) {
        this.bank = bank;
    }

    @Override
    public void pay(double cost) { // Method that invokes if the method is provided by the Cash.
        if (this.bank - cost >= 0) {
            this.bank -= cost;
            System.out.println("The payment was provided by the Cash.");
        } else {
            System.out.println("No such money in the bank.");
        }
        System.out.println("The bank has " + this.bank + " money.");
    }
}
