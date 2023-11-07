/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package data;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author ACER
 */
public class Management {

    private ArrayList<Student> list = new ArrayList<>();
    private Scanner sc = new Scanner(System.in);

    public Management() {
    }

    public void addAStudent() {
        String id, name;
        int yob;
        double gpa;
        System.out.println("Input student profile #" + (list.size() + 1));
        while (true) {
            System.out.println("Input ID: ");
            id = sc.nextLine().trim().toUpperCase();
            if (searchID(id) == null) {
                break;
            } else 
                System.out.println("Duplicated ID. Try with another one!!!");
        }

        System.out.print("Input name: ");
        name = sc.nextLine().trim().toUpperCase();
        System.out.print("Input year of birthday: ");
        yob = Integer.parseInt(sc.nextLine());
        System.out.print("Input gpa: ");
        gpa = Double.parseDouble(sc.nextLine());

        list.add(new Student(id, name, yob, gpa));
        System.out.println("The new student has been added successdully");
    }

    public void printStudentList() {
        for (int i = 0; i < list.size(); i++) {
            list.get(i).showProfile();
        }
    }

    public Student searchID(String id) {
        if (list.isEmpty()) {
            return null;
        }
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId().equalsIgnoreCase(id)) {
                return list.get(i);
            }
        }
        return null;
    }

    public void searchAstudent() {
        String id;
        System.out.println("Input the ID to search: ");
        id = sc.nextLine();
        if (searchID(id) == null) {
            System.out.println("Not FOUND!!!");
        } else {
            System.out.println("FOUND. Here she/he is: ");
            searchID(id).showProfile();
        }
    }
}
