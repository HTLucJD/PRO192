/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package data;

/**
 *
 * @author ACER
 */
public abstract class Transport {
    protected String vehicleType;
    protected Manufacturer manufacturer;

    public Transport(String vehicleType, Manufacturer manufacturer) {
        this.vehicleType = vehicleType;
        this.manufacturer = manufacturer;
    }

    public String getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }

    public Manufacturer getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(Manufacturer manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getManufacturerName() {
         return this.manufacturer.getManufacturerName();
    }
     
    public void start() {
        System.out.println("Let's goooo..");
    }
    
    public void speedUp() {
        System.out.println("Speed Up.............");
    }
    
    public void stop() {
        System.out.println("Stop!!!");
    }
    
    public abstract double getVelocity();
}
