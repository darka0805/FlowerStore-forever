package ucu.edu.apps.flowerstore.decorator;

import ucu.edu.apps.flowerstore.Item;

public class RibbonDecorator extends AbstractDecorator {
    Item item;

    @Override
    public double getPrice() {
        return 40 + item.getPrice();
    }

    @Override
    public String getDescription() {
        return "The ribbon is added" + " to " + item.getDescription();
    }
}