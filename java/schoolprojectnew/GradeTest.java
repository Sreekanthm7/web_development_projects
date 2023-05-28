package schoolprojectnew;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class GradeTest {
    @Test
    public void testSetGrade() {
        Grade gradeOne = new Grade(3, "Leela");

        int expected = 3;
        int got = gradeOne.getGrade();

        assertEquals(expected, got);
    }

    @Test
    public void testGetClassTeacher() {
        Grade gradeOne = new Grade(3, "Leela");

        String expected = "Leela";
        String got = gradeOne.setClassTeacher("Leela");

        assertEquals(expected, got);
    }

    @Test
    public void testFeesToPay() {

        Double expected;
        Double got;

        Grade gradeOne = new Grade(1, "Leela");
        Student ram = new Student("Ram", 5);
        ram.setSingleParent(true);

         expected = 16000.0;
         got = gradeOne.feesToPay(ram);

        assertEquals(expected, got);


        ram.setSingleParent(false);

        expected = 20000.0;
        got = gradeOne.feesToPay(ram);
        
        assertEquals(expected, got);

        Grade gradeTwo = new Grade(2, "John");

        Student rahul = new Student("Rahul", 6);

        rahul.setSingleParent(true);

        expected = 24000.0;
        got = gradeTwo.feesToPay(rahul);

        assertEquals(expected, got);

        rahul.setSingleParent(false);

        expected = 30000.0;
        got = gradeTwo.feesToPay(rahul);

    }


}
