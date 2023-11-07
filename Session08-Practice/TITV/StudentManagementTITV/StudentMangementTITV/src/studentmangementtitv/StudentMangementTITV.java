/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package studentmangementtitv;

import data.Management;

/**
 *
 * @author ACER
 */
public class StudentMangementTITV {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Management se = new Management();
        se.addAStudent();
        se.printStudentList();
    }
    
    public static void printMenu() {
        System.out.println("============================================");
        System.out.println("Welcome to FAP - FPT Academic Portal");
        System.out.println("Choose the following functions to play with: ");
        System.out.println("1. Add a student profile");
        System.out.println("2. Print the student list");
        System.out.println("3. Search a student by id");
        System.out.println("4. Update a student profile");
        System.out.println("5. Remove a student profile");
        System.out.println("6. Quit");
    }
    
}
