import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class LibraryTest {

    @Test
    public void testGetBookByISBN() {
        Library lib = new Library();
        Book originofSpecies = new Book("lib10", "Origin Of Species", "Charles Darvin", "Darvin", 1859);

        lib.getBookByISBN("lib10");

        String expected = "lib10";
        String got = originofSpecies.getISBN();

        assertEquals(expected, got);
        
    }

    
}