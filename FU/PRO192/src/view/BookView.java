/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import java.util.List;
import model.Book;
import model.User;

/**
 *
 * @author Tan Luc
 */
public class BookView {
    public void printBooks(List<Book> list) {
        if (!list.isEmpty()) {
            System.out.println("Books List: ");
            System.out.println("===================================");
            for (Book book : list) {
                System.out.println(book.toString());
            }

            System.out.println("===================================");
            System.out.println("Total: " + list.size() + " book in list.");
        } else {
            System.err.println("List book is empty!!!");
        }
    }
}
