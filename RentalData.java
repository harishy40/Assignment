package com.assignment.harish;

public class RentalData {
    private String rentalId;
    private String carId;
    private String renterId;
    private int maxSpeedLimit; 

    public RentalData(String rentalId, String carId, String renterId, int maxSpeedLimit) {
        this.rentalId = rentalId;
        this.carId = carId;
        this.renterId = renterId;
        this.maxSpeedLimit = maxSpeedLimit;
    }

    public String getRentalId() { return rentalId; }
    public String getCarId() { return carId; }
    public String getRenterId() { return renterId; }
    public int getMaxSpeedLimit() { return maxSpeedLimit; }
}
