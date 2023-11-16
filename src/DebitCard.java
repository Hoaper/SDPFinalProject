public class DebitCard implements PaymentStrategy{

    @Override
    public void pay() {
        System.out.println("The payment was provided by the Debit Card.");;
    }
}
