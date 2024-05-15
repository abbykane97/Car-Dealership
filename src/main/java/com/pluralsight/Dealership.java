package com.pluralsight;

import java.util.ArrayList;
import java.util.List;

public class Dealership {
    private String name;
    private String address;
    private String phoneNumber;
    private ArrayList<Vehicle> vehicles;

   public Dealership(String name, String address, String phoneNumber) {
       this.name = name;
       this.address = address;
       this.phoneNumber = phoneNumber;
       this.vehicles = new ArrayList<>();

   }

    public String getName() {
        return null;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return null;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return null;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void addVehicle(Vehicle vehicle) {
       vehicles.add(vehicle);

    }
    public void removeVehicle(){

    }

    public List<Vehicle> getAllVehicle() {

        return null;
    }
}
