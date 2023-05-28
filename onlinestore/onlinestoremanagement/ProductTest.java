package onlinestoremanagement;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ProductTest {
    @Test
    public void testGetCategory() {
        Product dove = new Product("dove", 35, "soap", 10);

        dove.setCategory("soap");
        assertEquals("soap", dove.getCategory());

    }

    @Test
    public void testGetName() {
        Product dove = new Product("dove", 35, "soap", 10);

        dove.setName("dove");
        assertEquals("dove", dove.getName());
    }

    @Test
    public void testGetPrice() {
        Product dove = new Product("dove", 35, "soap", 10);

        dove.setPrice(35);
        assertEquals(35, dove.getPrice());
    }

    @Test
    public void testGetQuantity() {
        Product dove = new Product("dove", 35, "soap", 10);

        dove.setQuantity(10);
        assertEquals(10, dove.getQuantity());
    }
}
