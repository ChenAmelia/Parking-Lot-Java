package org.example;



//### Overview
//
//        Design a parking lot using object-oriented principles... Your solution should be in Java.
//
//        ### Assumptions
//
//        - The parking lot can hold motorcycles, cars and vans
//        - The parking lot has motorcycle spots, car spots and large spots
//        - A motorcycle can park in any spot
//        - A car can park in a single compact spot, or a regular spot
//        - A van can park, but it will take up 3 regular spots
//        - These are just a few assumptions. Feel free to ask your interviewer about more assumptions as needed
//
//        ### Specifications
//
//        Here are a few methods that you should be able to run:
//
//        - Tell us how many spots are remaining
//        - Tell us how many total spots are in the parking lot
//        - Tell us when the parking lot is full
//        - Tell us when the parking lot is empty
//        - Tell us when certain spots are full e.g. when all motorcycle spots are taken
//        - Tell us how many spots vans are taking up

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        ParkingLot lot = new ParkingLot(30, 10, 10, 10, 30);

        Vehicle motorbike = new Vehicle(VehicleType.MOTORBIKE);
        Vehicle car = new Vehicle(VehicleType.CAR);
        Vehicle van = new Vehicle(VehicleType.VAN);

        System.out.println(lot.spotsRemaining);

        System.out.println("Welcome to the _nology parking lot! We have " + lot.totalSpot + " spots in total.");
        if(lot.spotsRemaining == lot.totalSpot) {
            System.out.println("The parking lot is empty now!");
        }
        System.out.println("Please press a number to choose the type of your vehicle.");
        System.out.println("Please press 1 if your vehicle is a motorbike.");
        System.out.println("Please press 2 if your vehicle is a car.");
        System.out.println("Please press 3 if your vehicle is a van.");


        while(lot.totalSpot > 0) {
            System.out.println("=========================================================");

            System.out.println("Please type a number to choose the type of your vehicle.");
            int vehicleType = scanner.nextInt();
            if(vehicleType == 1) {
                System.out.println("Spots remaining " + lot.spotsRemaining);
                System.out.println("Compact spots available: " + lot.compactSpotAvailable);
                System.out.println("Regular spots available: " + lot.regularSpotAvailable);
                System.out.println("Large spots available: " + lot.largeSpotAvailable);
                lot.parkingVehicle(motorbike);
            } else if(vehicleType == 2) {
                System.out.println("Spots remaining " + lot.spotsRemaining);
                System.out.println("Compact spots available: " + lot.compactSpotAvailable);
                System.out.println("Regular spots available: " + lot.regularSpotAvailable);
                System.out.println("Large spots available: " + lot.largeSpotAvailable);
                lot.parkingVehicle(car);
            }  else if(vehicleType == 3) {
                System.out.println("Spots remaining " + lot.spotsRemaining);
                System.out.println("Compact spots available: " + lot.compactSpotAvailable);
                System.out.println("Regular spots available: " + lot.regularSpotAvailable);
                System.out.println("Large spots available: " + lot.largeSpotAvailable);
                lot.parkingVehicle(van);
            }

        }
        if(lot.spotsRemaining == 0) {
            System.out.println("The parking lot is full now!");
        }




    }
}