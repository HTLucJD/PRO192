
package studentmanagement;

import data.Student;
import java.util.Scanner;


public class StudentManagement {

   
    public static void main(String[] args) {
        saveStudents();
        //saveAStudent();
        //inputAStudent();

    }
    
    //cần Scanner object bàn phím. OOP cái gì cũng object
        public static void inputAStudent() {
        String id, name;
        int yob;
        double gpa;
        Scanner sc = new Scanner(System.in);
        System.out.print("Input id: ");
        id = sc.nextLine();
        
        System.out.print("Input name: ");
        name = sc.nextLine();
        
        System.out.print("Input yob: ");
        yob = sc.nextInt();
        
        System.out.print("Input gpa: ");
        gpa = sc.nextDouble();
        
        Student x = new Student(id, name, yob, gpa);
        x.showProfile();
    }
    
    //hard-code
    public static void saveStudents(){
        Student an = new Student("SE666789", "AN NGUYỄN", 2004, 8.9);
        Student binh = new Student("SE662204", "BÌNH LÊ", 2003, 0.4);
        an.showProfile();
        binh.showProfile();
        System.out.println("An name (directly): " + an.name);
        //vì sờ được trực tiếp cái name/biến/instance variable, ta có thể get() và set()
        //an.name = "KHÔNG HỌC BÀI";
        Student.name = "CÀY RANK HƠN CÀY CODE";
        System.out.println("Binh name (directly): " + binh.name);
        System.out.println("An name again (directly): " + an.name);
        System.out.println("Student name (directly): " + Student.name);
        an.showProfile();
        
        //sayHi() mà đang static
        System.out.println("Using static ");
        an.sayHi();
        Student.sayHi();//Tên Clas chấm static cì là đồ dùng chung
        
        //2 loại dấu chấm
        //chấm trực tiếp qua tên class tức là chạm sờ STATIC
        //chấm qua con đường new tức là bạn đang hàm ý chơi với non-static
        //đồ riêng của từng object
    }
    
}
