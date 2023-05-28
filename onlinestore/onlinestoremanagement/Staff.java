package onlinestoremanagement;

public class Staff {
    String name;
    int id;

    Staff(String name, int id) {
        this.name = name;
        this.id = id;
    }

    @Override
    public String toString() {
        return "Staff [name=" + name + ", id=" + id + "]";
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

    public void addProductToStore(Onlinestore onlinestore, Product product) {
        for (int i = 0; i < product.getQuantity(); i++) {

            onlinestore.listOfProducts.add(product);
        }
    }

    public void removeProductFromStore(Onlinestore onlinestore, Product product) {

        onlinestore.listOfProducts.remove(product);

    }

    public void addProductToInventory(Product product, Inventory inventory) {
        for (int i = 0; i < product.getQuantity(); i++) {
            inventory.listOfAvailableProducts.add(product);
        }
    }

    public void removeProductFromInventory(Product product, Inventory inventory) {
        inventory.listOfAvailableProducts.remove(product);
    }

    public void updateProducts(Order order, Cart cart, Transaction transaction, Onlinestore store) {
        if (transaction.placeOrder(order, cart, store) == true) {
            for (Product product : cart.listOfProductInCart) {
                store.listOfProducts.remove(product);
            }
            cart.listOfProductInCart.clear();
        }

    }
}
