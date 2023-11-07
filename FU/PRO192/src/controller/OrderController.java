/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.util.ArrayList;
import java.util.List;
import model.Order;
import utils.Inputter;
import view.Menu;

/**
 *
 * @author Tan Luc
 */
public class OrderController {
    List<Order> orderList = new ArrayList<>();

    public OrderController() {
    }

    public List<Order> getOrderList() {
        return orderList;
    }

    public void setOrderList(List<Order> orderList) {
        this.orderList = orderList;
    }


    public void addOrder() {
        String orderID = Inputter.getStringFromInput("order id");
        String userID = Inputter.getStringFromInput("user id");
        String bookID = Inputter.getStringFromInput("book id");
        int quantity = Inputter.getIntFromInput("quantity");

        Order newOrder = new Order(orderID, userID, bookID, quantity);
        this.orderList.add(newOrder);
        System.out.println("Add sucessfully!!!");
    }

    
    public void execute(int choice) {
        
    }
}
