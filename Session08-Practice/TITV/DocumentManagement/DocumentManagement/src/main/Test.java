/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import documentmanagement.DocumentManagement;
import java.util.Scanner;

/**
 *
 * @author Tan Luc
 */
public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DocumentManagement docManagerment = new DocumentManagement();
        docManagerment.inputDocuments(sc);
        
        System.out.print("Input document code you need to find: ");
        String docCode = sc.nextLine();
        docManagerment.searchByDocumentCode(docCode);
        
        System.out.print("Input document type you need to find: ");
        String docType = sc.nextLine();
        docManagerment.searchByDocument(docType);
        
    }   
}
