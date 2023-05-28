import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MemberTest {
    @Test
    public void testBorrowBook() {
        Member ram = new Member("Ram", 1);
        Book originofSpecies = new Book("lib10", "Origin Of Species", "Charles Darvin", "Darvin", 1859);

        ram.borrowBook("Origin Of Species");

        String expected = "Origin Of Species";
        String got = originofSpecies.getTitle();

        assertEquals(expected, got);
    }

    @Test
    public void testGetId() {
        Member ram = new Member("Ram", 1);
        ram.setId(1);

        int expected = 1;
        int got = ram.getId();

        assertEquals(expected, got);
    }

    @Test
    public void testGetName() {
        Member ram = new Member("Ram", 1);

        ram.setName("Ram");

        String expected = "Ram";
        String got = ram.getName();

        assertEquals(expected, got);

    }
}
