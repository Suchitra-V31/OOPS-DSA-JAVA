package SwiftFood;

import java.util.Arrays;

public class Order {
    private static int orderIdCounter;
    private int orderId;
    private Customer customer;
    private Food[] orderedFoods;
    private double totalPrice;
    private String status;

    // static block
    static {
        orderIdCounter = 101;
    }

    // Default constructor
    public Order() {
        this.status = "Ordered";
    }

    // Constructor with food list + customer
    public Order(Food[] orderedFoods, Customer customer) {
        this.orderId = orderIdCounter++;
        this.orderedFoods = orderedFoods;
        this.customer = customer;
        this.status = "Ordered";
    }

    // Static method to return total number of orders
    public static int getTotalNoOfOrders() {
        return orderIdCounter - 101;
    }

    // Getters & Setters
    public int getOrderId() { return orderId; }
    public void setOrderId(int orderId) { this.orderId = orderId; }

    public Customer getCustomer() { return customer; }
    public void setCustomer(Customer customer) { this.customer = customer; }

    public Food[] getOrderedFoods() { return orderedFoods; }
    public void setOrderedFoods(Food[] orderedFoods) { this.orderedFoods = orderedFoods; }

    public double getTotalPrice() { return totalPrice; }
    public void setTotalPrice(double totalPrice) { this.totalPrice = totalPrice; }

    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }

    // Calculate price with payment mode discount
    public double calculateTotalPrice(String paymentMode) {
        double price = 0;
        if (orderedFoods != null) {
            for (Food food : orderedFoods) {
                price += food.getUnitPrice();
            }
        }

        if ("Credit Card".equalsIgnoreCase(paymentMode)) {
            price *= 0.95; // 5% discount
        }

        this.totalPrice = price;
        return totalPrice;
    }

    public void displayOrderDetails() {
        System.out.println("Order Details");
        System.out.println("*******************");
        System.out.println("Order ID : " + orderId);
        System.out.println("Customer : " + (customer != null ? customer.getCustomerName() : "N/A"));
        System.out.println("Ordered Food : " + Arrays.toString(orderedFoods));
        System.out.println("Order Status : " + status);
        System.out.println("Total Price : " + totalPrice);
        System.out.println("Total Orders Placed: " + getTotalNoOfOrders());
    }
}
