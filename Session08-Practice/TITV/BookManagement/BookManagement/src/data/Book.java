/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package data;

/**
 *
 * @author ACER
 */
public class Book {
    private String bookName;
    private double bookPrices;
    private int publishYear;
    private Author author;

    public Book(String bookName, double bookPrices, int publishYear, Author author) {
        this.bookName = bookName;
        this.bookPrices = bookPrices;
        this.publishYear = publishYear;
        this.author = author;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public double getBookPrices() {
        return bookPrices;
    }

    public void setBookPrices(double bookPrices) {
        this.bookPrices = bookPrices;
    }

    public int getPublishYear() {
        return publishYear;
    }

    public void setPublishYear(int publishYear) {
        this.publishYear = publishYear;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "Book{" + "bookName=" + bookName + ", bookPrices=" + bookPrices + ", publishYear=" + publishYear + ", author=" + author + '}';
    }
    
    public void printBook() {
        System.out.println(getBookName());
    }
    
    public boolean checkPublish(Book otherBook) {
        return this.publishYear == otherBook.publishYear;
    }
    
    public double discount(double x) {
        return this.bookPrices*(1-x/100);
    }
}
