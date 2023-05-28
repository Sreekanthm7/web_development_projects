package universityproject;

import java.util.ArrayList;

public class Faculty {
    String name;
    int id;

    ArrayList<Course> coursesTeaches = new ArrayList<>();

    Faculty(String name, int id){
        this.name = name;
        this.id = id;
    }

    @Override
    public String toString() {
        return "Faculty [name=" + name + ", id=" + id + "]";
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

    
    public void addCoursesTaught(Course course){
        coursesTeaches.add(course);
    }
    public void removeCoursesTaught(Course course){
        coursesTeaches.remove(course);
    }
    public int numberOfCoursesTaught(){
        return coursesTeaches.size();
    }
}
