/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import controller.Producer;
import java.io.IOException;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Validator;

/**
 *
 * @author Tan Luc
 */
public class ProductManagement extends Menu{

    public ProductManagement() {
    }

    public ProductManagement(String menuName, String[] options) {
        super(menuName, options);
    }

    

    @Override
    public void excute() {
        
        Producer producer = new Producer(); 
        int choice;
        do {            
            choice = displayMenu();
            switch (choice) {
                case 1:
                    producer.displayList(producer.getList());
                    break;
                case 2:
                    searchMenu(producer);
                    break;
                case 3:
                    producer.add();
                    break;
                case 4:
                {
                    try {
                        producer.saveData();
                    } catch (IOException ex) {
                        Logger.getLogger(ProductManagement.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                System.out.println("Bye bye. See you next time!!!");
                    break;

                default:
                    throw new AssertionError();
            }
        } while (choice != 4);
    }
    
    public void searchMenu(Producer producer) {
        String[] searchOptions = {"Search by product ID", "Search by product name", "Search by date", "Return"};
        Menu searchMenu = new Menu ("Product Search", searchOptions);
        int choice;
        do {     
            choice = searchMenu.displayMenu();
            switch (choice) {
                case 1:
                    int productID = Validator.inputInt("Enter product ID to search: ");
                    producer.searchProduct(product -> product.getProductID() == productID);
                    break;
                case 2:
                    String productName = Validator.inputStr("Enter product name to search: ");
                    producer.searchProduct(product -> product.getProductName().equalsIgnoreCase(productName));
                    break;
                case 3:
                    Date productManufacturingDate = Validator.inputDate("Enter product manufacturing date to search: ");
                    producer.searchProduct(product -> product.getProductManufacturingDate().equals(productManufacturingDate));
                    break;
                case 4:
                    return;
                default:
                    throw new AssertionError();
            }
        } while (choice != 4);
    }
}
