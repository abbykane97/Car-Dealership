package com.pluralsight;

import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class UserInterface {
    public final String FILE_NAME = "dealership.csv";
    private Dealership dealership;
    private Scanner scanner;

    public Dealership getDealership() {
        return dealership;
    }

    public void setDealership(Dealership dealership) {
        this.dealership = dealership;
    }

    private void init() throws IOException {
        DealershipFileManager fileManager = new DealershipFileManager();
        this.dealership = fileManager.getDealership();

}
private void displayVehicles(List<Vehicle> vehicles) {
        for (Vehicle vehicle : vehicles) {
            System.out.println(vehicle);
        }
}

    public void display() throws IOException {
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

            String input = scanner.nextLine().trim().toUpperCase();

            switch (input) {
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

    public void processGetByVehicleTye(Scanner scanner) {
        System.out.println("Enter the Vehicle type");
        String type = scanner.nextLine();
        System.out.println("These are the available vehicles with that type: ");
        displayVehicles(dealership.getVehiclesByType(type));

    }


    public void processGetByPriceRequest(Scanner scanner) {
        System.out.println("Enter minimum price");
        int min = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter maximum price");
        int max = Integer.parseInt(scanner.nextLine());
        System.out.println("Here are the vehicles within your price range:");
        displayVehicles(dealership.getVehiclesByPrice(min, max));
        

    }

    public void processGetByMakeModelRequest(Scanner scanner) {
        System.out.println("Enter the Vehicles make");
        String make = scanner.nextLine();
        System.out.println("Enter the Vehicles model");
        String model = scanner.nextLine();
        System.out.println("Here are the vehicles with makes and models selected:");
        displayVehicles(dealership.getVehiclesByMakeModel(make, model));

    }

    public void processGetByYearRequest(Scanner scanner) {
        System.out.println("Enter the minimum year: ");
        int min = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter the maximum year: ");
        int max = Integer.parseInt(scanner.nextLine());
        System.out.println("These are the vehicles within your range: ");
        displayVehicles(dealership.getVehiclesByYear(min, max));

    }

    public void processGetByColorRequest(Scanner scanner) {
        System.out.println("Select color:");
        String color = scanner.nextLine();
        System.out.println("Here are the vehicles with the color you selected:");
        displayVehicles(dealership.getVehiclesByColor(color));

    }

    public void processGetByMileageRequest() {
        System.out.println("Enter minimum mileage:");
        int min = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter maximum mileage: ");
        int max = Integer.parseInt(scanner.nextLine());
        System.out.println("These are the vehicles within that milage range: ");


    }
    public void processGetAllVehicleRequest(Dealership dealership) {
        List<Vehicle> allVehicles = dealership.getAllVehicle();
        System.out.println("All our Vehicles are listed below:");
        displayVehicles(allVehicles);
        
    }
    public void processAddVehicleRequest() {


    }
    public void processRemoveVehicleRequest() {

    }

}

