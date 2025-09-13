package SwiftFood;

public class Address {
    private String doorNo;
    private String city;
    private String street;
    private int zipCode;

    // Constructor
    public Address(String doorNo, String street, String city, int zipCode) {
        this.doorNo = doorNo;
        this.street = street;
        this.city = city;
        this.zipCode = zipCode;
    }

    // Getters & Setters
    public String getDoorNo() { return doorNo; }
    public void setDoorNo(String doorNo) { this.doorNo = doorNo; }

    public String getCity() { return city; }
    public void setCity(String city) { this.city = city; }

    public String getStreet() { return street; }
    public void setStreet(String street) { this.street = street; }

    public int getZipCode() { return zipCode; }
    public void setZipCode(int zipCode) { this.zipCode = zipCode; }

    // Business method
    public String displayAddress() {
        return doorNo + ", " + street + ", " + city + " - " + zipCode;
    }

    @Override
    public String toString() {
        return displayAddress();
    }
}
