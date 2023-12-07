package ucu.edu.apps.flowerstore.decorator;

import ucu.edu.apps.flowerstore.Item;

public class PaperDecorator extends AbstractDecorator {
    private Item item;

    @Override
    public double getPrice() {
        return 13 + item.getPrice();
    }
    @Override
    public String getDescription() {
        return item.getDescription() + " and  packed in  paper";
    }
}