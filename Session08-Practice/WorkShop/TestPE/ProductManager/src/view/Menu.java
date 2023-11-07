/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import model.Validator;

    

public class Menu {
    private String menuName;
    private String[] options;
    
    public Menu() {
    }

    public Menu(String menuName, String[] options) {
        this.menuName = menuName;
        this.options = options;
    }

    
    
    public int displayMenu() {
        System.out.println(menuName);
        System.out.println("==========================================");
        for (int i = 0; i < options.length; i++) {
            System.out.println((i + 1) + ". " + options[i]);
        }
        System.out.println("Please input your choice!!!");
        System.out.println("Choose 1.." + options.length+ ":");
        System.out.println("==========================================");
        return Validator.inputInt("Enter your choice: ", 1, options.length);
    }
    public void excute(){    
    }
}
