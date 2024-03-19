import java.util.ArrayList;

/**
 * Main class for testing the car rental system.
 */
public class CarRentalSystem {
    /**
     * The main method.
     * @param args The command line arguments.
     */
    public static void main(String[] args) {
        // Create some vehicle instances
        Vehicle luxuryCar = new LuxuryVehicle("BMW", "X5", "ABC123", 100.0, true, true);
        Vehicle economyCar = new EconomyVehicle("Toyota", "Prius", "XYZ456", 50.0, true);

        // Display rental information
        displayRentalInfo(luxuryCar, 5, "John Doe");
        displayRentalInfo(economyCar, 3, "Jane Smith");
    }

    /**
     * Method to display rental information.
     * @param vehicle The rented vehicle.
     * @param rentalDays The number of rental days.
     * @param lessor The lessor's name.
     */
    public static void displayRentalInfo(Vehicle vehicle, int rentalDays, String lessor) {
        System.out.println("Rental Information:");
        System.out.println("Vehicle: " + vehicle.brand + " " + vehicle.model);
        System.out.println("License Plate: " + vehicle.licensePlate);
        System.out.println("Rental Days: " + rentalDays);
        System.out.println("Total Price: $" + vehicle.calculateTotalPrice(rentalDays));
        System.out.println("Lessor: " + lessor);
        System.out.println();
    }
}
