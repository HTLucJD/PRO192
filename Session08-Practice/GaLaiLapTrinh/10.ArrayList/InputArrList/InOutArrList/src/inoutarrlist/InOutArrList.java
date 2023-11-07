/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package inoutarrlist;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author ACER
 */
public class InOutArrList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> index = new ArrayList<>();
        Random rd = new Random();
        System.out.println("Input the array number: ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int rand = rd.nextInt(100) + 1;
            list.add(rand);
        }
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (list.get(i) > 80) {
                count++;
                index.add(i);
            }
        }
        System.out.println("There are " + count + "numbers greater than 80");
        System.out.print("Position the numbers in order: ");
        for (Integer i : index) {
            System.out.println(i + " ");
        }
    }

}
