/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package data;

/**
 *
 * @author ACER
 */
public class Student implements Comparable<Student> {

    private String id, fullName, className;
    private int yob, gpa;
    
    public Student(String id, String fullName, String className, int yob, int gpa) {
        this.id = id;
        this.fullName = fullName;
        this.className = className;
        this.yob = yob;
        this.gpa = gpa;
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
    
    public String getClassName() {
        return className;
    }
    
    public void setClassName(String className) {
        this.className = className;
    }
    
    public int getYob() {
        return yob;
    }
    
    public void setYob(int yob) {
        this.yob = yob;
    }
    
    public int getGpa() {
        return gpa;
    }
    
    public void setGpa(int gpa) {
        this.gpa = gpa;
    }
    
    public String getName() {
        String s = this.fullName.trim();
        if (s.contains(" ")) {
            int index = s.lastIndexOf(" ");
            return s.substring(index + 1);
        }
        return s;
    }
    
    @Override
    public int compareTo(Student o) {
        
        return this.getName().compareTo(o.getName());
    }
    
}
