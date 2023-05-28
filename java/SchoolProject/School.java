package SchoolProject;

import java.util.ArrayList;

public class School {
    public static void main(String[] args) {
        Student s1 = new Student("Joe", 5, true, "paid", 1, 60, 20000);
        Student s2 = new Student("Rahul", 6, true, "not paid",2, 48, 30000);
        Student s3 = new Student("Ram", 7, false, "not paid",3, 70, 30000);
        Student s4 = new Student("Rohit", 5, true, "paid", 1, 80, 20000);
        
        ArrayList<Student> data = new ArrayList<Student>();
        data.add(s1);
        data.add(s2);
        data.add(s3);
        data.add(s4);
        

        System.out.println(s1.toString());
        System.out.println(s2.toString());
        System.out.println(s3.toString());
        System.out.println(s4.toString());

        newAdmission n1 = new newAdmission("Alex", 5, false, 1, 20000);
        newAdmission n2 = new newAdmission("Tom", 6, true, 2, 30000);

        ArrayList<newAdmission> newStudents = new ArrayList<>();
        newStudents.add(n1);
        newStudents.add(n2);
        


        
        s1.FirstTerm(30, 20, 10);
        s1.SecondTerm(30, 10, 20);
        s1.ThirdTerm(40, 30, 10);

        s2.FirstTerm(40, 10, 20);
        s2.SecondTerm(10, 5, 10);
        s2.ThirdTerm(40, 50, 19);

        s3.FirstTerm(40, 50, 12);
        s3.SecondTerm(54, 21, 13);
        s3.ThirdTerm(12, 2, 12);
        
        
        
        
        s1.FirstTermTotal();

        s1.SecondTermTotal();

        s1.ThirdTermTotal();

        s2.feeDiscount();

        n2.feeDiscount();
        
        s1.isEligible();

        
    }


}
