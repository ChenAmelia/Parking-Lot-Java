package org.example;

//The ParkingSpot class is to hold all three parking spot types

public class ParkingSpot {

    private ParkingSpotType type;
    private Vehicle vehicle;
    private VehicleType vehicleType;


    //Constructor

    public ParkingSpot(ParkingSpotType type, Vehicle vehicle, VehicleType vehicleType) {
        this.type = type;
        this.vehicle = vehicle;
        this.vehicleType = vehicleType;

    }


    //Getters and Setters

    public ParkingSpotType getType() {
        return type;
    }

    public void setType(ParkingSpotType type) {
        this.type = type;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public VehicleType getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(VehicleType vehicleType) {
        this.vehicleType = vehicleType;
    }


}
