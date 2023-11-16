public class Cash implements PaymentStrategy{

    @Override
    public void pay() {
        System.out.println("The payment was provided by the Cash.");;
    }
}
