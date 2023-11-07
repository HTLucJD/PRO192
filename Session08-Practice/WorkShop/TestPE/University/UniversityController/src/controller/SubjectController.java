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
import model.Subject;
import utils.Validation;

/**
 *
 * @author Tan Luc
 */
public class SubjectController {
    List<Subject> subjectList = new ArrayList<>();

    public SubjectController() {
        try {
            loadData();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(SubjectController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void setList(List<Student> subjectList) {
        this.subjectList = this.subjectList;
    }

    public void loadData() throws FileNotFoundException {
        FileReader fr = new FileReader("Subject.txt");
        try (BufferedReader br = new BufferedReader(fr)) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] tokens = line.split(", ");
                String id = tokens[0].trim();
                String name = tokens[1].trim();
                String credit = tokens[2].trim();
                String professor = tokens[3].trim();
                               

                Subject subject = new Subject(id, name, credit, professor);
                this.subjectList.add(subject);
            }
            br.close();
            System.out.println("Data load to Subject.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void saveData() throws IOException {
        FileWriter fw = new FileWriter("Subject_out.txt");
        try {
            BufferedWriter bw = new BufferedWriter(fw);
            for (Subject subject : subjectList) {
                bw.write(subject.toString());
                bw.newLine();
            }
            bw.close();
            System.out.println("Data saved to Student_out.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public void add() {
        String id = Validation.inputStr("Enter subject id: ");
        String name = Validation.inputStr("Enter name: ");
        String credit = Validation.inputStr("Enter credits: ");
        String professor = Validation.inputStr("Enter professor: ");
        
        

        Subject newSubject = new Subject(id, name, credit, professor);
        this.subjectList.add(newSubject);
        System.out.println("Add sucessfully!!!");
    }

 public void searchSubject(Predicate<Subject> condition) {
        List<Subject> subjectSearch = new ArrayList<>();
        for (Subject subject : subjectList) {
            if (condition.test(subject)) {
                subjectSearch.add(subject);
            }
        }
        displayList(subjectSearch);
    }
    
    public void sortList(List<Subject> subjectList) {
        if (!subjectList.isEmpty()) {
            for (Subject subject : subjectList) {
                Collections.sort(subjectList);
                System.out.println(subject);
            }
            System.out.println("Total: " + subjectList.size() + " subject in list.");
        } else {
            System.err.println("List subject is empty!!!");
        }
    }

    public void displayList(List<Subject> subjectList) {
        if (!subjectList.isEmpty()) {
            for (Subject subject : subjectList) {
                System.out.println(subject);
            }
            System.out.println("Total: " + subjectList.size() + " subject in list.");
        } else {
            System.err.println("List subject is empty!!!");
        }
    }
}
