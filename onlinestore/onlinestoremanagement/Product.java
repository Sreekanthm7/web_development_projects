package onlinestoremanagement;

import java.util.ArrayList;

public class Product {
    String name;
    double price;
    String category;
    int quantity;
    ArrayList<Double> productRating = new ArrayList<>();
    ArrayList<String> productReview = new ArrayList<>();

    Product(String name, int price, String category, int quantity) {
        this.name = name;
        this.price = price;
        this.category = category;
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Product [name=" + name + ", price=" + price + ", category=" + category + "]";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

}
