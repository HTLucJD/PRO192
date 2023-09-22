/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package stringname;

import java.util.Scanner;

/**
 *
 * @author ACER
 */
public class StringName {

    /**^
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input your name: ");
        String name = sc.nextLine();
        System.out.println("Your name is: " +name);
        int attend, midterm, finals;
        System.out.println("Input your attendance: ");
        attend = sc.nextInt();
        System.out.println("InpScanner sc = new Scanner(System.in);ut your midterm score: ");
        midterm = sc.nextInt();
        System.out.println("Input your final score: ");
        finals = sc.nextInt();
        double cs = (attend*0.2+midterm*0.3+finals*0.5);
        System.out.println("Your course score is: " + cs);
    }
    
}
