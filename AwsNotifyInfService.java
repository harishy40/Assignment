package com.assignment.harish;

public class AwsNotifyInfService implements NotifyInfService {
    @Override
    public void notifyRenter(String renterId, String message) {
        System.out.println("AWS  Alert to customer [" + renterId + "]: " + message);
        // call AWS SNS API to send the notification.
    }

    @Override
    public void notifyRentalCompany(String rentalId, String message) {
        System.out.println("AWS  Alert to Rental Company [" + rentalId + "]: " + message);
        //        // call AWS SNS API to send the notification.
    }
}
