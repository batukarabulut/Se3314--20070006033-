/**
 * Concrete class representing a luxury vehicle.
 */
class LuxuryVehicle extends Vehicle {
    private boolean hasGPS;
    private boolean hasLeatherSeats;
    private double gpsFee;
    private double leatherSeatsFee;

    /**
     * Constructor for LuxuryVehicle class.
     * @param brand The brand of the luxury vehicle.
     * @param model The model of the luxury vehicle.
     * @param licensePlate The license plate of the luxury vehicle.
     * @param basePrice The base rental price of the luxury vehicle.
     * @param hasGPS Indicates if the luxury vehicle has GPS.
     * @param hasLeatherSeats Indicates if the luxury vehicle has leather seats.
     */
    public LuxuryVehicle(String brand, String model, String licensePlate, double basePrice,
                         boolean hasGPS, boolean hasLeatherSeats) {
        super(brand, model, licensePlate, basePrice);
        this.hasGPS = hasGPS;
        this.hasLeatherSeats = hasLeatherSeats;
        this.gpsFee = 20.0;
        this.leatherSeatsFee = 30.0;
    }

    @Override
    public double calculateTotalPrice(int rentalDays) {
        double totalPrice = basePrice * rentalDays;
        if (hasGPS) totalPrice += gpsFee * rentalDays;
        if (hasLeatherSeats) totalPrice += leatherSeatsFee * rentalDays;
        return totalPrice;
    }
}