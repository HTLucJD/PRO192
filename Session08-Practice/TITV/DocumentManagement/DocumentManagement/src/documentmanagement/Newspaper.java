/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package documentmanagement;

import java.util.Scanner;

/**
 *
 * @author Tan Luc
 */
public class Newspaper extends Document{
    private int dayPublish;

    public Newspaper() {
    }
    
    public Newspaper(int dayPublish, String documentCode, String publishName, int circulationNumber) {
        super(documentCode, publishName, circulationNumber);
        this.dayPublish = dayPublish;
    }

    public int getDayPublish() {
        return dayPublish;
    }

    public void setDayPublish(int dayPublish) {
        this.dayPublish = dayPublish;
    }
    @Override
    public void inputInfo(Scanner sc) {
        super.inputInfo(sc);
        System.out.print("Input day of publish: ");
        dayPublish = Integer.parseInt(sc.nextLine());
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.print("Day of publish: " + dayPublish);
    }
}
