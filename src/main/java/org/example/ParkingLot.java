package org.example;

//Creating the parking lot
//Define the total number of parking spot
//Define the number of different types of parking spot using Arraylist/Hashmap?
//=============================================================================
//Write a function for parking vehicles
//Motorbike - When there's no available compact spot, check regular spots and if the regular spots are full, check large spots
//Car - When the regular spots are full, check compact spots
//Van - When large spots are full, check regular spots and decrement 3 for regular

//Write a function to remove vehicles
//same logic with the parking vehicles method, just reverse, from increment to decrement

import java.util.ArrayList;

public class ParkingLot {

    int totalSpot;
    int compactSpotAvailable;
    int regularSpotAvailable;
    int largeSpotAvailable;

    int spotsRemaining = totalSpot;


    public ParkingLot(int totalSpot, int compactSpotAvailable, int regularSpotAvailable, int largeSpotAvailable, int spotsRemaining) {
        this.totalSpot = totalSpot;
        this.compactSpotAvailable = compactSpotAvailable;
        this.regularSpotAvailable = regularSpotAvailable;
        this.largeSpotAvailable = largeSpotAvailable;
        this.spotsRemaining = spotsRemaining;
    }


    public void parkingVehicle(Vehicle vehicle) {

        //=================Parking motorbike in parking lot=================================
        if(vehicle.getVehicleType().equals(VehicleType.MOTORBIKE)) {
            if(compactSpotAvailable > 0) {
                //parking motorbike in compact spot
                System.out.println("You can park you motorbike in compact spot!");
                compactSpotAvailable --;
                spotsRemaining --;
            }else if(compactSpotAvailable == 0 && regularSpotAvailable > 0) {
                //parking motorbike in regular spot
                System.out.println("Sorry the compact spots are full, you can park your motorbike in regular spot.");
                regularSpotAvailable --;
                spotsRemaining --;
            } else if (compactSpotAvailable == 0 && regularSpotAvailable == 0 && largeSpotAvailable > 0) {
                //parking motorbike in large spot
                System.out.println("Sorry the compact spots and regulars spot are full, you can park your motorbike in regular spot.");
                largeSpotAvailable --;
                spotsRemaining--;
            } else if(spotsRemaining == 0) {
                System.out.println("Sorry, no spot available now.");
            }

        //=================Parking car in parking lot=================================
        } else if (vehicle.getVehicleType().equals(VehicleType.CAR)) {
            if(regularSpotAvailable > 0) {
                //parking car in regular spot
                System.out.println("You can park your car in regular spot!");
                regularSpotAvailable --;
                spotsRemaining--;
            } else if(regularSpotAvailable == 0 && compactSpotAvailable > 0) {
                //parking car in compact spot
                System.out.println("Sorry the regular spots are full, you can park your car in compact spots.");
                compactSpotAvailable --;
                spotsRemaining--;
            } else if (regularSpotAvailable == 0 && compactSpotAvailable == 0) {
                System.out.println("Sorry, no spot available now.");

            }

        //=================Parking van in parking lot=================================
        } else if (vehicle.getVehicleType().equals(VehicleType.VAN)) {
            if(largeSpotAvailable > 0) {
                //Van park in large spot
                System.out.println("You can park your van in large spot");
                largeSpotAvailable --;
                spotsRemaining--;
            } else if (largeSpotAvailable == 0 && regularSpotAvailable > 3) {
                //Van park in regular spot and takes three spots
                System.out.println("Sorry the large spots are full, you can park your van in regular spots.");
                regularSpotAvailable -= 3;
                spotsRemaining -= 3;
            } else if(largeSpotAvailable == 0 && regularSpotAvailable < 3){
                System.out.println("Sorry, no spot available now.");
            }
        } else if(spotsRemaining == 0) {
            System.out.println("The parking lot is full!");
        } else if(spotsRemaining == totalSpot) {
            System.out.println("the parking lot is empty!");
        }


    }




}
