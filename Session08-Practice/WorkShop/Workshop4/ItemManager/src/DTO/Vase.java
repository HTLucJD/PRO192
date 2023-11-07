/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTO;

import java.util.Scanner;

/**
 *
 * @author Tan Luc
 */
public class Vase extends Item {
    private int height;
    private String material;

    public Vase() {
    }

    public Vase(int height, String material) {
        this.height = height;
        this.material = material;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        if (this.height < 0)
            this.height = 0;
        else 
            this.height = height;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
            this.material = material;
    }
    
    public void outputVase() {
        output();
        System.out.println("Height: "+ this.height);
        System.out.println("Material: "+ this.material);
    }
    
    public void inputVase() {
        Scanner sc = new Scanner(System.in);
        input();
        System.out.print("Enter height: ");
        this.height = Integer.parseInt(sc.nextLine());
        System.out.print("Enter material: ");
        this.material = sc.nextLine();
    }
}
