package SwiftFood;

public class Customer {
    private String customerID;
    private static int counter;
    private String customerName;
    private long contactNumber;
    private Address address;

    static {
        counter = 101;
    }

    // Constructor
    public Customer(String customerName, long contactNumber, Address address) {
        this.customerID = "C" + counter++;
        this.customerName = customerName;
        this.contactNumber = contactNumber;
        this.address = address;
    }

    // Getters & Setters
    public String getCustomerID() { return customerID; }
    public void setCustomerID(String customerID) { this.customerID = customerID; }

    public String getCustomerName() { return customerName; }
    public void setCustomerName(String customerName) { this.customerName = customerName; }

    public long getContactNumber() { return contactNumber; }
    public void setContactNumber(long contactNumber) { this.contactNumber = contactNumber; }

    public Address getAddress() { return address; }
    public void setAddress(Address address) { this.address = address; }

    // Business methods
    public double payBill(double totalPrice) {
        return totalPrice; // extend with discount logic if needed
    }

    public void displayCustomerDetails() {
        System.out.println("Customer Details");
        System.out.println("*****************************");
        System.out.println("Customer ID : " + customerID);
        System.out.println("Customer Name : " + customerName);
        System.out.println("Contact Number : " + contactNumber);
        System.out.println("Address : " + (address != null ? address.displayAddress() : "N/A"));
    }
}

