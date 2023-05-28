package onlinestoremanagement;

import java.util.ArrayList;

public class Cart {
    ArrayList<Product> listOfProductInCart = new ArrayList<>();

    @Override
    public String toString() {
        return "Cart [listOfProductInCart=" + listOfProductInCart + "]";
    }

    public double totalPriceInCart() {
        double total = 0;
        for (int i = 0; i < listOfProductInCart.size(); i++) {

            total += listOfProductInCart.get(i).getPrice();
        }
        return total;
    }

}
