package onlinestoremanagement;

import java.util.ArrayList;

public class Onlinestore {
    String name;

    ArrayList<Product> listOfProducts = new ArrayList<>();

    Onlinestore(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Onlinestore [name=" + name + ", listOfProducts=" + listOfProducts + "]";
    }

}
