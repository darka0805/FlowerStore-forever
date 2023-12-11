
import org.junit.jupiter.api.Test;
import ucu.edu.apps.flowerstore.delivery.PostDeliveryStrategy;
import ucu.edu.apps.flowerstore.Item;
import ucu.edu.apps.flowerstore.delivery.DHLDeliveryStrategy;
import ucu.edu.apps.flowerstore.delivery.Delivery;

import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class DeliveryTest {

    @Test
    public void testPostDeliveryStrategy() {
        Delivery postDeliveryStrategy = new PostDeliveryStrategy();
        List<Item> emptyItemList = Collections.emptyList();
        String result = postDeliveryStrategy.deliver(emptyItemList);

        assertEquals("Post delivering of 0 items", result);
    }

    @Test
    public void testDHLDeliveryStrategy() {
        Delivery dhlDeliveryStrategy = new DHLDeliveryStrategy();
        List<Item> emptyItemList = Collections.emptyList();
        String result = dhlDeliveryStrategy.deliver(emptyItemList);
        assertEquals("DHL delivery of 0 items", result);
    }
}