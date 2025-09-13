package SwiftFood;

public class RegularCustomer extends Customer {

    private float discount; // in percentage

    // Constructor
    public RegularCustomer(String customerName, long contactNumber, Address address) {
        super(customerName, contactNumber, address); // Call parent constructor
        this.discount = 5.0f; // default discount
    }

    public float getDiscount() {
        return discount;
    }

    public void setDiscount(float discount) {
        this.discount = discount;
    }

    // Override payBill to apply discount
    @Override
    public double payBill(double totalPrice) {
        double discountedPrice = totalPrice - (totalPrice * discount / 100);
        return discountedPrice;
    }

    @Override
    public void displayCustomerDetails() {
        super.displayCustomerDetails();
        System.out.println("Discount : " + discount + "%");
    }
}
