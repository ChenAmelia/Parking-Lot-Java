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

        ParkingLot lot = new ParkingLot(10, 3, 5, 2);

        Vehicle motorbike = new Vehicle(VehicleType.MOTORBIKE);
        Vehicle car = new Vehicle(VehicleType.CAR);
        Vehicle van = new Vehicle(VehicleType.VAN);

        System.out.println("Welcome to the _nology parking lot! What is the type of your vehicle?");
        System.out.println("Please press 1 if your vehicle is a motorbike.");
        System.out.println("Please press 2 if your vehicle is a car.");
        System.out.println("Please press 3 if your vehicle is a van.");

        while(lot.totalSpot > 0) {

            int vehicleType = scanner.nextInt();
            if(vehicleType == 1) {
                System.out.println("The total spots are " + lot.totalSpot);
                System.out.println("The compact spot available for motorbikes are " + lot.compactSpotAvailable);
                lot.parkingVehicle(motorbike);
            }

        }




    }
}