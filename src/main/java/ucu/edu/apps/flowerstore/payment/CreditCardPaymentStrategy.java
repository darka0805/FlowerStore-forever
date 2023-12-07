package ucu.edu.apps.flowerstore.payment;

public class CreditCardPaymentStrategy implements Payment{
    @Override
    public String pay(double price) {
        return "payed by credit card";
    }
}