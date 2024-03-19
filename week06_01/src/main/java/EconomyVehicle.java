/**
 * Concrete class representing an economy vehicle.
 */
class EconomyVehicle extends Vehicle {
    private boolean isHybrid;
    private double hybridFee;

    /**
     * Constructor for EconomyVehicle class.
     * @param brand The brand of the economy vehicle.
     * @param model The model of the economy vehicle.
     * @param licensePlate The license plate of the economy vehicle.
     * @param basePrice The base rental price of the economy vehicle.
     * @param isHybrid Indicates if the economy vehicle is a hybrid.
     */
    public EconomyVehicle(String brand, String model, String licensePlate, double basePrice,
                          boolean isHybrid) {
        super(brand, model, licensePlate, basePrice);
        this.isHybrid = isHybrid;
        this.hybridFee = 10.0;
    }

    @Override
    public double calculateTotalPrice(int rentalDays) {
        double totalPrice = basePrice * rentalDays;
        if (isHybrid) totalPrice += hybridFee * rentalDays;
        return totalPrice;
    }
}