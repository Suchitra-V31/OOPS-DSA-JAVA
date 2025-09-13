package SwiftFood;

public class Restaurant {
    private String restaurantName;
    private long restaurantContact;
    private Address restaurantAddress;
    private double rating;

    // Constructor
    public Restaurant(String restaurantName, long restaurantContact, Address restaurantAddress, double rating) {
        this.restaurantName = restaurantName;
        this.restaurantContact = restaurantContact;
        this.restaurantAddress = restaurantAddress;
        this.rating = rating;
    }

    // Getters & Setters
    public String getRestaurantName() { return restaurantName; }
    public void setRestaurantName(String restaurantName) { this.restaurantName = restaurantName; }

    public long getRestaurantContact() { return restaurantContact; }
    public void setRestaurantContact(long restaurantContact) { this.restaurantContact = restaurantContact; }

    public Address getRestaurantAddress() { return restaurantAddress; }
    public void setRestaurantAddress(Address restaurantAddress) { this.restaurantAddress = restaurantAddress; }

    public double getRating() { return rating; }
    public void setRating(double rating) { this.rating = rating; }

    // Display method
    public void displayRestaurantDetails() {
        System.out.println("Restaurant Details");
        System.out.println("*******************");
        System.out.println("Restaurant Name    : " + restaurantName);
        System.out.println("Restaurant Rating  : " + rating);
        System.out.println("Restaurant Contact : " + restaurantContact);
        System.out.println("Restaurant Address : " + (restaurantAddress != null ? restaurantAddress.displayAddress() : "N/A"));
    }

    @Override
    public String toString() {
        return restaurantName + " (" + rating + "★)";
    }
}
