/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package appmanagement;

import data.Lecturer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author ACER
 */
public class LecturerMangament {
    private ArrayList<Lecturer> list = new ArrayList<>();
    Scanner sc = new Scanner(System.in);
    String id, fullName, gender, faculty, phoneNumber, email, address;
    int yob;

    public LecturerMangament() {
    }


    public void printSubMenu() {
        int choice;
        do {
            System.out.println("=============================================");
            System.out.println("Choose the following functions to play with: ");
            System.out.println("1. Add a lecturer profile");
            System.out.println("2. Print the lecturer list");
            System.out.println("3. Search a lecturer by id");
            System.out.println("4. Search a lecturer by name");
            System.out.println("5. Search a lecturer by email");
            System.out.println("6. Search a lecturer by faculty");
            System.out.println("7. Sorting lecturer list by ID");
            System.out.println("8. Sorting lecturer list by name");
            System.out.println("9. Remove a lecturer profile");
            System.out.println("10. Remove all lecturer profile");
            System.out.println("0. Come back");
            System.out.print("Please input your option: ");
            choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1:
                    addALecturer();
                    break;
                case 2:
                    printLecturerList();
                    break;
                case 3:
                    searchIDALecturer();
                    break;
                case 4:
                    searchNameALecturer();
                    break;
                case 5:
                    searchEmailALecturer();
                    break;
                case 6:
                    searchFacultylALecturer();
                    break;
                case 7:
                    sortID();
                    break;
                case 8:
                    sortName();
                    break;
                case 9:
                    removeALecturer();
                    break;
                case 10:
                    removeAllLecturers();
                    break;
                case 0:
                    return;
                default:
                    System.out.println("Please choose 0..12 options");
            }
        } while (choice != 0);
        sc.close();
    }

    public void addALecturer() {
        try {
            System.out.println("Input lecturer profile #" + (list.size() + 1));
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
            System.out.print("Input faculty: ");
            faculty = sc.nextLine().trim().toUpperCase();
            System.out.print("Input phone number: ");
            phoneNumber = sc.nextLine().trim().toUpperCase();
            System.out.print("Input email: ");
            email = sc.nextLine().trim().toUpperCase();
            System.out.print("Input address: ");
            address = sc.nextLine().trim().toUpperCase();
            list.add(new Lecturer(id, fullName, yob, gender, faculty, phoneNumber, email, address));
        } catch (NumberFormatException e) {
            System.err.println("Input error!!!");
        }
        System.out.println("The new lecturer has been added successdully");
    }

    public void printLecturerList() {
        if (list.isEmpty()) {
            System.out.println("List lecturer management is empty!!!");
        }
        for (int i = 0; i < list.size(); i++) {
            list.get(i).showProfile();
        }
    }


    public Lecturer searchID(String id) {
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

    public void searchNameALecturer() {
        String name;
        System.out.println("Input the name lecturer to search: ");
        name = sc.nextLine().trim().toUpperCase();
        boolean ok = false;
        for (Lecturer lecturer : list) {            
            if ((lecturer.getName()).equalsIgnoreCase(name)) {
                System.out.println("FOUND. Here she/he is: ");
                lecturer.showProfile();
                ok = true;
            }
        }
        if (list.isEmpty() || !ok) {
            System.out.println("Not FOUND!!!");
        }

    }
    
    public Lecturer searchFaculty(String faculty) {
        if (list.isEmpty()) {
            return null;
        }
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getFaculty().equalsIgnoreCase(faculty)) {
                return list.get(i);
            }
        }
        return null;
    }


    public Lecturer searchEmail(String email) {
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

    public void searchIDALecturer() {
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

    public void searchFacultylALecturer() {
        String keyWord;
        System.out.println("Input the faculty to search: ");
        keyWord = sc.nextLine().trim().toUpperCase();
        if (searchEmail(keyWord) == null) {
            System.out.println("Not FOUND!!!");
        } else {
            System.out.println("FOUND. Here she/he is: ");
            searchFaculty(keyWord).showProfile();
        }
    }

    public void searchEmailALecturer() {
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
        Collections.sort(list, new Comparator<Lecturer>() {
            @Override
            public int compare(Lecturer o1, Lecturer o2) {
                if (o1.getId().compareTo(o2.getId()) > 0)
                    return 1;
                else if (o1.getId().compareTo(o2.getId())<0) {
                    return -1;
                }
                return 0;
            }
            
        }); 
        for (Lecturer lecturer : list) {
            lecturer.showProfile();
        }
    }
    
    public void sortName() {
        Collections.sort(list, new Comparator<Lecturer>() {
            @Override
            public int compare(Lecturer o1, Lecturer o2) {
                if (o1.getName().compareTo(o2.getName()) > 0)
                    return 1;
                else if (o1.getName().compareTo(o2.getName()) < 0) {
                    return -1;
                }
                return 0;
            }
            
        }); 
        for (Lecturer lecturer : list) {
            lecturer.showProfile();
        }
    }


    public void removeALecturer() {
        String keyWord;
        System.out.println("Input the ID lecturer to remove: ");
        keyWord = sc.nextLine().trim().toUpperCase();
        if (searchID(keyWord) == null) {
            System.out.println("Not FOUND!!!");
        } else {
            list.remove(searchID(id));
            System.out.println("The lecturer has been removed successfully!!!");
        }
    }

    public void removeAllLecturers() {
            list.removeAll(list);
            System.out.println("The list lecturers have been removed successfully!!!");
    }

    
}
