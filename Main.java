package com.assignment.harish;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        NotifyInfService firebaseService = new FirebaseNotifyInfService();
        NotifyInfService awsService = new AwsNotifyInfService();

        SpeedService speedMonitor = new SpeedService(Arrays.asList(firebaseService, awsService));

        RentalData rental1 = new RentalData("RentalID1", "CAR1", "customerA", 100);
        RentalData rental2 = new RentalData("RentalID2", "CAR2", "customerB", 120);
        
        speedMonitor.registerRental(rental1);
        speedMonitor.registerRental(rental2);

        SpeedData event1 = new SpeedData("CAR1", 110, System.currentTimeMillis()); // Exceeds customerA's limit (100)
        SpeedData event2 = new SpeedData("CAR2", 110, System.currentTimeMillis()); // Within customerB's limit (120)

        speedMonitor.processSpeedData(event1);
        speedMonitor.processSpeedData(event2);
    }
}
