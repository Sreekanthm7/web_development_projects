package onlinestoremanagement;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CustomerTest {
    @Test
    public void testAddToCart() {
        Customer john = new Customer("john", 1234, "kevin124@gmail.com", "6854389885");
        Cart johnCart = new Cart();
        Onlinestore store = new Onlinestore("happyCart");
        Product dove = new Product("dove", 45, "soap", 2);

        john.addToCart(dove, johnCart, 2, store);
        dove.setQuantity(2);

        assertEquals(2, dove.getQuantity());

    }

    @Test
    public void testBrowzeProductByCategory() {

        Onlinestore store = new Onlinestore("happyCart");
        Product dove = new Product("dove", 45, "soap", 2);

        dove.setCategory("soap");

        assertEquals("soap", dove.getCategory());

    }

    @Test
    public void testGetId() {
        Customer john = new Customer("john", 1234, "kevin124@gmail.com", "6854389885");

        john.setId(1234);

        assertEquals(1234, john.getId());
    }

    @Test
    public void testGetMobileNumber() {
        Customer john = new Customer("john", 1234, "kevin124@gmail.com", "6854389885");

        john.setMobileNumber("6854389885");

        assertEquals("6854389885", john.getMobileNumber());
    }

    @Test
    public void testGetName() {
        Customer john = new Customer("john", 1234, "kevin124@gmail.com", "6854389885");
        john.setName("John");
        assertEquals("John", john.getName());
    }

    @Test
    public void testRating() {
        Customer john = new Customer("john", 1234, "kevin124@gmail.com", "6854389885");
        Product dove = new Product("dove", 45, "soap", 2);

        dove.productRating.add(4.0);

        john.rating(dove, 4.0);
    }

    @Test
    public void testReview() {
        Customer john = new Customer("john", 1234, "kevin124@gmail.com", "6854389885");
        Product dove = new Product("dove", 45, "soap", 2);

        dove.productReview.add("good product");

        john.review(dove, "good product");
    }

    @Test
    public void testSearchProductByName() {
        Product dove = new Product("dove", 45, "soap", 2);

        dove.setName("dove");
        assertEquals("dove", dove.getName());
    }
}
