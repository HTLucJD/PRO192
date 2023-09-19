/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package studentprofile;

import java.util.Scanner;

public class StudentProfile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        inputProfile();
    }

    //nhập thông tin cơ bản của sv và in ra
   
     public static void inputProfile() {
        String name, address;
        int yob;
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Input name: ");
        name = sc.nextLine().toUpperCase();
         
        System.out.print("Input yob: ");
        yob = Integer.parseInt(sc.nextLine());
       
        System.out.print("Input address: ");
        address = sc.nextLine().toUpperCase();
           
        System.out.println("Here isH your profile");
        System.out.println("Name: " + name);
        System.out.println("Yob: " + yob);
        System.out.println("Address: " + address);
    }
}
