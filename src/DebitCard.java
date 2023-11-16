public class DebitCard implements IPaymentStrategy {

    public double bank;

    public DebitCard(double bank) {
        this.bank = bank;
    }

    @Override
    public void pay(double cost) { // Method that invokes if the method is provided by the Debit Card.
        if (this.bank - cost >= 0) {
            this.bank -= cost;
            System.out.println("The payment was provided by the Debit Card.");
        } else {
            System.out.println("No such money in the bank.");
        }
        System.out.println("The bank has " + this.bank + " money.");
    }
}
