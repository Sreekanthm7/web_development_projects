package schoolprojectnew;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class StudentTest {
    @Test
    public void testSetSingleParent() {
        Student ram = new Student("Ram", 5);
        ram.setSingleParent(true);

        boolean expected = true;
        boolean got = ram.isSingleParent();

        assertEquals(expected, got);
    }

    @Test
    public void testSetParentEmail() {

        Student ram = new Student("Ram", 5);
        ram.setParentEmail("raju123@gmail.com");

        String expected = "raju123@gmail.com";
        String got = ram.getParentEmail();

        assertEquals(expected, got);
        
    }

    @Test
    public void testSetfeePaid() {
        Student ram = new Student("Ram", 5);

        boolean given = true;
        boolean expected = true;
        ram.setfeePaid(given);
        boolean got = ram.isfeePaid();

        assertEquals(expected, got);

    }

    @Test
    public void testGetAverageMark() {
        Student ram = new Student("Ram", 5);
        Grade gradeOne = new Grade(1, "John");
        gradeOne.firstTerm(ram, 34, 64, 23);

        int expected = 40;
        int got = ram.getAverageMark("firstTerm");

        assertEquals(expected, got);



    }




}
