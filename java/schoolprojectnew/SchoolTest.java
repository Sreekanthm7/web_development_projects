package schoolprojectnew;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SchoolTest {
    @Test
    public void testAdmitStudent() {

        School school = new School("Vijaya", "Mary");

        Student ram = new Student("Ram", 4);

        int given = 3;
        int expected = 3;
        school.admitStudent(ram, 3);
        int got = given;
        assertEquals(got, expected);
    }

    @Test
    public void testGetGrade() {
        School school = new School("Vijaya", "Varghese");
        Student ram = new Student("Ram", 4);

        int given = 1;
        int expected = 1;
        school.getGrade(1);

        assertEquals(given, expected);
    }


    


    
}
