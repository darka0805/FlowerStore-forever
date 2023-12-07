package ucu.edu.apps.flowerstore;

import ucu.edu.apps.flowerstore.delivery.Delivery;
import ucu.edu.apps.flowerstore.payment.Payment;

import java.util.LinkedList;

public class Order {
    LinkedList<Flower> items = new LinkedList<Flower>();
    Payment payment;
    Delivery delivery;
    int price = 0;


    public  void addItem(Flower Item) {
        items.add(Item);
    }
    public  void removeItem(Flower item) {
        items.remove(item);
    }

    public  void setPaymentStrategy(Payment type){
        this.payment = type;
    }

    public void setDeliveryStrategy(Delivery type){
        this.delivery = type;
    }
    public int calculateTotalPrice(){
        for (int i = 0; i < items.size(); i++){
            Flower item = items.get(i);
            price += item.getPrice();
        }
        return price;
    }
}