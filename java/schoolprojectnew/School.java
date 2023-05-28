package schoolprojectnew;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class School {

    private String name;
    private String principalName;

    ArrayList<Grade> gradeList = new ArrayList<>();
    ArrayList<Student> passedStudents = new ArrayList<>();
    ArrayList<Student> failedStudents = new ArrayList<>();

    School(String name, String principalName) {
        this.name = name;
        this.principalName = principalName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrincipalName() {
        return principalName;
    }

    public void setPrincipalName(String principalName) {
        this.principalName = principalName;
    }

    public void addGrade(Grade grade) {
        gradeList.add(grade);
    }

    public boolean admitStudent(Student student, int grade) {
        boolean isAdmitted = false;

        if (student.getAge() >= 5 && student.isfeePaid() == true) {
            for (Grade listOfGrades : gradeList) {
                if (listOfGrades.getGrade() == grade) {
                    listOfGrades.studentList.add(student);
                }
                isAdmitted = true;

            }
            System.out.println(student.getName() + " is Admitted");
        } else {
            System.out.println(student.getName() + " Cant Admit");
        }
        return isAdmitted;
    }

    @Override
    public String toString() {
        return "School [name=" + name + ", principalName=" + principalName + ", gradeList=" + gradeList + ", gradeName="
                + gradeName + "]";
    }

    Grade gradeName;

    public Grade getGrade(int grade) {
        for (Grade grades : gradeList) {
            if (grades.getGrade() == grade) {
                gradeName = grades;
            }
        }
        return gradeName;
    }

    public void passToNextGrade(Student student, int nextGrade) {
        if (nextGrade < 2) {
            return;
        }
        Grade currentGrade = getGrade(nextGrade - 1);

        if (student.isEligibleToPass() && student.isfeePaid()) {
            currentGrade.studentList.remove(student);
        }
        getGrade(nextGrade).studentList.add(student);
    }

    public void passAllStudentsToNextGrade() {
        for (Grade grade : gradeList) {
            ArrayList<Student> eligibleStudents = grade.eligibleStudentsToNextGrade();
            grade.studentList.removeAll(eligibleStudents);
            getGrade(grade.getGrade() + 1).studentList.addAll(eligibleStudents);

            if (grade.getGrade() == 3) {
                this.passedStudents.addAll(eligibleStudents);
            }

        }
    }

    public void notifyParentByEmail() {
        for (Grade grade : gradeList) {
            for (Student student : grade.studentList) {
                if (student.isfeePaid() == false) {
                    System.out.println(student.getParentEmail() + " " + student.getName()
                            + " have pending fee , please pay the fees as soon as possible");
                }
            }
        }
    }

    public void failedFinalExam() {
        for (Grade grade : gradeList) {
            for (Student student : grade.studentList) {
                if (student.isEligibleToPass() == false) {
                    failedStudents.add(student);
                }
            }
        }
    }

}
