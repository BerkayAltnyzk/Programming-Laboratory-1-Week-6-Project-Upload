package lab_week_6;

public class EconomyRide extends Ride {
    private double pricePerMinute;

    public EconomyRide(String passengerName, String pickup, String destination, double distanceKm, int durationMin, double pricePerKm, double pricePerMinute) {
        super(passengerName, pickup, destination, distanceKm, durationMin, pricePerKm);
        if (pricePerMinute <= 0) {
            System.out.println("Warning: pricePerMinute must be positive. Set to 1.");
            this.pricePerMinute = 1;
        } else {
            this.pricePerMinute = pricePerMinute;
        }
    }

    public double getPricePerMinute() {
        return pricePerMinute;
    }

    @Override
    public double calculateFare() {
        double totalFare = super.calculateFare() + (getDurationMin() * pricePerMinute);
        if (totalFare < 50.0) {
            return 50.0;
        }
        return totalFare;
    }

    @Override
    public String toString() {
        return super.toString() + ", Price/Min: " + pricePerMinute + " TL";
    }
}