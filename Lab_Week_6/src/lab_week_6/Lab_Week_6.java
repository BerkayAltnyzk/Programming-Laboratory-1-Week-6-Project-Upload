package lab_week_6;

import java.util.ArrayList;

public class Lab_Week_6 {
    
    public static void main(String[] args) {
        
        ArrayList<Ride> rides = new ArrayList<>();

        rides.add(new Ride("Ahmet Yılmaz", "Kadıköy", "Beşiktaş", 12.5, 30, 20.0));
        rides.add(new EconomyRide("Ayşe Demir", "Üsküdar", "Ümraniye", 8.0, 20, 18.0, 2.5));
        rides.add(new PremiumRide("Mehmet Kaya", "Şişli", "Havalimanı", 40.0, 45, 30.0, 150.0, 1.5));
        rides.add(new SharedRide("Zeynep Çelik", "Bakırköy", "Taksim", 15.0, 35, 18.0, 2.0, 3));

        for (Ride ride : rides) {
            System.out.println(ride.toString());
            System.out.printf("Total Fare: %.2f TL%n", ride.calculateFare());
            System.out.println("--------------------------------------------------");
        }
    }
}