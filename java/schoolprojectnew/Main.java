package schoolprojectnew;

public class Main {

  public static void testIsSingleParent() {
    boolean got;
    boolean expected;

    Student ram = new Student("Ram", 5);

    // test case 1
    ram.setSingleParent(false);
    expected = true;
    got = ram.isSingleParent();

    assert (got == expected) : "singleParent:Test case 1 failed, exp: " + expected + " but got:" + got;

    // test case 2
    ram.setSingleParent(true);
    expected = false;
    got = ram.isSingleParent();

    assert (got == expected) : "singleParent:Test case 2 failed, exp: " + expected + " but got:" + got;

  }

  public static void testParentEmail() {
    String given;
    String expected;
    String got;

    Student ram = new Student("Ram", 5);

    // test case 1
    given = "raju123@gmail.com";
    expected = "raju123@gmail.com";
    ram.setParentEmail(given);
    got = ram.getParentEmail();

    assert (got == expected) : "setEmail: Test case 1 failed.  given: " + given + " exp:" + expected + "but got:" + got;

    // test case 2

    given = "ra123gm2ail.com";
    ram.setParentEmail(given);
    got = ram.getParentEmail();

    assert (got == expected) : "setEmail: Test case 2 failed.  given: " + given + " exp:" + expected + "but got:" + got;

  }

  public static void testIsFeePaid() {
    boolean given;
    boolean expected;
    boolean got;

    Student ram = new Student("Ram", 5);

    // test case 1

    given = true;
    expected = true;
    ram.setfeePaid(given);
    got = ram.isfeePaid();

    assert (got == expected)
        : "setfeePaid: Test case 1 failed.  given: " + given + " exp:" + expected + "but got:" + got;

    // test case 2

    given = expected = false;
    ram.setfeePaid(given);
    got = ram.isfeePaid();

    assert (got == expected)
        : "setFeePaid: Test case 2 failed.  given: " + given + " exp:" + expected + "but got:" + got;

  }

  public static void testAverageMark() {

    int expected;
    int got;

    Student ram = new Student("Ram", 5);

    Grade gradeOne = new Grade(1, "John");

    gradeOne.firstTerm(ram, 54, 24, 34);

    // test case 1

    expected = 37;
    got = ram.getAverageMark("firstTerm");

    assert (got == expected) : "testAverageMark : Test case 2 failed. exp:" + expected + "but got:" + got;

  }

  public static void testGrade() {

    int expected;
    int got;

    Grade gradeOne = new Grade(3, "leela");

    // test case 1

    expected = 3;
    got = gradeOne.getGrade();

    assert (got == expected) : "testGrade : Test case 2 failed. exp:" + expected + "but got:" + got;

  }

  public static void testClassTeacher() {

    String expected;
    String got;

    Grade gradeOne = new Grade(3, "Leela");

    // test case 1

    expected = "Leela";
    got = gradeOne.setClassTeacher("Leela");

    assert (got == expected) : "testClassTeacher : Test case 2 failed. exp:" + expected + "but got:" + got;

  }

  public static void testAdmitStudent() {
    boolean given;
    boolean expected;
    boolean got;

    School school = new School("Vijaya", "Mary");
    Student ram = new Student("Ram", 2);

    // test case 1

    given = true;
    expected = true;
    school.admitStudent(ram, 2);
    got = given;

    assert (got == expected) : "testAdmitStudent : Test case 2 failed. exp:" + expected + "but got:" + got;

  }

  public static void main(String[] args) {

    Student ram = new Student("Ram", 5);
    Student aswin = new Student("Aswin", 6);
    Student akhil = new Student("Akhil", 5);
    Student anju = new Student("Anju", 7);

    ram.setSingleParent(true);
    ram.setfeePaid(false);
    aswin.setSingleParent(true);
    aswin.setfeePaid(false);
    akhil.setSingleParent(true);
    akhil.setfeePaid(true);
    anju.setSingleParent(false);
    anju.setfeePaid(true);

    ram.setParentEmail("raju123@gmail.com");
    aswin.setParentEmail("sathosh322@gmail.com");
    akhil.setParentEmail("rajan144@gmail.com");
    anju.setParentEmail("george123@gmail.com");
    Grade gradeOne = new Grade(1, "Mohan");
    Grade gradeTwo = new Grade(2, "Boby");
    Grade gradeThree = new Grade(3, "Reshmi");

    School school = new School("Vijaya HSS", "Mary");

    school.addGrade(gradeOne);
    school.addGrade(gradeTwo);
    school.addGrade(gradeThree);

    System.out.println(ram.isEligibleForFeeDiscount());
    System.out.println(anju.isEligibleForFeeDiscount());

    school.admitStudent(ram, 1);
    school.admitStudent(anju, 3);
    school.admitStudent(akhil, 1);
    gradeTwo.studentList.add(aswin);

    gradeOne.firstTerm(ram, 88, 68, 62);
    gradeOne.secondTerm(ram, 82, 73, 62);
    gradeOne.thirdTerm(ram, 92, 60, 70);

    gradeTwo.firstTerm(aswin, 81, 62, 63);
    gradeTwo.secondTerm(aswin, 54, 90, 70);
    gradeTwo.thirdTerm(aswin, 44, 53, 83);

    gradeOne.firstTerm(akhil, 74, 74, 53);
    gradeOne.secondTerm(akhil, 42, 72, 83);
    gradeOne.thirdTerm(akhil, 63, 83, 64);

    gradeThree.firstTerm(anju, 82, 73, 95);
    gradeThree.secondTerm(anju, 83, 63, 53);
    gradeThree.thirdTerm(anju, 83, 84, 52);

    System.out.println(ram.isEligibleToPass());
    System.out.println(aswin.isEligibleToPass());
    System.out.println(akhil.isEligibleToPass());
    System.out.println(anju.isEligibleToPass());

    gradeOne.setClassTeacher("Smitha");

    System.out.println(gradeOne.classTeacher);

    school.setPrincipalName("Varghese");
    System.out.println(school.getPrincipalName());

    ram.updateFirstTermMark(43, 53, 75);
    System.out.println(ram.firstTerm);
    ram.updateSecondTermMark(62, 32, 66);
    System.out.println(ram.secondTerm);
    ram.updateThirdTermMark(64, 85, 32);
    System.out.println(ram.thirdTerm);

    System.out.println(ram.isEligibleToPass());

    school.passAllStudentsToNextGrade();

    System.out.println(gradeOne.feesToPay(ram));
    System.out.println(anju.isEligibleForFeeDiscount());
    System.out.println("anju: " + gradeThree.feesToPay(anju));

    System.out.println(gradeTwo.getstudentsWithPendingFee());

    System.out.println(school.passedStudents);

    school.notifyParentByEmail();

    school.failedFinalExam();

    System.out.println("failed students: " + school.failedStudents);

    testIsSingleParent();
    testParentEmail();
    testIsFeePaid();
    testAverageMark();
    testGrade();
    testClassTeacher();
    testAdmitStudent();
    System.out.println("test passed");

  }

}
