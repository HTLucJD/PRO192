/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package data;

/**
 *
 * @author ACER
 */
public class Airplane extends Transport {
    private String fuelType;

    public Airplane(String fuelType, Manufacturer manufacturer) {
        super("Airplane", manufacturer);
        this.fuelType = fuelType;
    }

    

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    @Override
    public double getVelocity() {
        return 500;
    }

    public void takeOff() {
        System.out.println("Take off////");
    }
    
    public void landing() {
        System.out.println("Landing\\\\");
    }
}
