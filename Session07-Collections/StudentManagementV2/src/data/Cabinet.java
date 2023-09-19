package data;

import java.util.*;

public class Cabinet {

    private List<Student> arr = new ArrayList();
    private Scanner sc = new Scanner(System.in);

    public Cabinet() {

    }

    public void addAStudent() {
        String id, name;
        int yob;
        double gpa;
        
        System.out.println("Input student profile #" + arr.size() + 1);
        while (true) {            
            System.out.print("Input id");
            id = sc.nextLine().trim().toUpperCase();
            Student xx = searchAStudent(id);
            if (xx == null) //éo tồn tại, đi tiếp
                break;
            else        
                System.out.println("Duplicated id. Try with another one!!!");
        }

        System.out.print("Input name: ");
        name = sc.nextLine().trim().toUpperCase();

        System.out.print("Input yob: ");
        yob = Integer.parseInt(sc.nextLine());

        System.out.print("Input gpa: ");
        gpa = Double.parseDouble(sc.nextLine());

        arr.add(new Student(id, name, yob, gpa));
        System.out.println("The new student has been added successfully");
    }

    public void printStudentList() {
        if (arr.isEmpty()) {
            System.out.println("The student list is empty. Nothing to print");
            return;
        }
        System.out.println("There is/are " + arr.size() + " student(s)");
        for (Student x : arr) {
            x.showProfile();
        }
    }

    public Student searchAStudent(String id) {
        if (arr.isEmpty()) {
            return null;
        }
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i).getId().equalsIgnoreCase(id)) {
                return arr.get(i);
            }
        }
        return null;
    }

    public void searchAStudent() {
        String keyword;
        System.out.print("Input the id to search: ");
        keyword = sc.nextLine();
        Student xx = searchAStudent(keyword);
        if (xx == null) {
            System.out.println("NOT FOUND!!!");
        } else {
            System.out.println("FOUND.Here she/he is");
            xx.showProfile();
        }
    }
    
    public void updateAStudent(Student x, double newGPA) {
        x.setGpa(newGPA);
    }
    
    public void updateAStudent(String id, double newGPA) {
        Student xx = searchAStudent(id);
        if (xx == null) {
            System.out.println("NOT FOUND! NOTHING TO UPDATE");
            return;           
        }
        updateAStudent(xx, newGPA);
    }
    
    public void updateAStudent() {
        String keyword;
        double newGPA;
        System.out.print("Input the student id you want to update info: ");
        keyword = sc.nextLine();
        Student xx = searchAStudent(keyword);
        if (xx == null) {
            System.out.println("NOT FOUND! NOTHING TO UPDATE");
        } else {
            System.out.println("FOUND.Here she/he is before updating");
            xx.showProfile();
            System.out.print("Input a new gpa: ");
            newGPA = Double.parseDouble(sc.nextLine());
            xx.setGpa(newGPA);
            System.out.println("The student profile after updating new gpa");
            xx.showProfile();
        }
    }

}
