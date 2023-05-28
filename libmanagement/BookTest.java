import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class BookTest {
    @Test
    public void testGetAuthor() {
        Book originofSpecies = new Book("lib10", "Origin Of Species", "Charles Darvin", "Darvin", 1859);

        originofSpecies.setAuthor("Charles Darvin");

        String expected = "Charles Darvin";
        String got = originofSpecies.getAuthor();

        assertEquals(expected, got);

    }

    @Test
    public void testGetISBN() {
        Book originofSpecies = new Book("lib10", "Origin Of Species", "Charles Darvin", "Darvin", 1859);

        originofSpecies.setISBN("lib10");

        String expected = "lib10";
        String got = originofSpecies.getISBN();

        assertEquals(expected, got);

    }

    @Test
    public void testGetPublicationDate() {
        Book originofSpecies = new Book("lib10", "Origin Of Species", "Charles Darvin", "Darvin", 1859);

        originofSpecies.setPublicationDate(1859);

        int expected = 1859;
        int got = originofSpecies.getPublicationDate();

        assertEquals(expected, got);
    }

    @Test
    public void testGetPublisher() {
        Book originofSpecies = new Book("lib10", "Origin Of Species", "Charles Darvin", "Darvin", 1859);

        originofSpecies.setPublisher("Darvin");

        String expected = "Darvin";
        String got = originofSpecies.getPublisher();

        assertEquals(expected, got);
    }

    @Test
    public void testGetTitle() {
        Book originofSpecies = new Book("lib10", "Origin Of Species", "Charles Darvin", "Darvin", 1859);

        originofSpecies.setTitle("Origin Of Species");
        String expected = "Origin Of Species";
        String got = originofSpecies.getTitle();

        assertEquals(expected, got);
    }

}
