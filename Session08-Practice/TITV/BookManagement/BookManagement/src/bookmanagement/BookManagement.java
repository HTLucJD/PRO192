/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bookmanagement;

import data.Author;
import data.Book;
import data.Date;
import java.util.Scanner;

/**
 *
 * @author ACER
 */
public class BookManagement {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Date date1 = new Date(1, 2, 2004);
        Date date2 = new Date(24, 7, 1999);
        Date date3 = new Date(5, 23, 1987);
        Author author1 = new Author("Huynh Tan Luc", date1);
        Author author2 = new Author("To Tiet Trieu", date2);
        Author author3 = new Author("Vuong Anh Ha", date3);
        Book book1 = new Book("Clean code", 340000, 2002, author1);
        Book book2 = new Book("Dang nhan tam", 250000, 2000, author2);
        Book book3 = new Book("Harry Potter", 140000, 1997, author3);
        book1.printBook();
        book2.printBook();
        book3.printBook();
        
        if (book1.checkPublish(book2))
            System.out.println("Check for dupplicate publish year: True");
        else 
            System.out.println("Check for dupplicate publish year: False");
        
        System.out.print("Input discount: ");
        double x = sc.nextDouble();
        System.out.println("Price book 1 after "+x+"% discount: "+book1.discount(x));
        System.out.println("Price book 2 after "+x+"% discount: "+book2.discount(x));
        System.out.println("Price book 3 after "+x+"% discount: "+book350.discount(x));
    }
    
}
