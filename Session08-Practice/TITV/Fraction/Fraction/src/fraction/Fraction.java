/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package fraction;

import java.util.Scanner;

/**
 *
 * @author Tan Luc
 */
public class Fraction {

    private int numberator;
    private int denominator;

    public Fraction() {
        numberator = 0;
        denominator = 1;
    }
    
    public Fraction(int numberator, int denominator) {
        this.numberator = numberator;
        this.denominator = denominator;
    }

    

    public int getNumberator() {
        return numberator;
    }

    public void setNumberator(int numberator) {
        this.numberator = numberator;
    }

    public int getDenominator() {
        return denominator;
    }

    public void setDenominator(int denominator) {
        this.denominator = denominator;
    }

    public void InputFraction(Scanner sc) {
        int a, b;
        System.out.println("Input numberrator: ");
        a = sc.nextInt();
        do {
            System.out.println("Input denominator: ");
            b = sc.nextInt();
            if (b == 0) {
                System.err.println("Please you input b != 0!!!");
            } else {
                numberator = a;
                denominator = b;
            }
        } while (b == 0);
    }

    public void displayFraction() {
        if (numberator * denominator < 0) {
            System.out.printf("\t-"+Math.abs(numberator) + "/" + Math.abs(denominator));
        } else {
            System.out.println("\t"+Math.abs(numberator) + "/" + Math.abs(denominator));
        }
    }
    
    public Fraction addFraction(Fraction f2) {
        int a = numberator*f2.denominator+f2.numberator*denominator;
        int b = denominator*f2.denominator;
        return new Fraction(a, b);
    }
    
    public Fraction subFraction(Fraction f2) {
        int a = numberator*f2.denominator-f2.numberator*denominator;
        int b = denominator*f2.denominator;
        return new Fraction(a, b);
    }
    
    public Fraction multiFraction(Fraction f2) {
        int a = numberator*f2.numberator;
        int b = denominator*f2.denominator;
        return new Fraction(a, b);
    }
    
    public int GCD(int a, int b) {
    if (b == 0)
        return a;
    return GCD(b, a % b);
    }
    
    public boolean checkSimplified() {
    if (GCD(numberator, denominator) == 1)
        return true;
    return false;
    }
    
    public void SimplifiedFraction() {
    int x = GCD(numberator, denominator);
    numberator /= x;
    denominator /= x;
    }
    
}
