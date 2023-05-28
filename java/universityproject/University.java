package universityproject;

import java.util.ArrayList;

public class University {

    ArrayList<Department> departments = new ArrayList<>();
    ArrayList<Student> students = new ArrayList<>();
    ArrayList<Faculty> faculties = new ArrayList<>();

    public void addDepartment(Department department) {
        departments.add(department);
    }

    public void removeDepartment(Department department) {
        departments.remove(department);
    }

    public void addStudent(Student student){
        students.add(student);
    }

    public void removeStudent(Student student){
        students.remove(student);
    }

    public void addFacultyMembers(Faculty facultyMembers){
        faculties.add(facultyMembers);
    }

    public void removeFacultyMembers(Faculty facultyMembers){
        faculties.remove(facultyMembers);
    }

    Department departmentObj;
    public Department getDepartment(String departmentName){

        for(Department name: departments){
            if(name.getDepartmentName() == departmentName){
               departmentObj = name;
            }
        }
        return departmentObj;

    }


}
