/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication38;

import java.util.Scanner;

/**
 *
 * @author ACER
 */
public class JavaApplication38 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = "abcdefghijklmnopqrstuvwxyz";
        String b = "zxcvbnmasdfghjklqwertyuiop";
        String output = "";
        System.out.println("Please enter the message that you needs to be encrypted: ");
        String s = sc.nextLine();        
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            int index = a.indexOf(c);
            if (index == -1) {
                output += c;
            } else {
                output += b.charAt(index);
            }
        }
        System.out.println("After the message encypted: " + output);
    }
    
}
