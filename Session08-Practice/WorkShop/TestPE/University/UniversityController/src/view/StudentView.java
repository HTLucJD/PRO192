/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import java.util.List;
import model.Student;

/**
 *
 * @author Tan Luc
 */
public class StudentView {

    public void displayStudentList(List<Student> list) {
        if (!list.isEmpty()) {
            System.out.println("Student List: ");
            System.out.println("===================================");
            for (Student student : list) {
                System.out.println(student.toString());
            }

            System.out.println("===================================");
            System.out.println("Total: " + list.size() + " student in list.");
        } else {
            System.err.println("List student is empty!!!");
        }
    }
}
