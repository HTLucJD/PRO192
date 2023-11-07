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
public class Statue extends Item {
    private int weight;
    private String colour;

    public Statue() {
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        if (this.weight < 0)
            this.weight = 0;
        else 
            this.weight = weight;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
            this.colour = colour;
    }
    
    public void outputStatue() {
        output();
        System.out.println("Weight: "+ this.weight);
        System.out.println("Colour: "+ this.colour);
    }
    
    public void inputStatue() {
        Scanner sc = new Scanner(System.in);
        input();
        System.out.print("Enter weight: ");
        this.weight = Integer.parseInt(sc.nextLine());
        System.out.print("Enter colour: ");
        this.colour = sc.nextLine();
    }
}
