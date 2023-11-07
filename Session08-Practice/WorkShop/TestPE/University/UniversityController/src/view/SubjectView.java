/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import java.util.List;
import model.Subject;

/**
 *
 * @author Tan Luc
 */
public class SubjectView {
    public void displaySubjectList(List<Subject> list) {
        if (!list.isEmpty()) {
            System.out.println("Subject List: ");
            System.out.println("===================================");
            for (Subject subject : list) {
                System.out.println(subject.toString());
            }

            System.out.println("===================================");
            System.out.println("Total: " + list.size() + " subject in list.");
        } else {
            System.err.println("List subject is empty!!!");
        }
    }
}
