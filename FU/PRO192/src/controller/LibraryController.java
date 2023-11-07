/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Tan Luc
 */
public class LibraryController {
    private UserController userController;
    private BookController bookController;
    private OrderController orderController;

    public LibraryController() {
        super("Library Management System",
                new ArrayList<>(
                        List.of("User Management",
                                "Book Management",
                                "Order Management",
                                "Exit")));

        userController = new UserController();
        bookController = new BookController();
        orderController = new OrderController();
    }

    public void execute(int choice) {
        switch (choice) {
            case 1:
                userController.run();
                break;
            case 2:
                bookController.run();
                break;
            case 3:
                orderController.run();
                break;
            case 4:
                System.err.println("Exited.");
                break;
            default:
                System.err.println("Invalid choice. Please try again.");
        }
    }
}
