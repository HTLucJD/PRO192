/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package main;
import data.Shelf;
import data.Student;
import java.util.Scanner;

public class Stage {

    
    public static void main(String[] args) {
        //inputStudentList();
        Shelf tuSE = new Shelf("PINK", "SE");
        int choice;
        do {
            printMenu();
            System.out.print("Input your choose 1..6: ");
            Scanner sc = new Scanner(System.in);
            choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1:
                    tuSE.addAStudent();
                    break;
                case 2:
                    tuSE.printStudentList();
                    break;
                case 3:
                    tuSE.searchAStudent();
                    break;
                case 6:
                    System.out.println("Bye bye.See you next time!!");
                    break;
                default:
                    System.out.println("Please choose 1..6 options");
                    break;
            }
 
        } while (choice != 6);
    }
    
    public static void printMenu() {
        System.out.println("============================================");
        System.out.println("Welcome to FAP - FPT Academic Portal");
        System.out.println("Choose the following functions to play with: ");
        System.out.println("1. Add a student profile");
        System.out.println("2. Print the student list");
        System.out.println("3. Search a student by id");
        System.out.println("4. Update a student profile");
        System.out.println("5. Remove a student profile");
        System.out.println("6. Quit");
    }
    
    public static void inputStudentList() {
        Scanner sc = new Scanner(System.in);
        String id, name;
        int yob, count;
        double gpa;
        
        System.out.println("How many students do you want to input? ");
        count = Integer.parseInt(sc.nextLine());
        
        Student arr[] = new Student[count];
        
        for (int i = 0; i < count; i++) {
            System.out.println("Input student #" + (i+1) + "/" + count);
            System.out.print("Input id: ");
            id =sc.nextLine();
            System.out.print("Input name: ");
            name = sc.nextLine();
            System.out.print("Input yob: ");
            yob = Integer.parseInt(sc.nextLine());
            System.out.print("Input gpa: ");
            gpa = Double.parseDouble(sc.nextLine());
        
            arr[i] = new Student(id, name, yob, gpa);
        }
        System.out.println("The student list:");
        for (Student x : arr) {
            x.showProfile();
        }
    }
    
}
