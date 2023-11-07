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
public class Item {
    protected int value;
    protected String creator;

    public Item() {
    }

    public Item(int value, String creator) {
        this.value = value;
        this.creator = creator;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        if (this.value < 0)
            this.value = 0;
        else 
            this.value = value;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
            this.creator = creator;
    }
    
    public void output() {
        System.out.println("Value: "+ this.value);
        System.out.println("Creator: "+ this.creator);
    }
    
    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value: ");
        this.value = Integer.parseInt(sc.nextLine());
        System.out.print("Enter creator: ");
        this.creator = sc.nextLine();
    }
}
