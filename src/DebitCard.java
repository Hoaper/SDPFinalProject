public class DebitCard implements IPaymentStrategy {

    public double bank;

    public DebitCard(double bank) {
        this.bank = bank;
    }

    @Override
    public void pay() {
        System.out.println("The payment was provided by the Debit Card.");;
    }
}
