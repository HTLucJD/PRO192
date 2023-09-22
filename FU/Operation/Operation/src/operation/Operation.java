/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package operation;

import java.util.Scanner;


/**
 *
 * @author ACER
 */
public class Operation {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b;
        System.out.println("Input  a, b: ");
        a = sc.nextInt();
        b = sc.nextInt();
        System.out.println("Input choice: ");
        char choice = sc.next().charAt(0);
        switch (choice) {
            case '+':
                System.out.println("a + b = " + (a + b));
                break;
            case '-':
                System.out.println("a - b = " + (a - b));
                break;
            case '*':
                System.out.println("a * b = " + a * b);
                break;
            case '/':
                System.out.println("a / b = " + a / b);
                break;
            default:
                throw new AssertionError();
        }
  
    }

}
