package universityproject;

import java.lang.reflect.Array;
import java.util.ArrayList;

import javax.xml.stream.XMLOutputFactory;

public class Department {

    String departmentName;

    ArrayList<Faculty> facultiesInDepartment = new ArrayList<>();
    ArrayList<Course> courses = new ArrayList<>();

    Department(String departmentName) {
        this.departmentName = departmentName;
    }

    @Override
    public String toString() {
        return "Department [departmentName=" + departmentName + "]";
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public void addFacultyMembers(Faculty facultyMember) {
        facultiesInDepartment.add(facultyMember);
    }

    public void removeFacultyMembers(Faculty facultyMember) {
        facultiesInDepartment.remove(facultyMember);
    }

    public void addCourses(Course course) {
        courses.add(course);
    }

    public void removeCourse(Course course) {
        courses.remove(course);
    }

    Course course;
    public Course getcourse(String courseName) {

        for (Course name : courses) {
            if (name.getCourseName() == courseName) {
                course = name;

            }
        }
        return course;
        

    }
}
