package onlinestoremanagement;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class OrderTest {
    @Test
    public void testGetDeliveryAddress() {
        Order johnOrder = new Order("sulthan bather", "985734832923");
        johnOrder.setDeliveryAddress("sulthan bathery");

        assertEquals("sulthan bathery", johnOrder.getDeliveryAddress());
    }

    @Test
    public void testGetMobileNumber() {
        Order johnOrder = new Order("sulthan bather", "985734832923");
        johnOrder.setMobileNumber("985734832923");

        assertEquals("985734832923", johnOrder.getMobileNumber());
    }

    @Test
    public void testGetPaymentOption() {
        Order johnOrder = new Order("sulthan bather", "985734832923");
        johnOrder.setPaymentOption("Google pay");

        assertEquals("Google pay", johnOrder.getPaymentOption());
    }

}
