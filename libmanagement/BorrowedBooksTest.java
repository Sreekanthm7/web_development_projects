import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class BorrowedBooksTest {
    @Test
    public void testBorrowCopy() {
        BorrowedBooks bb1 = new BorrowedBooks();
        Member ram = new Member("Ram", 1);
        Book b1 = new Book("lib10", "Origin Of Species", "Charles Darvin", "Darvin", 1859);
        Copy copyb1 = new Copy(1, "available");
        copyb1.setStatus("available");

        String expected = "available";
        String got = copyb1.getStatus();

        assertEquals(expected, got);

    }

    @Test
    public void testGetDueDate() {
        BorrowedBooks bb1 = new BorrowedBooks();
        bb1.setDueDate("12/01/2023");

        String expected = "12/01/2023";
        String got = bb1.getDueDate();

        assertEquals(expected, got);

    }

    @Test
    public void testGetMember() {
        BorrowedBooks bb1 = new BorrowedBooks();
        Member ram = new Member("Ram", 1);

        bb1.setMember(ram);

        Member expected = ram;
        Member got = bb1.getMember();

        assertEquals(expected, got);

    }

}
