/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication44;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author ACER
 */
public class JavaApplication44 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input array number of element: ");
        int n = sc.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            System.out.print("List[" + i + "]= ");
            int input = sc.nextInt();
            list.add(input);
        }
        ArrayList<Integer> square = new ArrayList<>();
        System.out.print("The array squaring: ");
        for (Integer x : list) {
            square.add(x*x);
            System.out.print(x + " ");
        }
        System.out.println("\n");
        System.out.print("The number of element in the array is greater than 50: ");
        for (Integer arr : square) {
            if (arr > 50) {
                System.out.print(arr + " ");
            }
        }
    }
    
}
