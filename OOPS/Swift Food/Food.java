package SwiftFood;

import java.util.Arrays;

public class Food {
    private String[] foodName;
    private String cuisine;
    private String foodType;
    private int quantityAvailable;
    private double unitPrice;

    // Constructor
    public Food(String[] foodName, String cuisine, String foodType, int quantityAvailable) {
        this.foodName = foodName;
        this.cuisine = cuisine;
        this.foodType = foodType;
        this.quantityAvailable = quantityAvailable;
        this.unitPrice = 0;
    }

    // Getters & Setters
    public String[] getFoodName() {
        return foodName;
    }

    public void setFoodName(String[] foodName) {
        this.foodName = foodName;
    }

    public String getCuisine() {
        return cuisine;
    }

    public void setCuisine(String cuisine) {
        this.cuisine = cuisine;
    }

    public String getFoodType() {
        return foodType;
    }

    public void setFoodType(String foodType) {
        this.foodType = foodType;
    }

    public int getQuantityAvailable() {
        return quantityAvailable;
    }

    public void setQuantityAvailable(int quantityAvailable) {
        this.quantityAvailable = quantityAvailable;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    // Business logic
    public double calculatePrice() {
        switch (foodType) {
            case "Tiffin":
                this.unitPrice = 100 * quantityAvailable;
                break;
            case "Meals":
            case "Briyani":
                this.unitPrice = 200 * quantityAvailable;
                break;
            case "Dinner":
                this.unitPrice = 250 * quantityAvailable;
                break;
            default:
                this.unitPrice = 0;
        }
        return unitPrice;
    }

    public void displayFoodDetails() {
        System.out.println("Food Details");
        System.out.println("**************");
        System.out.println("Food Name : " + Arrays.toString(foodName));
        System.out.println("Cuisine : " + cuisine);
        System.out.println("Food Type: " + foodType);
        System.out.println("Quantity : " + quantityAvailable);
        System.out.println("Unit Price : " + unitPrice);
    }

    @Override
    public String toString() {
        return Arrays.toString(foodName) + " (" + foodType + ")";
    }
}
