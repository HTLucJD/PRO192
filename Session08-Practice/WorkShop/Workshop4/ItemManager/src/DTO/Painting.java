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
public class Painting extends Item {
    private int height, width;
    boolean isWatercolour, isFramed;

    public Painting() {
    }

    public Painting(int height, int width, boolean isWatercolour, boolean isFramed) {
        this.height = height;
        this.width = width;
        this.isWatercolour = isWatercolour;
        this.isFramed = isFramed;
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

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        if (this.width < 0)
            this.width = 0;
        else 
            this.width = width;
    }

    public boolean isIsWatercolour() {
        return isWatercolour;
    }

    public void setIsWatercolour(boolean isWatercolour) {
        this.isWatercolour = isWatercolour;
    }

    public boolean isIsFramed() {
        return isFramed;
    }

    public void setIsFramed(boolean isFramed) {
        this.isFramed = isFramed;
    }
    
    public void OuputPainting() {
        output();
        System.out.println("Height: "+ this.height);
        System.out.println("Width: "+ this.width);
        System.out.println("Is Watercolour: "+ this.isWatercolour);
        System.out.println("IS Framed: "+ this.isFramed);
    }
    
    public void inputPainting() {
        Scanner sc = new Scanner(System.in);
        input();
        System.out.print("Enter height: ");
        this.height = sc.nextInt();
        System.out.print("Enter width: ");
        this.width = sc.nextInt();
        System.out.print("Enter isWatercolour: ");
        this.isWatercolour = sc.nextBoolean();
        System.out.print("Enter isFramed: ");
        this.isFramed = sc.nextBoolean();
    }
    
}
