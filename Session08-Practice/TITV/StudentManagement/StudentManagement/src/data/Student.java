/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package data;

/**
 *
 * @author ACER
 */
public class Student {

    private String id, fullName;
    private Date yob;
    private double gpa;
    private Lop classr;

    public Student(String id, String fullName, Date yob, double gpa, Lop classr) {
        this.id = id;
        this.fullName = fullName;
        this.yob = yob;
        this.gpa = gpa;
        this.classr = classr;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public Date getYob() {
        return yob;
    }

    public void setYob(Date yob) {
        this.yob = yob;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public Lop getClassr() {
        return classr;
    }

    public void setClassr(Lop classr) {
        this.classr = classr;
    }

    public void printMajor() {
        System.out.println("Major: " + classr.getMajorName());
    }

    public boolean checkPass() {
        return this.gpa >= 5;
    }
    
    public boolean sameyob(Student otherStudent) {
        return this.yob.equals(otherStudent.yob);
    }
}
