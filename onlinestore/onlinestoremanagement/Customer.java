package onlinestoremanagement;

public class Customer {
    String name;
    int id;
    String email;
    String mobileNumber;

    Customer(String name, int id, String email, String mobileNumber) {
        this.name = name;
        this.id = id;
        this.email = email;
        this.mobileNumber = mobileNumber;
    }

    @Override
    public String toString() {
        return "Customer [name=" + name + ", id=" + id + ", email=" + email + ", mobileNumber=" + mobileNumber + "]";
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {

        this.email = email;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public void addToCart(Product product, Cart cart, int quantity, Onlinestore store) {

        for (int i = 0; i < quantity; i++) {
            if (product.getQuantity() >= quantity) {
                cart.listOfProductInCart.add(product);
            }

        }

    }

    public void removeFromCart(Product product, Cart cart) {
        cart.listOfProductInCart.remove(product);
    }

    public void viewCart(Cart cart) {
        System.out.println("our cart: " + cart.listOfProductInCart);
    }

    public void browzeProductByCategory(String category, Onlinestore store) {
        for (Product product : store.listOfProducts) {
            if (product.getCategory() == category) {
                System.out.println("product by category: " + product);
            }
        }
    }

    public void searchProductByName(String name, Onlinestore store) {
        for (Product product : store.listOfProducts) {
            if (product.getName() == name) {
                System.out.println("product by name: " + product);
            }
        }
    }

    public void checkout(Cart cart) {

        System.out.println("checkout amount: " + cart.totalPriceInCart());
    }

    public void rating(Product product, double rating) {

        product.productRating.add(rating);

    }

    public void review(Product product, String review) {
        product.productReview.add(review);
    }
}