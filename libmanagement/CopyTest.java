import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CopyTest {
    @Test
    public void testGetCopyNumber() {
        Copy copyb1 = new Copy(1, "available");

        copyb1.setCopyNumber(1);

        int expected = 1;
        int got = copyb1.getCopyNumber();

        assertEquals(expected, got);

    }

    @Test
    public void testGetStatus() {
        Copy copyb1 = new Copy(1, "available");

        copyb1.setStatus("available");

        String expected = "available";
        String got = copyb1.getStatus();

        assertEquals(expected, got);
    }
}
