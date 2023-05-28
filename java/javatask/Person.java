package javatask;

import java.util.ArrayList;
import java.util.regex.Pattern;

public class Person {
    String name;
    int age;
    String gender;
    String email;
    String friends;
    String JobTitle;
    String Address;

    Person(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Person [name=" + name + ", age=" + age + ", gender=" + gender + "]";
    }

    ArrayList<Person> Pfriends = new ArrayList<>();

    public String getName() {
        return name;

    }

    public void setName(String newName) {
        this.name = newName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(Integer newAge) {
        if (newAge > this.age) {
            this.age = newAge;
        }

    }

    public String getGender() {
        return gender;
    }

    public void setGender(String newGender) {

        if (newGender == "Male" || newGender == "Female" || newGender == "Other") {
            this.gender = newGender;
        }
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String newEmail) {
        String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\."+
        "[a-zA-Z0-9_+&*-]+)*@" +
        "(?:[a-zA-Z0-9-]+\\.)+[a-z" +
        "A-Z]{2,7}$";
          
        Pattern pat = Pattern.compile(emailRegex);

        if(pat.matcher(email).matches()){
        this.email = newEmail;
        }
    }

    public void greet() {
        System.out.println(name + " have a nice day.......");

    }

    public boolean isAdult() {
        if (age >= 18) {

            return true;
        } else {

            return false;
        }
    }

    public String getFriends() {
        return friends;
    }

    public void setFriends(String newFriends) {
        this.friends = newFriends;
    }

    public void addFriend(Person name) {
        Pfriends.add(name);
    }

    public void removeFriend(Person name) {
        Pfriends.remove(name);
    }

    public boolean hasFriend(String name) {
        for (Person friend : Pfriends) {
            if (friend.getName() == name) {
              return true;
            } else {
                return false;
            }
        }
        return false;

    }

    public String getJobTitle() {
        return JobTitle;

    }

    public boolean setJobTitle(String newJobTitle) {
        this.JobTitle = newJobTitle;
        return false;
    }

    public void addJobTitle(Person given) {
        Pfriends.add(given);
    }

    public void introduce() {
        System.out.println("My name is " + name + " i am " + age + " years old, my gender is " + gender
                + ", and my job is " + JobTitle);
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String NewAdress) {
        this.Address = NewAdress;
    }

    public void printFriends() {
        for (Person friends : Pfriends) {
            System.out.println(friends.getName());
        }
    }

}
