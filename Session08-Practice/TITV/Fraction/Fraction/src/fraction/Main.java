/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fraction;

import java.util.Scanner;

/**
 *
 * @author Tan Luc
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Fraction fraction1 = new Fraction();
        Fraction fraction2 = new Fraction();
        Fraction sumFraction = new Fraction();
        
        fraction1.InputFraction(sc);
        fraction2.InputFraction(sc);
        System.out.println("Fraction 1: ");
        fraction1.displayFraction();
        System.out.println("Fraction 2: ");
        fraction2.displayFraction();
        
        sumFraction = fraction1.addFraction(fraction2);
        System.out.println("Sum f1 + f2 = ");
        sumFraction.displayFraction();
        
    }
}
