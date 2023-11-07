/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package documentmanagement;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Tan Luc
 */
public class DocumentManagement {
    private ArrayList<Document> listDocuments = new ArrayList<>();
    
    public void addDocument(Document document) {
        listDocuments.add(document);
    }
    
    public void inputDocuments(Scanner sc) {
        int choice;
        String stop;
        Document document;
        
        do {    
            System.out.println("====Document Management=====");
            System.out.println("1. Choose book");
            System.out.println("2. Choose newspaper");
            System.out.println("3. Choose magazine");
            System.out.print("Input your choice: ");
            choice = Integer.parseInt(sc.nextLine());
            
            switch (choice) {
                case 1:
                    document = new Book();
                    break;
                case 2:
                    document = new Newspaper();
                    break;
                case 3:
                    document = new Magazine();
                    break;
                default:
                    throw new AssertionError();
            }
            document.inputInfo(sc);
            addDocument(document);
            System.out.print("\nDo you want to input document?(Y/N)");
            stop = sc.nextLine();
        } while (stop.equals('Y'));
    }
    
    public void searchByDocumentCode(String code) {
        for (Document i : listDocuments) {
            if (i.getDocumentCode().equals(code)){
                System.out.println("Found!!! It's :");
                i.displayInfo();
            } 
            else
                System.out.println("Not Found");
        }
    }
    
    public void searchByDocument(String type) {
        for (Document document : listDocuments) {
            if (type.equals("Book") && (document instanceof Book))
                document.displayInfo();
            else if (type.equals("Newspaper") && (document instanceof Newspaper))
                document.displayInfo();
            else if (type.equals("Magazine") && (document instanceof Magazine))
                document.displayInfo();
        }
    }
    
}
