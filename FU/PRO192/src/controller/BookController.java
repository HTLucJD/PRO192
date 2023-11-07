/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import model.Book;
import utils.Inputter;

/**
 *
 * @author Tan Luc
 */
public class BookController{
    List<Book> bookList = new ArrayList<>();

    public BookController(){
        
    }
    public List<Book> getBookList() {
        return bookList;
    }

    public void setBookList(List<Book> bookList) {
        this.bookList = bookList;
    }

    public boolean searchID(String id) {

        if (!bookList.isEmpty()) {
            for (Book book : bookList) {
                if (book.getId().equalsIgnoreCase(id)) {
                    return true;
                }
            }
            return false;
        } else {
            return false;
        }
    }
    public void importBooksFromFile() throws FileNotFoundException {
        FileReader fr = new FileReader("books.txt");
        try (BufferedReader br = new BufferedReader(fr)) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] tokens = line.split("|");
                String id = tokens[0].trim();
                String title = tokens[1].trim();
                String authorName = tokens[2].trim();
                double price = Double.parseDouble(tokens[4].trim());;
                int amount = Integer.parseInt( tokens[4].trim());               

                Book book = new Book(id, title, authorName, price, amount);
                this.bookList.add(book);
            }
            br.close();
            System.out.println("Data load to books.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void saveBookToFile() throws IOException {
        FileWriter fw = new FileWriter("Book_out.txt");
        try {
            BufferedWriter bw = new BufferedWriter(fw);
            for (Book book : bookList) {
                bw.write(book.toString());
                bw.newLine();
            }
            bw.close();
            System.out.println("Data saved to Book_out.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public void addBook() {
        String id = Inputter.getStringFromInput("Id");
        String title = Inputter.getStringFromInput("tilte name");
        String authorName = Inputter.getStringFromInput("author name");
        double price = Inputter.getDoubleFromInput("price");
        int amount = Inputter.getIntFromInput("amount");

        Book newBook = new Book(id, title, authorName, price, amount);
        this.bookList.add(newBook);
        System.out.println("Add sucessfully!!!");
    }

   
    public void execute(int choice) {
        
    }
    
}
