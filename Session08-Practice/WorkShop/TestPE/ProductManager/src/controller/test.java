/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import view.Menu;
import view.ProductManagement;

/**
 *
 * @author Tan Luc
 */
public class test {
    public static void main(String[] args) {
        Menu mainMenu = new ProductManagement("Product Management", new String[]{"Display all product", "Search product", "Add new product", "Exit"});
        mainMenu.excute();
    }
}
