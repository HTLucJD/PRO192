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
public class Document {
    private String documentCode, publishName;
    private int circulationNumber;

    public Document() {
        
    }
    
    public Document(String documentCode, String publishName, int circulationNumber) {
        this.documentCode = documentCode;
        this.publishName = publishName;
        this.circulationNumber = circulationNumber;
    }

    public String getDocumentCode() {
        return documentCode;
    }

    public void setDocumentCode(String documentCode) {
        this.documentCode = documentCode;
    }

    public String getPublishName() {
        return publishName;
    }

    public void setPublishName(String publishName) {
        this.publishName = publishName;
    }

    public int getCirculationNumber() {
        return circulationNumber;
    }

    public void setCirculationNumber(int circulationNumber) {
        this.circulationNumber = circulationNumber;
    }
    
    public void inputInfo(Scanner sc) {
        System.out.print("Input document code: ");
        documentCode = sc.nextLine();
        System.out.print("Input publish name: ");
        publishName = sc.nextLine();
        System.out.print("Input circulation number: ");
        circulationNumber = Integer.parseInt(sc.nextLine());
    }
    public void displayInfo() {
        System.out.println("Document code: "+ documentCode);
        System.out.println("Publish name: "+ publishName);
        System.out.println("Circulation number: "+ circulationNumber);
    }
}
