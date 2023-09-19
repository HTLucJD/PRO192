/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package luc.main;

import luc.util.MyToys;


public class Stage {
    public static void main(String[] args) {
        System.out.println("PI: " + MyToys.PI);
        //MyToys.PI = 4.0;
        System.out.println("PI again: " + MyToys.PI);
    
//        int n = MyToys.getAnInteger();
//        System.out.print("n: " + n);
        int choice;        

        choice = MyToys.getAnInteger("Input of your choice (1..7): ");
        System.out.print("Your choice is: " + choice);
    }
}
