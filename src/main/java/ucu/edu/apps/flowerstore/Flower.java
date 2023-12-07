package ucu.edu.apps.flowerstore;
import org.springframework.boot.autoconfigure.domain.EntityScan;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor @Setter
@Entity
@NoArgsConstructor
public class Flower {
    @Id
    private int id;
    @Getter
    private double sepalLength;
    @Getter
    private double price;
    @Getter
    private FlowerColor color;

    public String getColor() {
        return color.toString();
    }
}