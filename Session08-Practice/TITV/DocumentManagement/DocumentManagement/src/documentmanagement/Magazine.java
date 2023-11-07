/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package documentmanagement;

import java.util.Scanner;

public class Magazine extends Document {

    private int issuedNumber, monthPublish;

    public Magazine() {
    }
    
    public Magazine(int issuedNumber, int monthPublish, String documentCode, String publishName, int circulationNumber) {
        super(documentCode, publishName, circulationNumber);
        this.issuedNumber = issuedNumber;
        this.monthPublish = monthPublish;
    }

    public int getIssuedNumber() {
        return issuedNumber;
    }

    public void setIssuedNumber(int issuedNumber) {
        this.issuedNumber = issuedNumber;
    }

    public int getMonthPublish() {
        return monthPublish;
    }

    public void setMonthPublish(int monthPublish) {
        this.monthPublish = monthPublish;
    }

    @Override
    public void inputInfo(Scanner sc) {
        super.inputInfo(sc);
        System.out.print("Input issued number: ");
        issuedNumber = Integer.parseInt(sc.nextLine());
        System.out.print("Input moth publish: ");
        issuedNumber = Integer.parseInt(sc.nextLine());
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.print("Issued number: " + issuedNumber);
        System.out.print("Month publish: " + monthPublish);
    }
}
