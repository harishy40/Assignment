package com.assignment.harish;

public class FirebaseNotifyInfService implements NotifyInfService {
    @Override
    public void notifyRenter(String renterId, String message) {
        System.out.println(" Firebase Alert to customer [" + renterId + "]: " + message);
        // call firebase  API to send the notification.

    }

    @Override
    public void notifyRentalCompany(String rentalId, String message) {
        System.out.println(" Firebase Alert to Rental Company [" + rentalId + "]: " + message);
        // call firebase  API to send the notification.
    }
}
