package com.ecotransport.model;

public class Vehicle {
    private int vehicleId;
    private String model;
    private String type;
    private int ownerId;  // Links to User

    // Getters and Setters
    public int getVehicleId() { return vehicleId; }
    public void setVehicleId(int vehicleId) { this.vehicleId = vehicleId; }

    public String getModel() { return model; }
    public void setModel(String model) { this.model = model; }

    public String getType() { return type; }
    public void setType(String type) { this.type = type; }

    public int getOwnerId() { return ownerId; }
    public void setOwnerId(int ownerId) { this.ownerId = ownerId; }
}

