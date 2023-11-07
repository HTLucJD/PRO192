/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package documentmanagement;

import java.util.Scanner;


public class Book extends Document {
    private String authorName;
    private int pageNumber;


    public Book(){  
    }

    
    public Book(String authorName, int pageNumber, String documentCode, String publishName, int circulationNumber) {
        super(documentCode, publishName, circulationNumber);
        this.authorName = authorName;
        this.pageNumber = pageNumber;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public int getPageNumber() {
        return pageNumber;
    }

    public void setPageNumber(int pageNumber) {
        this.pageNumber = pageNumber;
    }
    
    @Override
    public void inputInfo(Scanner sc) {
        super.inputInfo(sc);
        System.out.print("Input author name: ");
        authorName = sc.nextLine();
        System.out.print("Input page number: ");
        pageNumber = Integer.parseInt(sc.nextLine());
    }

    @Override
    public void displayInfo() {
        super.displayInfo(); 
        System.out.println("Author name: "+ authorName);
        System.out.println("Page number: "+ pageNumber);
    }
    
    
}
