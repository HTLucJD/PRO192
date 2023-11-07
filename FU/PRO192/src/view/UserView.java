/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import java.util.List;
import model.User;

/**
 *
 * @author Tan Luc
 */
public class UserView {
    public void printUsers(List<User> list) {
        if (!list.isEmpty()) {
            System.out.println("User List: ");
            System.out.println("===================================");
            for (User user : list) {
                System.out.println(user.toString());
            }

            System.out.println("===================================");
            System.out.println("Total: " + list.size() + " user in list.");
        } else {
            System.err.println("List user is empty!!!");
        }
    }
}
