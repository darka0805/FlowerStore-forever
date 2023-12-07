package ucu.edu.apps.flowerstore.delivery;

import ucu.edu.apps.flowerstore.Item;

import java.util.List;


public class PostDeliveryStrategy implements Delivery{
    @Override
    public String deliver(List<Item> items) {
        return "Post delivering of " + items.size() + " items";
    }
}
