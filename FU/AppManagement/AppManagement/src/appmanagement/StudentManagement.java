/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package appmanagement;

import data.Student;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author ACER
 */
public class StudentManagement{

    private ArrayList<Student> list = new ArrayList<>();
    Scanner sc = new Scanner(System.in);
    String id, fullName, gender, major, phoneNumber, email, address;
    int yob;
    double gpa;

    public StudentManagement() {
    }

    public void printSubMenu() {
        int choice;
        do {
            System.out.println("=============================================");
            System.out.println("Choose the following functions to play with: ");
            System.out.println("1. Add a student profile");
            System.out.println("2. Print the student list");
            System.out.println("3. Update a student GPA");
            System.out.println("4. Search a student by id");
            System.out.println("5. Search a student by name");
            System.out.println("6. Search a student by email");
            System.out.println("7. Search a student by major");
            System.out.println("8. Sorting student list by ID");
            System.out.println("9. Sorting student list by name");
            System.out.println("10. Sorting student list by GPA");
            System.out.println("11. Remove a student profile");
            System.out.println("12. Remove all student profile");
            System.out.println("0. Come back");
            System.out.print("Please input your option: ");
            choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1:
                    addAStudent();
                    break;
                case 2:
                    printStudentList();
                    break;
                case 3:
                    updateAStudent();
                    break;
                case 4:
                    searchIDAStudent();
                    break;
                case 5:
                    searchNameAstudent();
                    break;
                case 6:
                    searchEmailAStudent();
                    break;
                case 7:
                    searchMajorAStudent();                   
                    break;
                case 8:
                    sortID();
                    break;
                case 9:
                    sortName();
                    break;
                case 10:
                    sortGPA();
                    break;
                case 11:
                    removeAStudent();
                    break;
                case 12:
                    removeAllStudents();
                    break;
                case 0:
                    return;
                default:
                    System.out.println("Please choose 0..12 options");
            }
        } while (choice != 0);
        sc.close();
    }

    public void addAStudent() {
        try {
            System.out.println("Input student profile #" + (list.size() + 1));
            while (true) {
                System.out.print("Input ID: ");
                id = sc.nextLine().trim().toUpperCase();
                if (searchID(id) == null) {
                    break;
                } else {
                    System.err.println("Duplicated ID. Try with another one!!!");
                }
            }
            System.out.print("Input full name: ");
            fullName = sc.nextLine().trim().toUpperCase();
            System.out.print("Input year of birthday: ");
            yob = Integer.parseInt(sc.nextLine());
            System.out.print("Input gender: ");
            gender = sc.nextLine().trim().toUpperCase();
            System.out.print("Input major: ");
            major = sc.nextLine().trim().toUpperCase();
            System.out.print("Input GPA: ");
            gpa = Double.parseDouble(sc.nextLine());
            System.out.print("Input phone number: ");
            phoneNumber = sc.nextLine().trim().toUpperCase();
            System.out.print("Input email: ");
            email = sc.nextLine().trim().toUpperCase();
            System.out.print("Input address: ");
            address = sc.nextLine().trim().toUpperCase();
            list.add(new Student(id, fullName, yob, gender, major, gpa, phoneNumber, email, address));
        } catch (NumberFormatException e) {
            System.err.println("Input error!!!");
        }
        System.out.println("The new student has been added successdully");
    }

    public void printStudentList() {
        if (list.isEmpty()) {
            System.out.println("List student management is empty!!!");
        }
        for (int i = 0; i < list.size(); i++) {
            list.get(i).showProfile();
        }
    }

    public void updateAStudent() {
        String keyWord;
        double newGpa;
        System.out.println("Input student ID that you need update: ");
        keyWord = sc.nextLine().trim().toUpperCase();
        if (searchID(keyWord) == null) {
            System.err.println("Not found student ID. Try with another one's ID!!!");
        } else {
            System.out.println("FOUND. Here she/he is before updating");
            searchID(keyWord).showProfile();
            System.out.print("Input new GPA: ");
            newGpa = Double.parseDouble(sc.nextLine());
            searchID(keyWord).setGpa(newGpa);
            System.out.println("The student profile after updating new gpa");
            searchID(keyWord).showProfile();

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

    public void searchNameAstudent() {
        String name;
        System.out.println("Input the name student to search: ");
        name = sc.nextLine().trim().toUpperCase();
        boolean ok = false;
        for (Student student : list) {            
            if ((student.getName()).equalsIgnoreCase(name)) {
                System.out.println("FOUND. Here she/he is: ");
                student.showProfile();
                ok = true;
            }
        }
        if (list.isEmpty() || !ok) {
            System.out.println("Not FOUND!!!");
        }

    }

    public Student searchMajor(String major) {
        if (list.isEmpty()) {
            return null;
        }
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getMajor().equalsIgnoreCase(major)) {
                return list.get(i);
            }
        }
        return null;
    }

    public Student searchEmail(String id) {
        if (list.isEmpty()) {
            return null;
        }
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getEmail().equalsIgnoreCase(email)) {
                return list.get(i);
            }
        }
        return null;
    }

    public void searchIDAStudent() {
        String keyWord;
        System.out.println("Input the ID to search: ");
        keyWord = sc.nextLine().trim().toUpperCase();
        if (searchID(keyWord) == null) {
            System.out.println("Not FOUND!!!");
        } else {
            System.out.println("FOUND. Here she/he is: ");
            searchID(keyWord).showProfile();
        }
    }

    public void searchMajorAStudent() {
        String keyWord;
        System.out.println("Input the major to search: ");
        keyWord = sc.nextLine().trim().toUpperCase();
        if (searchMajor(keyWord) == null) {
            System.out.println("Not FOUND!!!");
        } else {
            System.out.println("FOUND. Here she/he is: ");
            searchMajor(keyWord).showProfile();
        }
    }

    public void searchEmailAStudent() {
        String keyWord;
        System.out.println("Input the email to search: ");
        keyWord = sc.nextLine().trim().toUpperCase();
        if (searchEmail(keyWord) == null) {
            System.out.println("Not FOUND!!!");
        } else {
            System.out.println("FOUND. Here she/he is: ");
            searchEmail(keyWord).showProfile();
        }
    }
    
    public void sortID() {
        Collections.sort(list, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                if (o1.getId().compareTo(o2.getId()) > 0)
                    return 1;
                else if (o1.getId().compareTo(o2.getId())<0) {
                    return -1;
                }
                return 0;
            }
            
        }); 
        for (Student student : list) {
            student.showProfile();
        }
    }
    
    public void sortName() {
        Collections.sort(list, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                if (o1.getName().compareTo(o2.getName()) > 0)
                    return 1;
                else if (o1.getName().compareTo(o2.getName()) < 0) {
                    return -1;
                }
                return 0;
            }
            
        }); 
        for (Student student : list) {
            student.showProfile();
        }
    }
    
    public void sortGPA() {
        Collections.sort(list, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                if (o1.getGpa()<o2.getGpa())
                    return 1;
                else if (o1.getGpa()>o2.getGpa()) {
                    return -1;
                }
                return 0;
            }
            
        }); 
        for (Student student : list) {
            student.showProfile();
        }
    }

    public void removeAStudent() {
        String keyWord;
        System.out.println("Input the ID student to remove: ");
        keyWord = sc.nextLine().trim().toUpperCase();
        if (searchID(keyWord) == null) {
            System.out.println("Not FOUND!!!");
        } else {
            list.remove(searchID(id));
            System.out.println("The student has been removed successfully!!!");
        }
    }

    public void removeAllStudents() {
            list.removeAll(list);
            System.out.println("The list students have been removed successfully!!!");
    }

}
