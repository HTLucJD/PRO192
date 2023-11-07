/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package compareobject;

import data.Student;

/**
 *
 * @author ACER
 */
public class CompareObject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Student student1 = new Student("QE180161", "Huynh Tan Luc", "SE18B03", 2004, 7);
        Student student2 = new Student("QE180145", "Trinh Quoc Thang", "SE18B03", 2004, 7);
        Student student3 = new Student("QE180005", "Bui The Son", "SE18B03", 2004, 7);
        
        System.out.println(student1.compareTo(student2));
        System.out.println(student1.compareTo(student3));
    }
    
}
