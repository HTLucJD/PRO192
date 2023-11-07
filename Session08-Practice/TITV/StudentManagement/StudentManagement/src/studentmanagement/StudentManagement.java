/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package studentmanagement;

import data.Date;
import data.Lop;
import data.Student;

/**
 *
 * @author ACER
 */
public class StudentManagement {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Date date1 = new Date(1, 2, 2004);
        Date date2 = new Date(4, 4, 2004);
        Date date3 = new Date(6, 9, 2004);
        Lop class1 = new Lop("SE180B03", "SE");
        Lop class2 = new Lop("SE180B02", "AI");
        Lop class3 = new Lop("SE180B01", "IA");
        Student student1 = new Student("QE180161", "Huynh Tan Luc", date1, 9, class1);
        Student student2 = new Student("QE180076", "Trinh Quoc Thang", date2, 8, class2);
        Student student3 = new Student("QE180721", "To Thien Nhan", date3, 7, class3);
        System.out.println("Major name:");
        student1.printMajor();
        student2.printMajor();
        student3.printMajor();
        System.out.println("Check pass test:");
        System.out.println("Student1: "+student1.checkPass());
        System.out.println("Student2: "+student2.checkPass());
        System.out.println("Student3: "+student3.checkPass());
        System.out.println("Same of year of birth:");
        System.out.println("Student1 and Student2: "+student1.sameyob(student2));
        System.out.println("Student2 and Student3: "+student2.sameyob(student3));
        System.out.println("Student1 and Student3: "+student1.sameyob(student3));
    }
    
}
