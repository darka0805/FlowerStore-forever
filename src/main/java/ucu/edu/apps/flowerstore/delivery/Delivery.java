package ucu.edu.apps.flowerstore.delivery;

import java.util.List;

import ucu.edu.apps.flowerstore.Item;

public interface Delivery {
    String deliver(List<Item> items);
}
