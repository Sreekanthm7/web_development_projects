package onlinestoremanagement;

public class Transaction {

    boolean shipped;
    boolean delivered;
    boolean canceled;

    public boolean placeOrder(Order order, Cart cart, Onlinestore store) {

        if (order.payment(cart) == true) {
            return true;
        }
        return false;
    }

    public boolean isShipped() {
        return shipped;
    }

    public void setShipped(boolean shipped, Order order) {
        this.shipped = shipped;
    }

    public boolean isDelivered() {
        return delivered;
    }

    public void setDelivered(boolean delivered, Order order) {
        this.delivered = delivered;
    }

    public boolean isCanceled() {
        return canceled;
    }

    public void setCanceled(boolean canceled, Order order) {
        this.canceled = canceled;
    }

    public void updateStatus(Order order, Customer customer) {
        if (isShipped() == true) {
            System.out.println(customer.getEmail() + " your product is shipped");
        } else if (isDelivered() == true) {
            System.out.println(customer.getEmail() + " Your product is delivered");
        } else if (isCanceled() == true) {
            System.out.println(customer.getEmail() + " Your order is canceled");
        } else {
            System.out.println(customer.getEmail() + " there is some issues in your product! sorry...");
        }

    }

}
