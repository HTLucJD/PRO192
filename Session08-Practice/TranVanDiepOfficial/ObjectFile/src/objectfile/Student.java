/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package objectfile;

import java.io.Serializable;

/**
 *
 * @author Tan Luc
 */
public class Student implements Serializable{

    private String fullname, address;

    public Student() {
    }

    public Student(String fullname, String address) {
        this.fullname = fullname;
        this.address = address;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Student = [" + "fullname=" + fullname + ", address=" + address + ']';
    }

    public String getFileLineFormat() {
        return fullname + "," + address;
    }
}
