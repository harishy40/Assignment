package com.assignment.harish;

public class SpeedData {
    private String carId;
    private int speed; 
    private long timestamp;

    public SpeedData(String carId, int speed, long timestamp) {
        this.carId = carId;
        this.speed = speed;
        this.timestamp = timestamp;
    }

    public String getCarId() { return carId; }
    public int getSpeed() { return speed; }
    public long getTimestamp() { return timestamp; }
}
