
# Warehouse

## Description

A warehouse management system that allows you to manage products, customers, and orders.

## Design Patterns Used

### Singleton Pattern

The Singleton pattern is used in this project to ensure that a class has only one instance, and to provide a global point of access to it. This is useful when exactly one object is needed to coordinate actions across the system.

### Factory Pattern

The Factory pattern is implemented through the IFactory interface and its concrete implementations FactoryBeverage and FactoryFood. These factories are responsible for creating IProduct objects. For example, FactoryBeverage creates ProductBeverage objects.
```java
//creator of the Factory Pattern
public interface IFactory {
    //creation of product with default settings
    IProduct createProduct();
    //creation of product with custom settings, this method will be used to assign discounts
    IProduct createProduct(double newPrice);
}
```
```java
public class FactoryBeverage implements IFactory{
    @Override
    public IProduct createProduct(double newPrice){
        return new ProductBeverage(newPrice);
    }
}
```
### Observer Pattern

The Observer pattern is used in this project to define a subscription mechanism to notify multiple objects about any events that happen to the object they’re observing.

### Adapter Pattern

The Adapter pattern is used in this project to allow objects with incompatible interfaces to collaborate.

### Strategy Pattern
The Strategy pattern is demonstrated through the IPaymentStrategy interface and its concrete implementations Cash and DebitCard. These strategies define how a payment is made. The Payment class uses a IPaymentStrategy to execute a payment.

```java
public class Payment {
    private final IPaymentStrategy IPaymentStrategy;

    public Payment(IPaymentStrategy IPaymentStrategy) {
        this.IPaymentStrategy = IPaymentStrategy;
    }

    public void executePayment() {
        this.IPaymentStrategy.pay();

    }
}
```

### Decorator Pattern
The Decorator pattern is implemented through the IDiscount interface and its concrete implementations like BaseDiscountDecorator, BlackFridayDiscountDecorator, and CouponDiscountDecorator. These decorators wrap an IDiscount object and modify its apply method to apply different discounts.
```java
public class BlackFridayDiscountDecorator implements IDiscount{
    private final IDiscount wrappee;

    public BlackFridayDiscountDecorator(IDiscount wrappee) {
        this.wrappee = wrappee;
    }

    @Override
    public double apply() {
        return wrappee.apply() * 0.70;
    }
}
```
## Installation

Provide instructions on how to install and run your project.

## Usage

Provide instructions on how to use your project.
