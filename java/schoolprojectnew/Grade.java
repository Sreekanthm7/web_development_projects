package schoolprojectnew;

import java.util.ArrayList;

public class Grade {
    int grade;
    String classTeacher;
    Student child;
    double feesAmount;

    ArrayList<Student> studentList = new ArrayList<>();

    Grade(int grade, String classTeacher) {
        this.grade = grade;
        this.classTeacher = classTeacher;

    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public String getClassTeacher() {
        return classTeacher;
    }

    public String setClassTeacher(String classTeacher) {
        return this.classTeacher = classTeacher;
    }

    public Student getChild() {
        return child;
    }

    public void setChild(Student child) {
        this.child = child;
    }

    public double getFeesAmount() {
        return feesAmount;
    }

    public void setFeesAmount(int feesAmount) {
        this.feesAmount = feesAmount;
    }

    public double feesToPay(Student student) {
        if (student.isEligibleForFeeDiscount() == true && getGrade() == 1) {
            double feeDiscount = 0.2 * 20000;
            feesAmount = 20000 - feeDiscount;
        } else if (student.isEligibleForFeeDiscount() == false && getGrade() == 1) {
            feesAmount = 20000;
        } else if (student.isEligibleForFeeDiscount() == true && (getGrade() == 2 || getGrade() == 3)) {
            double feeDiscount = 0.2 * 30000;
            feesAmount = 30000 - feeDiscount;
        } else if (student.isEligibleForFeeDiscount() == false && (getGrade() == 2 || getGrade() == 3)) {
            feesAmount = 30000;
        }
        return feesAmount;

    }

    public void firstTerm(Student student, int language, int drawing, int craft) {
        student.firstTerm.add(language);
        student.firstTerm.add(drawing);
        student.firstTerm.add(craft);
    }

    public void secondTerm(Student student, int language, int drawing, int craft) {
        student.secondTerm.add(language);
        student.secondTerm.add(drawing);
        student.secondTerm.add(craft);
    }

    public void thirdTerm(Student student, int language, int drawing, int craft) {
        student.thirdTerm.add(language);
        student.thirdTerm.add(drawing);
        student.thirdTerm.add(craft);
    }

    ArrayList<Student> eligibleStudents = new ArrayList<>();

    public ArrayList<Student> eligibleStudentsToNextGrade() {
        for (Student student : studentList) {
            if (student.isEligibleToPass() && student.isfeePaid()) {
                student.firstTerm.clear();
                student.secondTerm.clear();
                student.thirdTerm.clear();

                eligibleStudents.add(student);
            }
        }
        return eligibleStudents;
    }

    public ArrayList<Student> getstudentsWithPendingFee() {
        ArrayList<Student> studentsWithPendingFee = new ArrayList<>();
        for (Student student : studentList) {
            if (student.isfeePaid() == false) {
                studentsWithPendingFee.add(student);
            }

        }
        return studentsWithPendingFee;
    }

}
