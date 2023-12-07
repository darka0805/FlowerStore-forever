package ucu.edu.apps.flowerstore;

import lombok.Getter;

@Getter
public abstract class Item {
    private String description;
    public abstract double getPrice();
}
