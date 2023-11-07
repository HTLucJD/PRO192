/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package userpass;

import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author ACER
 */
public class UserPass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<String, String> users = new HashMap<>();
        users.put("user1", "0123456");
        users.put("user2", "0143456");
        users.put("user3", "0153456");
        users.put("user4", "0163456");
        users.put("user5", "0122456");
        System.out.println("Input user name: ");
        String userName = sc.nextLine();
        System.out.println("Input password: ");
        String pass = sc.nextLine();
        if (!users.containsKey(userName))
            System.out.println("User does not exist!!!");
        else if (!users.get(userName).equals(pass))
            System.out.println("Password wrong!!!");
        else
            System.out.println("Logged in successfully");
    }
    
}
