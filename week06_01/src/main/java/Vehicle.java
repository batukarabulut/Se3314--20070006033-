import java.util.ArrayList;

/**
 * Abstract class representing a vehicle.
 */
abstract class Vehicle {
    protected String brand;
    protected String model;
    protected String licensePlate;
    protected double basePrice;

    /**
     * Constructor for Vehicle class.
     * @param brand The brand of the vehicle.
     * @param model The model of the vehicle.
     * @param licensePlate The license plate of the vehicle.
     * @param basePrice The base rental price of the vehicle.
     */
    public Vehicle(String brand, String model, String licensePlate, double basePrice) {
        this.brand = brand;
        this.model = model;
        this.licensePlate = licensePlate;
        this.basePrice = basePrice;
    }

    /**
     * Method to calculate the total rental price of the vehicle.
     * @param rentalDays The number of rental days.
     * @return The total rental price.
     */
    public abstract double calculateTotalPrice(int rentalDays);
}