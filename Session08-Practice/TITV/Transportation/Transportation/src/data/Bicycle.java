/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package data;

/**
 *
 * @author ACER
 */
public class Bicycle extends Transport {
    
    public Bicycle(Manufacturer manufacturer) {
        super("Bicycle", manufacturer);
    }

    @Override
    public double getVelocity() {
        return 20;
    }
    
}
