/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import java.util.List;
import model.Order;

/**
 *
 * @author Tan Luc
 */
public class OrderView {
    public void printUsers(List<Order> list) {
        if (!list.isEmpty()) {
            System.out.println("Order List: ");
            System.out.println("===================================");
            for (Order order : list) {
                System.out.println(order.toString());
            }

            System.out.println("===================================");
            System.out.println("Total: " + list.size() + " order in list.");
        } else {
            System.err.println("List order is empty!!!");
        }
    }
}
