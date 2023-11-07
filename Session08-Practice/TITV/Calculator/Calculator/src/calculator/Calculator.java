/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculator;

import data.CalculatorCasioFX500;
import data.CalculatorVinaCal500;
import data.InsertionSort;
import data.SelectionSort;
import java.util.Scanner;

/**
 *
 * @author ACER
 */
public class Calculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CalculatorCasioFX500 fx500 = new CalculatorCasioFX500();
        CalculatorVinaCal500 vn500 = new CalculatorVinaCal500();

        System.out.println("Input a and b: ");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        System.out.println("a + b = " + fx500.add(a, b));
        System.out.println("a - b = " + fx500.sub(a, b));
        System.out.println("a x b = " + fx500.multi(a, b));
        System.out.println("a / b = " + fx500.division(a, b));

        double[] arr = new double[]{5, 1, 3, 4, 7, 8, 0};
        double[] arr2 = new double[]{6, 3, 5, 7, 8, 4, 1};

        InsertionSort insertionSort = new InsertionSort();
        SelectionSort selectionSort = new SelectionSort();

        System.out.println("Insertion Sort:");
        insertionSort.SortingAscending(arr);
        for (Object i : arr) {
            System.out.print(i + " ");
        }
        System.out.println("\n");
        insertionSort.SortingDescending(arr);
        for (Object i : arr) {
            System.out.print(i + " ");
        }
        
        System.out.println("\n");
        System.out.println("Selection Sort: ");
        selectionSort.SortingAscending(arr2);
        for (Object i : arr2) {
            System.out.print(i + " ");
        }
        System.out.println("\n");
        selectionSort.SortingDescending(arr2);
        for (Object i : arr2) {
            System.out.print(i + " ");
        }
    }

}
