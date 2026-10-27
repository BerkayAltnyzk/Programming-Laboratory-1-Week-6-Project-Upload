package lab_week_6;

public class SharedRide extends EconomyRide {
    private int passengerCount;

    public SharedRide(String passengerName, String pickup, String destination, double distanceKm, int durationMin, double pricePerKm, double pricePerMinute, int passengerCount) {
        super(passengerName, pickup, destination, distanceKm, durationMin, pricePerKm, pricePerMinute);

        if (passengerCount < 1 || passengerCount > 4) {
            System.out.println("Warning: passengerCount must be between 1 and 4. Set to 1.");
            this.passengerCount = 1;
        } else {
            this.passengerCount = passengerCount;
        }
    }

    public int getPassengerCount() {
        return passengerCount;
    }

    @Override
    public double calculateFare() {
        double economyFare = super.calculateFare();
        return (economyFare / passengerCount) * 1.10;
    }

    @Override
    public String toString() {
        return super.toString() + ", Passenger Count: " + passengerCount;
    }
}