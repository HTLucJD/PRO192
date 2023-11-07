/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package transportation;

import data.Airplane;
import data.Bicycle;
import data.Car;
import data.Manufacturer;
import data.Transport;

/**
 *
 * @author ACER
 */
public class Transportation {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Manufacturer m1 = new Manufacturer("Manufacturer1", "Viet Nam");
        Manufacturer m2 = new Manufacturer("Manufacturer2", "Japan");
        Manufacturer m3 = new Manufacturer("Manufacturer3", "Russia");

        Transport t1 = new Bicycle(m1);
        Transport t2 = new Car("Gasoline", m2);
        Airplane t3 = new Airplane("Gasoline", m3);

        System.out.println("Get the manufacturer: ");
        System.out.println("M1: " + t1.getManufacturerName());
        System.out.println("M2: " + t2.getManufacturerName());
        System.out.println("M3: " + t3.getManufacturerName());

        System.out.println("Start: ");
        t1.start();
        System.out.println("Speed up: ");
        t2.speedUp();
        System.out.println("Stop: ");
        t3.stop();
        
        System.out.println("Velocity of T1: " + t1.getVelocity());
        System.out.println("Velocity of T2: " + t2.getVelocity());
        System.out.println("Velocity of T3: " + t3.getVelocity());
        
        System.out.println("Take off: ");
        t3.takeOff();
        System.out.println("Landing: ");
        t3.landing();

    }
}
