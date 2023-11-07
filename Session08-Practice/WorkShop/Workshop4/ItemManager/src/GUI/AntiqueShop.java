/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package GUI;

import DTO.Item;
import DTO.Painting;
import DTO.Statue;
import DTO.Vase;
import java.util.Scanner;

/**
 *
 * @author Tan Luc
 */
public class AntiqueShop {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] options = {"Create a Vase", "Create a Statue", "Create a Painting"
                , "Display the item", "Quit"};
        Item item = null;
        int choice = 0;
        do {            
            choice = Menu.getMenu(options);
            switch (choice) {
                case 1:
                    item = new Vase();
                    ((Vase)item).inputVase();
                    break;
                case 2:
                    item = new Statue();
                    ((Statue)item).inputStatue();
                    break;
                case 3:
                    item = new Painting();
                    ((Painting)item).inputPainting();
                    break;
                case 4:
                    if (item != null) {
                        if (item instanceof Vase)
                            ((Vase)item).outputVase();
                        else if (item instanceof Statue)
                            ((Statue)item).outputStatue();
                        else if (item instanceof Painting)
                            ((Painting)item).OuputPainting();
                        else System.out.println("You need to create an object");
                    }
                    break;
                case 5:
                    System.out.println("Bye bye. See you next time!!!");
                    break;
                default:
                    throw new AssertionError();
            }
        } while (choice != 5);
    }
    
}
