
package main;

import data.Shelf;
import java.util.Scanner;

public class Stage {

    
    public static void main(String[] args) {
        Shelf tuBook = new Shelf("PINK", "SELFHELP");
        int choice;
        do {
            printMenu();
            System.out.print("Choose 1..3: ");
            Scanner sc = new Scanner(System.in);
            choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1:
                    tuBook.inputABook();
                    break;
                case 2:
                    tuBook.printBookList();
                    break;
                case 3:
                    System.out.println("Bye bye.See you next time!!"); 
            }
 
        } while (choice != 3);
    }
    
    public static void printMenu() {
        System.out.println("============================================");
        System.out.println("WELCOME TO THE PROGRAM TO CREATE A BOOK LIST");
        System.out.println("Choose the following functions to create: ");
        System.out.println("1. Input a book");
        System.out.println("2. Print a book list");
        System.out.println("3. Quit");
    }
    
   
}
