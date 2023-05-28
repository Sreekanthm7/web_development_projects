package universityproject;

import java.util.ArrayList;

import schoolprojectnew.Grade;

public class Student {
    String name;
    int id;
    double grade;

    ArrayList<Course> coursesEnrolled = new ArrayList<>();

    Student(String name, int id) {
        this.name = name;
        this.id = id;
    }

    @Override
    public String toString() {
        return "Student [name=" + name + ", id=" + id + "]";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getGrade() {
        return grade;

    }
    public void setGrade(double grade) {
        this.grade = grade;
    }

    public void addEnrolledCourses(Course maths) {
        coursesEnrolled.add(maths);
    }

    public void removeEnrolledCourses(Course courses) {
        coursesEnrolled.remove(courses);
    }

    public int getNumberOfEnrolledCourses() {

        return coursesEnrolled.size();
    }

    public void addEnrolledCourses(String string) {
    }

}
