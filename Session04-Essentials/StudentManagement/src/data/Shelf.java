/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package data;

import java.util.Scanner;

public class Shelf {

    private String color;
    private String label;

    private Student[] list = new Student[300];
    private Scanner sc = new Scanner(System.in);
    private int count = 0;

    public Shelf(String color, String label) {
        this.color = color;
        this.label = label;
    }

    public void addAStudent() {
        String id, name;
        int yob;
        double gpa;
        do {
            try {
        System.out.println("Input student #" + (count + 1) + "/" + list.length);
        System.out.print("Input id: ");
        id = sc.nextLine();
        System.out.print("Input name: ");
        name = sc.nextLine();
        System.out.print("Input yob: ");
        yob = Integer.parseInt(sc.nextLine());
        System.out.print("Input gpa: ");
        gpa = Double.parseDouble(sc.nextLine());

        list[count] = new Student(id, name, yob, gpa);
        count++;
        break;
        } catch (Exception e) {
                System.out.println("Input again");
            }
        } while (true);
    }

    public void printStudentList() {
        System.out.println("The student list ");
        for (int i = 0; i < count; i++) {
            list[i].showProfile();
        }
    }
    
    public void searchAStudent() {
        String id;
        System.out.println("Input student id that you want to search: ");
        id = sc.nextLine();
        for (int i = 0; i < count; i++) {
            if (list[i].getId().equalsIgnoreCase(id) == true){
                System.out.println("Student found!!!Here she/he is: ");
                list[i].showProfile();
                return;
            }
        }
        System.out.println("Student not found!!!");
    }

}
