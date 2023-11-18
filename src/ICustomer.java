public interface ICustomer extends ISubscriber{
    @Override
    void update();
    void pay(double cost);
}
