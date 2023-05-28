package bookmeetingroom;

public class Employee {
    String name;
    String id;
    


    Employee(String name, String id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Employee [name=" + name + ", id=" + id + "]";
    }



    public static void bookMeetingRoom(MeetingRoom meetingRoom, Employee employeeName) {
      
    }
    
}
               