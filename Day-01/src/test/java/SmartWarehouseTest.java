import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import com.generics.smart_warehouse_management_system.*;

public class SmartWarehouseTest {
    Storage<Electronics> storage = new Storage<>();

    @BeforeEach
    public void setUp() {
        storage = new Storage<>();
    }

    @Test
    public void testAddItem() {
        Electronics electronics = new Electronics("Mobile Phone",40000);
        storage.addItem(electronics);

        assertEquals(1, storage.getAllItems().size());
        assertTrue(storage.getAllItems().get(0) instanceof Electronics);
    }

    @Test
    public void testDisplayItems() {
        Electronics electronics = new Electronics("Refrigerator",30000);

        storage.addItem(electronics);

        WarehouseUtility.DisplayItems(storage.getAllItems());
    }
}
