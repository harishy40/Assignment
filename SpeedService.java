package com.assignment.harish;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SpeedService {
    private final Map<String, RentalData> activeRentals = new HashMap<>();
    private final List<NotifyInfService> notificationServices;

    public SpeedService(List<NotifyInfService> notificationServices) {
        this.notificationServices = notificationServices;
    }

    public void registerRental(RentalData rental) {
        activeRentals.put(rental.getCarId(), rental);
    }

    public void processSpeedData(SpeedData event) {
        if (!activeRentals.containsKey(event.getCarId())) {
            System.out.println(" No rental found for car: " + event.getCarId());
            return;
        }

        RentalData rental = activeRentals.get(event.getCarId());
        if (event.getSpeed() > rental.getMaxSpeedLimit()) {
            String warningMessage = " Car crossd speed limit" + rental.getCarId() +
                                    " exceeded " + rental.getMaxSpeedLimit() + " km/h.";
            
            for (NotifyInfService service : notificationServices) {
                service.notifyRenter(rental.getRenterId(), warningMessage);
                service.notifyRentalCompany(rental.getRentalId(), warningMessage);
            }
        }
    }
}
