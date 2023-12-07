package ucu.edu.apps.flowerstore.decorator;

import ucu.edu.apps.flowerstore.Item;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class BasketDecorator extends AbstractDecorator {
    private final Item item;
    private final int price = 4;

    @Override
    public double getPrice() {
        return price + item.getPrice();
    }
    @Override
    public String getDescription() {
        return item.getDescription() + "put into the basket";
    }

}