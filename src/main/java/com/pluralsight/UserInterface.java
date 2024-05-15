package com.pluralsight;

import java.util.Scanner;

import static sun.awt.CGraphicsEnvironment.init;

public class UserInterface {

    private Dealership dealership;

    public final String FILE_NAME = "dealership.csv";

    public Dealership getDealership() {
        return dealership;
    }

    public void setDealership(Dealership dealership) {
        this.dealership = dealership;
    }

    public void display() {
        init();
        Scanner scanner = new Scanner((System.in));
        boolean running = true;
        while (running) {
            System.out.println("Welcome to the Dealership");
            System.out.println("Choose a filter option:");
            System.out.println("1) Filter by Price ");
            System.out.println("2) Filter by Make and Model ");
            System.out.println("3) Filter by Year ");
            System.out.println("4) Filter by Color ");
            System.out.println("5) Filter by Mileage ");
            System.out.println("6) Filter by Type ");
            System.out.println("7) Get all Vehicles");
            System.out.println("8) Add Vehicle ");
            System.out.println("9) Remove Vehicle ");
            System.out.println("10) Exit ");

            String input = scanner.nextLine().trim();

            switch (input.toUpperCase()) {
                case "1":
                    processGetByPriceRequest();
                    break;
                case "2":
                    processGetByMakeModelRequest();
                    break;
                case "3":
                    processGetByYearRequest();
                    break;
                case "4":
                    processGetByColorRequest();
                    break;
                case "5":
                    processGetByMileageRequest();
                    break;
                case "6":
                    processGetByVehicleTye();
                    break;
                case "7":
                    processGetAllVehicleRequest();
                    break;
                case "8":
                    processAddVehicleRequest();
                    break;
                case "9":
                    processRemoveVehicleRequest();
                    break;
                case "10":
                    System.out.println("Exiting");
                    running = false;
                    break;
                default:
                    System.out.println("Invalid option");
                    break;

            }

        }
        scanner.close();


    }

    private void processGetByVehicleTye() {
    }

    public void processGetByPriceRequest() {

    }

    public void processGetByMakeModelRequest() {

    }

    public void processGetByYearRequest() {

    }

    public void processGetByColorRequest() {

    }
    public void processGetByMileageRequest() {

    }
    public void processGeByVehicleRequest() {

    }
    public void processGetAllVehicleRequest() {

    }
    public void processAddVehicleRequest() {

    }
    public void processRemoveVehicleRequest() {

    }

}

