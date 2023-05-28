package onlinestoremanagement;

import java.util.regex.PatternSyntaxException;

public class Order {
    String paymentOption;
    String deliveryAddress;
    String MobileNumber;
    double payAmount;

    Order(String deliveryAddress, String MobileNumber) {
        this.deliveryAddress = deliveryAddress;
        this.MobileNumber = MobileNumber;
    }

    @Override
    public String toString() {
        return "Order [deliveryAddress=" + deliveryAddress + ", MobileNumber=" + MobileNumber + "]";
    }

    public void setDeliveryAddress(String deliveryAddress) {
        this.deliveryAddress = deliveryAddress;
    }

    public String getDeliveryAddress() {
        return deliveryAddress;
    }

    public String getPaymentOption() {
        return paymentOption;
    }

    public void setPaymentOption(String paymentOption) {
        this.paymentOption = paymentOption;
    }

    public String getMobileNumber() {
        return MobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        MobileNumber = mobileNumber;
    }

    public double isPayAmount() {
        return payAmount;
    }

    public void setPayAmount(double payAmount) {
        this.payAmount = payAmount;
    }

    public boolean payment(Cart cart) {
        if (isPayAmount() == cart.totalPriceInCart()) {
            return true;
        }
        return false;

    }
}
