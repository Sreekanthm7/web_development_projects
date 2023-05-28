package onlinestoremanagement;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class StaffTest {
    @Test
    public void testAddProductToInventory() {
        Inventory inventory = new Inventory();
        Staff Kevin = new Staff("Kevin", 2345);
        Product dove = new Product("dove", 45, "soap", 5);

        Kevin.addProductToInventory(dove, inventory);
        dove.setQuantity(4);

        assertEquals(4, dove.getQuantity());

    }

    @Test
    public void testAddProductToStore() {

        Onlinestore onlinestore = new Onlinestore("happyCart");
        Staff Kevin = new Staff("Kevin", 2345);
        Product dove = new Product("dove", 45, "soap", 5);

        Kevin.addProductToStore(onlinestore, dove);
        dove.setQuantity(3);

        assertEquals(3, dove.getQuantity());

    }

    @Test
    public void testGetId() {
        Staff Kevin = new Staff("Kevin", 2345);

        Kevin.setId(2345);

        assertEquals(2345, Kevin.getId());
    }

    @Test
    public void testGetName() {
        Staff Kevin = new Staff("Kevin", 2345);
        Kevin.setName("kevin");

        assertEquals("kevin", Kevin.getName());
    }
}