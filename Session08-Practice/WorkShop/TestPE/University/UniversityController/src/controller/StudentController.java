/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Student;
import utils.Validation;

/**
 *
 * @author Tan Luc
 */
public class StudentController {
    List<Student> studentList = new ArrayList<>();

    public StudentController() {
        try {
            loadData();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Student.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void setList(List<Student> list) {
        this.studentList = list;
    }

    public void loadData() throws FileNotFoundException {
        FileReader fr = new FileReader("Student.txt");
        try (BufferedReader br = new BufferedReader(fr)) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] tokens = line.split(", ");
                String id = tokens[0].trim();
                String firstName = tokens[1].trim();
                String lastName = tokens[2].trim();
                String phoneNumber = tokens[3].trim();
                String address = tokens[4].trim();               

                Student student = new Student(id, firstName, lastName, phoneNumber, address);
                this.studentList.add(student);
            }
            br.close();
            System.out.println("Data load to Student.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void saveData() throws IOException {
        FileWriter fw = new FileWriter("Product_out.txt");
        try {
            BufferedWriter bw = new BufferedWriter(fw);
            for (Student student : studentList) {
                bw.write(student.toString());
                bw.newLine();
            }
            bw.close();
            System.out.println("Data saved to Student_out.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public void add() {
        String id = Validation.inputStr("Enter student id: ");
        String firstName = Validation.inputStr("Enter first name: ");
        String lastName = Validation.inputStr("Enter last name: ");
        String phoneNumber = Validation.inputStr("Enter phone number: ");
        String address = Validation.inputStr("Enter address: ");
        

        Student newStudent = new Student(id, firstName, lastName, phoneNumber, address);
        this.studentList.add(newStudent);
        System.out.println("Add sucessfully!!!");
    }

 public void searchStudent(Predicate<Student> condition) {
        List<Student> studentSearch = new ArrayList<>();
        for (Student student : studentList) {
            if (condition.test(student)) {
                studentSearch.add(student);
            }
        }
        displayList(studentSearch);
    }
    
    public void sortList(List<Student> studentList) {
        if (!studentList.isEmpty()) {
            for (Student product : studentList) {
                Collections.sort(studentList);
                System.out.println(product);
            }
            System.out.println("Total: " + studentList.size() + " student in list.");
        } else {
            System.err.println("List student is empty!!!");
        }
    }

    public void displayList(List<Student> studentList) {
        if (!studentList.isEmpty()) {
            for (Student student : studentList) {
                System.out.println(student);
            }
            System.out.println("Total: " + studentList.size() + " student in list.");
        } else {
            System.err.println("List student is empty!!!");
        }
    }
    
}
