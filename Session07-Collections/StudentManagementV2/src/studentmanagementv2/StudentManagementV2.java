
package studentmanagementv2;

import data.Cabinet;


public class StudentManagementV2 {

    public static void main(String[] args) {
        Cabinet se = new Cabinet();
        se.addAStudent();
        se.addAStudent();   
        se.printStudentList();
        se.updateAStudent();
        se.printStudentList();
//        se.searchAStudent();
//        se.searchAStudent();
    }
    
    
//    public static void main(String[] args) {
//       Cabinet se = new Cabinet();
//        System.out.println("INPUT SE STUDENT(S)");
//       se.addAStudent();
//       
//       System.out.println("INPUT IA STUDENT(S)");
//       Cabinet ia = new Cabinet();
//       ia.addAStudent();
//       ia.addAStudent();
//       
//        System.out.println("SE MAJOR");
//        se.printStudentList();
//        
//        System.out.println("IA MAJOR");
//        ia.printStudentList();
//    }
    
}
