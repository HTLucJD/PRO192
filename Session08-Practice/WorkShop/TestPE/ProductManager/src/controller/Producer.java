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
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Product;
import model.Validator;

/**
 *
 * @author Tan Luc
 */
public class Producer {

    List<Product> list = new ArrayList<>();
    
    public List<Product> getList() {
        return list;
    }
    
    public Producer() {
        try {
            loadData();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Producer.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void setList(List<Product> list) {
        this.list = list;
    }

    public void loadData() throws FileNotFoundException {
        FileReader fr = new FileReader("Product.txt");
        try (BufferedReader br = new BufferedReader(fr)) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] tokens = line.split(", ");
                int productID = Integer.parseInt(tokens[0].trim());
                String productName = tokens[1].trim();
                double unitPrice = Double.parseDouble(tokens[2].trim());
                int quantity = Integer.parseInt( tokens[3].trim());
                int version = Integer.parseInt(tokens[4].trim());
                Date pmd = Validator.parseDate(tokens[5].trim());

                Product product = new Product(productID, productName, unitPrice, quantity, version, pmd);
                this.list.add(product);
                Collections.sort(list);
            }
            br.close();
            System.out.println("Data load to Product.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void saveData() throws IOException {
        FileWriter fw = new FileWriter("Product_out.txt");
        try {
            BufferedWriter bw = new BufferedWriter(fw);
            for (Product product : list) {
                bw.write(product.toString());
                bw.newLine();
            }
            bw.close();
            System.out.println("Data saved to Product_out.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public void add() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter product ID: ");
        int productID = Integer.parseInt(sc.nextLine());
        String productName = Validator.inputStr("Enter product name: ");
        System.out.println("Enter unit price: ");
        double unitPrice = Double.parseDouble(sc.nextLine());
        System.out.println("Enter quantity: ");
        int quantity = Integer.parseInt(sc.nextLine());
        System.out.println("Enter version: ");
        int version = Integer.parseInt(sc.nextLine());
        Date pmd = Validator.inputDate("Enter date of birth(dd/MM/yy): ");

        Product newProduct = new Product(productID, productName, unitPrice, quantity, version, pmd);
        this.list.add(newProduct);
        Collections.sort(list);
        System.out.println("Done!!!");
    }

 public void searchProduct(Predicate<Product> condition) {
        List<Product> productSearch = new ArrayList<>();
        for (Product product : list) {
            if (condition.test(product)) {
                productSearch.add(product);
            }
        }
        displayList(productSearch);
    }
    
    public void sortList(List<Product> list) {
        if (!list.isEmpty()) {
            for (Product product : list) {
                Collections.sort(list);
                System.out.println(product);
            }
            System.out.println("Total: " + list.size() + " product in list.");
        } else {
            System.err.println("List product is empty!!!");
        }
    }

    public void displayList(List<Product> list) {
        if (!list.isEmpty()) {
            for (Product product : list) {
                System.out.println(product);
            }
            System.out.println("Total: " + list.size() + " product in list.");
        } else {
            System.err.println("List product is empty!!!");
        }
    }
}
