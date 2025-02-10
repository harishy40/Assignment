package com.assignment.harish;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SpeedService {
    private final Map<String, RentalData> rentals = new HashMap<>();
    private final List<NotifyInfService> notificationServices;

    public SpeedService(List<NotifyInfService> notificationServices) {
        this.notificationServices = notificationServices;
    }

    public void registerRental(RentalData rental) {
        rentals.put(rental.getCarId(), rental);
    }

    public void processSpeedData(SpeedData event) {

        RentalData rental = rentals.get(event.getCarId());
        if (event.getSpeed() > rental.getMaxSpeedLimit()) {
            String warning = " Car crossd speed limit" + rental.getCarId() +
                                    " exceeded " + rental.getMaxSpeedLimit();
            
            for (NotifyInfService service : notificationServices) {
                service.notifyRenter(rental.getRenterId(), warning);
                service.notifyRentalCompany(rental.getRentalId(), warning);
            }
        }
    }
}
