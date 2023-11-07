/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package spitstring;

import java.util.Scanner;

/**
 *
 * @author ACER
 */
public class SpitString {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input string: ");
        String s = sc.nextLine();
        StringBuilder string = new StringBuilder();
        StringBuilder number = new StringBuilder();
        StringBuilder others = new StringBuilder();
        for (int i= 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (Character.isDigit(c))
                number.append(c);
            else if (Character.isLetter(c))
                string.append(c);
            else
                others.append(c);
        }
        System.out.println("String: "+string);
        System.out.println("Number: "+number);
        System.out.println("Other: "+others);
    }
    
}
