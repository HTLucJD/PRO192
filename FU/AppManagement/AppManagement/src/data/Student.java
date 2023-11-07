/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package data;

/**
 *
 * @author ACER
 */
public class Student extends Person {

    private double gpa;
    private String major;

    public Student(String id, String fullName, int yob, String gender, String major, double gpa, String phoneNumber, String email, String address) {
        super(id, fullName, yob, gender, phoneNumber, email, address);
        this.gpa = gpa;
        this.major = major;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }
    

    @Override
    public void showProfile() {
        System.out.print( "ID: " + getId());
        System.out.print( ", Full name: " + getFullName());
        System.out.print( ", Year of birth: " + getYob());
        System.out.print( ", Gender: " + getGender());
        System.out.print( ", Major: " + getMajor());
        System.out.print( ", GPA: " + getGpa());
        System.out.print( ", Phone number: " + getPhoneNumber());
        System.out.print( ", Email: " + getEmail());
        System.out.print( ", Address: " + getAddress());
        System.out.println("\n");
    }

}
