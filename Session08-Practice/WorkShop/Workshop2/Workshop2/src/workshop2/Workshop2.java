/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package workshop2;

import java.util.Scanner;

/**
 *
 * @author Tan Luc
 */
public class Workshop2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        boolean ok = false;
        do {            
            try {
                Scanner sc = new Scanner(System.in);
                System.out.print("Enter the string: ");
                String s = sc.nextLine();
                if (!s.matches("^SE\\d\\d\\d"))
                    throw new Exception();
                System.out.println("The string is " + s);
                ok = false;
            } catch (Exception e) {
                System.out.println("The string is invalid");
                ok = true;
            }
        } while (ok);
    }
    
}
