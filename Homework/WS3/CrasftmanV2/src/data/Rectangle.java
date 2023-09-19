/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package data;

/**
 *
 * @author ACER
 */
public class Rectangle {
    protected String owner;
    protected String color;
    protected double width;
    private double length;
    //private double area;

    public Rectangle(String owner, String color, double width, double length) {
        this.owner = owner;
        this.color = color;
        this.width = width;
        this.length = length;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public String toString() {
        return "Retangle{" + "owner=" + owner + ", color=" + color + ", width=" + width + ", length=" + length + '}';
    }
    
    //ai có nhiều info, gã đó tính, hàm thuộc về...
    public double getArea() {
        return width * length;
    }
    
    public void paint() {
        System.out.printf("|RETANGLE  |%-15s|%-10s|%4.1f|%4.1f|%7.2f|\n",
                            owner, color, width, length, getArea());
    
    }
    
}
