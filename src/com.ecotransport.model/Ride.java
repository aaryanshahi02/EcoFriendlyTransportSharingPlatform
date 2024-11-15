package com.ecotransport.model;

public class Ride {
    private int rideId;
    private String startLocation;
    private String destination;
    private String date;
    private int vehicleId;

    // Getters and Setters
    public int getRideId() { return rideId; }
    public void setRideId(int rideId) { this.rideId = rideId; }

    public String getStartLocation() { return startLocation; }
    public void setStartLocation(String startLocation) { this.startLocation = startLocation; }

    public String getDestination() { return destination; }
    public void setDestination(String destination) { this.destination = destination; }

    public String getDate() { return date; }
    public void setDate(String date) { this.date = date; }

    public int getVehicleId() { return vehicleId; }
    public void setVehicleId(int vehicleId) { this.vehicleId = vehicleId; }
}

