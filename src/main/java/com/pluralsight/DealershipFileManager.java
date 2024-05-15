package com.pluralsight;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalTime;

public class DealershipFileManager {

    public DealershipFileManager() throws IOException {
    }

    public Dealership getDealership() throws IOException {
        Dealership dealership = null;
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader("inventory.csv"));

            String line;

            line = bufferedReader.readLine();
            String[] parts = line.split("\\|");
            if (parts.length == 3) {
                String name = parts[0];
                String address = parts[1];
                String phone = parts[2];
                dealership = new Dealership(name, address, phone);
            }

            while ((line = bufferedReader.readLine()) != null) {
                parts = line.split("\\|");
                if (parts.length == 8) {
                    int vinNumber = Integer.parseInt(parts[0]);
                    int year = Integer.parseInt(parts[1]);
                    String make = parts[2].trim();
                    String model = parts[3].trim();
                    String vehicleType = parts[4].trim();
                    String color = parts[5].trim();
                    int odometer = Integer.parseInt(parts[6]);
                    double price = Double.parseDouble(parts[7]);
                    dealership.addVehicle(new Vehicle(vinNumber, year, make, model, vehicleType, color, odometer, price));
                } else {
                    System.out.println("Invalid transaction format: " + line);
                }
            }

            bufferedReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found. Creating a new file");
            throw new RuntimeException(e);
        }
        return dealership;

    }
}
