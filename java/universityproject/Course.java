package universityproject;

import java.util.ArrayList;

public class Course {
    String courseName;
    Faculty facultyName;

    ArrayList<Student> enrolledStudents = new ArrayList<>();

    Course(String courseName, Faculty nimisha){
        this.courseName = courseName;
        this.facultyName = nimisha;

    }


    public Course(String courseName2, String string) {
    }


    @Override
    public String toString() {
        return "Course [courseName=" + courseName + ", facultyName=" + facultyName + "]";
    }


    public String getCourseName() {
        return courseName;
    }


    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }


    public Faculty getFacultyName() {
        return facultyName;
    }


    public void setFacultyName(Faculty nimisha) {
        this.facultyName = nimisha;
    }

    public void addEnrolledStudent(Student student){
        enrolledStudents.add(student);
    }

    public void removeEnrolledStudent(Student student){
        enrolledStudents.remove(student);
    }
    
    public int numberOfEnrolledStudents(){
            return enrolledStudents.size();
    }

    int totalGrade = 0;
    public double getTotalGrade(){
        
        for(Student grade : enrolledStudents){
            totalGrade += grade.getGrade();
        }
        return totalGrade;
    }
 
    public double getAverageGrade(){
        int averageGrade = totalGrade / enrolledStudents.size();
        return averageGrade;
    }

}
