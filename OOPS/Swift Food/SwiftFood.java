package SwiftFood;


public class SwiftFood {
	public static void main(String[] args) {
        // Create Address for Customer
        Address custAddress = new Address("12A", "Chennai", "MG Road", 600041);

        // Create Customer
        Customer customer = new Customer("Ravi Kumar", 9876543210L, custAddress);
        customer.displayCustomerDetails();
        System.out.println();
        
        Address addr = new Address("12A", "Chennai", "MG Road", 600041);
        RegularCustomer regular = new RegularCustomer("Priya", 9876543211L, addr);
        regular.displayCustomerDetails();
        System.out.println("Bill after discount: ₹" + regular.payBill(1000));

        // Create Restaurant
        Restaurant restaurant = new Restaurant("Spice Garden", 9123456780L, custAddress, 4.5);
        restaurant.displayRestaurantDetails();
        System.out.println();

        // Create Food items
        Food food1 = new Food(new String[]{"Idly", "Vada"}, "South Indian", "Tiffin", 2);
        food1.calculatePrice();
        food1.displayFoodDetails();

        Food food2 = new Food(new String[]{"Chicken Briyani"}, "South Indian", "Briyani", 1);
        food2.calculatePrice();
        food2.displayFoodDetails();

        System.out.println();

        // Place Order
        Food[] orderedFoods = { food1, food2 };
        Order order = new Order(orderedFoods, customer);
        order.calculateTotalPrice("Credit Card"); // apply discount if CC
        order.displayOrderDetails();

        // Bill payment
        double billAmount = customer.payBill(order.getTotalPrice());
        System.out.println("\nBill paid successfully: ₹" + billAmount);
    }

}



