package universityproject;

public class Main {
    
   
// public static void testEnrolledCourses(){
//    String given;
//    String expected;
//    String got;

//       Course physics = new Course("Physics", "alex");


//       // test case 1
//       given = expected = "Physics";
//       physics.setCourseName(given);
//       got = physics.getCourseName();

//       assert(got == expected):"enrolledCourses: Test case 1 failed, given:"+given+" exp: "+expected+" but got:"+got;


// }






   public static void main(String[] args) {
   
      Faculty John = new Faculty("John", 1);
      Faculty Nimisha = new Faculty("Nimisha", 2);
      Faculty Alex = new Faculty("Alex", 2);

      Student rohit = new Student("Rohit", 1);
      Student shamil = new Student("Shamil", 2);
      Student anu = new Student("Anu", 3);
      Student anju = new Student("Anju", 4);

      rohit.setGrade(1.5);
      shamil.setGrade(4.5);
      anu.setGrade(4.5);
      anju.setGrade(4.6);


      rohit.addEnrolledCourses("physics");

      


      Course physics = new Course("Physics", John);
      Course maths  = new Course("Maths", Nimisha);
      Course cs = new Course("Computer Science", Alex);

      Department BSc = new Department("Bsc");

      System.out.println(physics.getAverageGrade());


      John.addCoursesTaught(physics);
      John.addCoursesTaught(cs);

      Nimisha.addCoursesTaught(maths);

      Alex.addCoursesTaught(cs);

   //   System.out.println(John.numberOfCoursesTaught());
     
     rohit.addEnrolledCourses(maths);

     rohit.removeEnrolledCourses(cs);


   //   System.out.println(rohit.getNumberOfEnrolledCourses());

   physics.addEnrolledStudent(anju);
   maths.addEnrolledStudent(rohit);
   physics.addEnrolledStudent(anu);
   cs.addEnrolledStudent(shamil);
    
   physics.setFacultyName(Alex);;
   maths.setFacultyName(Nimisha);

   // System.out.println(physics);
   
//   System.out.println(physics.enrolledStudents); 

// System.out.println(BSc.getcourse("maths"));

      BSc.addCourses(cs);
      BSc.addCourses(physics);
      BSc.addCourses(maths);


      // System.out.println(BSc.courses);


// testEnrolledCourses();
// System.out.println("test passed");


   }

}
