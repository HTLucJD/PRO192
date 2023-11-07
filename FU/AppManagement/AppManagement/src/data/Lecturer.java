/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package data;

/**
 *
 * @author ACER
 */
public class Lecturer extends Person {

    private String faculty;

    public Lecturer(String id, String fullName, int yob, String gender, String faculty, String phoneNumber, String email, String address) {
        super(id, fullName, yob, gender, phoneNumber, email, address);
        this.faculty = faculty;
    }

    

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    @Override
    public void showProfile() {
        System.out.println( "ID: " + getId());
        System.out.println( "Full name: " + getFullName());
        System.out.println( "Year of birth: " + getYob());
        System.out.println( "Gender: " + getGender());
        System.out.println( "Faculty: " + getFaculty());
        System.out.println( "Phone number: " + getPhoneNumber());
        System.out.println( "Email: " + getEmail());
        System.out.println( "Address: " + getAddress());
       
    }
    
}
