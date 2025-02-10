package com.assignment.harish;

public interface NotifyInfService {
    void notifyRenter(String renterId, String message);
    void notifyRentalCompany(String rentalId, String message);
}
