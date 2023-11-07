/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.util.ArrayList;
import java.util.List;
import model.User;
import utils.Inputter;
import view.Menu;

/**
 *
 * @author Tan Luc
 */
public class UserController extends Menu {

    List<User> userList = new ArrayList<>();

    public UserController(String title, List<String> services) {
        super(title, services);
    }

    public List<User> getUserList() {
        return userList;
    }

    public void setUserList(List<User> userList) {
        this.userList = userList;
    }

    public void setList(List<User> list) {
        this.userList = list;
    }

    public boolean searchID(String id) {

        if (!userList.isEmpty()) {
            for (User user : userList) {
                if (user.getId().equalsIgnoreCase(id)) {
                    return true;
                }
            }
            return false;
        } else {
            return false;
        }
    }


    public void addUser() {
        String id = Inputter.getStringFromInput("Id");
        String firstName = Inputter.getStringFromInput("first name");
        String lastName = Inputter.getStringFromInput("last name");
        String phoneNumber = Inputter.getStringFromInput("phone number");
        int balance = Inputter.getIntFromInput("balance");

        User newUser = new User(id, firstName, lastName, phoneNumber, balance);
        this.userList.add(newUser);
        System.out.println("Add sucessfully!!!");
    }

    @Override
    public void execute(int choice) {
        
    }
}
