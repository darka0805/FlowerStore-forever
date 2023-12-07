package ucu.edu.apps.flowerstore.decorator;

import ucu.edu.apps.flowerstore.Item;

public abstract class AbstractDecorator extends Item {
    private int price;
    public abstract double getPrice();
}
