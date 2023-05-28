package onlinestoremanagement;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TransactionTest {
    @Test
    public void testIsCanceled() {
        Transaction johnTransaction = new Transaction();
        Order johnOrder = new Order("sulthan bather", "985734832923");

        johnTransaction.setCanceled(false, johnOrder);

        assertEquals(false, johnTransaction.isCanceled());
    }

    @Test
    public void testIsDelivered() {
        Transaction johnTransaction = new Transaction();
        Order johnOrder = new Order("sulthan bather", "985734832923");

        johnTransaction.setDelivered(true, johnOrder);

        assertEquals(true, johnTransaction.isDelivered());
    }

    @Test
    public void testIsShipped() {
        Transaction johnTransaction = new Transaction();
        Order johnOrder = new Order("sulthan bather", "985734832923");

        johnTransaction.setShipped(true, johnOrder);

        assertEquals(true, johnTransaction.isShipped());
    }

}
