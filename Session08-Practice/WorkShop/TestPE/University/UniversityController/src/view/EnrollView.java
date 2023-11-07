/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import java.util.List;
import model.Enroll;

/**
 *
 * @author Tan Luc
 */
public class EnrollView {
    public void displayEnrollList(List<Enroll> list) {
        if (!list.isEmpty()) {
            System.out.println("Enroll List: ");
            System.out.println("===================================");
            for (Enroll enroll : list) {
                System.out.println(enroll.toString());
            }

            System.out.println("===================================");
            System.out.println("Total: " + list.size() + " enroll in list.");
        } else {
            System.err.println("List enroll is empty!!!");
        }
    }
}
