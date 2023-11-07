/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package appmanagement;


import java.util.Scanner;


public class AppManagement {
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        StudentManagement studentManagement = new StudentManagement();
        LecturerMangament lecturerMangament = new LecturerMangament();
        Scanner sc = new Scanner(System.in);
        int choice;
        do {
            System.out.println("============================================");
            System.out.println("Welcome to FAP - FPT Academic Portal");
            System.out.println("Choose the following functions to play with: ");
            System.out.println("1. Student management ");
            System.out.println("2. Lecturer management");
            System.out.println("3. Quit");
            System.out.print("Please choose your option: ");
            choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1:
                    studentManagement.printSubMenu();
                    break;
                case 2:
                    lecturerMangament.printSubMenu();
                    break;
                case 3:
                    System.out.println("Bye bye. See you next time!!!");
                    break;
                default:
                    System.out.println("Please input again!");
            }
        } while (choice != 3);
        sc.close();
    }
}
