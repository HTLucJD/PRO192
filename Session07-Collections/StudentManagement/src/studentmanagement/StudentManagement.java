package studentmanagement;

import data.*;
import java.util.*;

public class StudentManagement {

//    public static void main(String[] args) {
//        //playWithArrayList();
//        //sortArrayListManually();
//        //playWithSet();
////        Student x = getAStudent("se123456");
////        if (x != null)
////        x.showProfile();
////        else
////            System.out.println("NOT FOUND!!!");
//        //sortStudentList();
////        List<Student> result = initData();
////        System.out.println("The student list");
////        for (Student x : result) {
////           x.showProfile();
////        }
//        
//    }

    public static void main(String[] args) {
        List<Student> arr = initData();
        Student xx = SearchAStudent(arr, "SE888888");
        if (xx == null)
            System.out.println("NOT FOUND!!!");
        else {
            xx.showProfile();
            xx.setGpa(6868);
        }
        System.out.println("Check student list after updating info of SE8 student");
        for (Student x : arr) {
            x.showProfile();
            
        }
    }
    
    public static List<Student> initData() {
    //hàm trả về 1 tạo độ cái Túi có sẵn bên trong nhóm SV
        List<Student> arr = new ArrayList();
        arr.add(new Student("SE444444", "BỐN PHẠM", 2004, 4.4));
        arr.add(new Student("SE999999", "CHÍN LÊ", 2009, 9.9));
        arr.add(new Student("SE555555", "NĂM VÕ", 2005, 5.5));
        arr.add(new Student("SE888888", "TÁM LÝ", 2008, 8.8));
        return arr;

    }

    public static Student SearchAStudent(List<Student> arr, String id) {
        
        if (arr.isEmpty())
            return null;
        
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i).getId().equalsIgnoreCase(id))
                return arr.get(i);
        }
        return null;
    }

    public static void sortStudentList() {
        List<Student> arr = new ArrayList();
        arr.add(new Student("SE444444", "BỐN PHẠM", 2004, 4.4));
        arr.add(new Student("SE999999", "CHÍN LÊ", 2009, 9.9));
        arr.add(new Student("SE555555", "NĂM VÕ", 2005, 5.5));
        arr.add(new Student("SE888888", "TÁM LÝ", 2008, 8.8));

        System.out.println("The student list");
        for (Student x : arr) {
            x.showProfile();
        }

        for (int i = 0; i < arr.size() - 1; i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(i).getGpa() > arr.get(j).getGpa()) {
                    Student t = arr.get(i);
                    arr.set(i, arr.get(j));
                    arr.set(j, t);
                }
            }
        }
        System.out.println("The student list after ascending by gpa");
        for (Student x : arr) {
            x.showProfile();
        }

    }

    public static Student getAStudent(String id) {

        List<Student> arr = new ArrayList();
        Student an = new Student("SE123456", "AN NGUYỄN", 2003, 9.0);
        arr.add(an);
        arr.add(new Student("SE999999", "BÌNH LÊ", 2003, 4.9));

        Student tmpStudent = arr.get(0);//lấy tọa độ sv 0
        String tmpId = tmpStudent.getId();//ar.get(0).getId();
        //if (tmpId == id) return tmpStudent;//trả về tọa độ sv 0 
        if (tmpId.equalsIgnoreCase(id)) {
            return tmpStudent;
        }
        return null;
    }

    //Set: là 1 loại giỏ, mà ko cho phép đựng trùng món
    //ko cho phép trỏ trùng vùng new
    public static void playWithSet() {
        Set<Student> arr = new HashSet();

        Student an = new Student("SE123456", "AN NGUYỄN", 2003, 9.0);
        arr.add(an);
        arr.add(an);//add trùng
        arr.add(new Student("SE999999", "BÌNH LÊ", 2003, 4.9));
        arr.add(new Student("SE999999", "BÌNH LÊ", 2003, 4.9));
        //CÓ NEW CÓ VÙNG RAM MỚI, OBJECT MỚI, TRÙNG INFO BÊN TRONG NEW
        //ÉO PHẢI VẤN ĐỀ
        //SET LÀ KO CHẤP NHẬN CON TRỎ TRÙNG VÙNG NEW
        System.out.println("The student list");
        for (Student x : arr) {
            x.showProfile();
        }
    }

    //ta tự tay sort danh sách sinh viên làm bằng tay
    //còn 1 cơ chế ta ko dùng vòng for tự viết
    //hàm static: Collections.sort() //dùng interface mới được
    public static void sortArrayListManually() {
        List<Student> arr = new ArrayList();
        arr.add(new Student("SE123456", "AN NGUYỄN", 2003, 9.0));
        arr.add(new Student("SE999999", "BÌNH LÊ", 2003, 4.9));

        System.out.println("The student list");
        for (Student x : arr) {
            x.showProfile();
        }

        Student t = arr.get(0);
        arr.set(0, arr.get(1));
        arr.set(1, t);
        System.out.println("The student list after sorting ascending by gpa");
        for (Student x : arr) {
            x.showProfile();
        }

        arr.remove(1);
        System.out.println("The student list after removing a student");
        for (Student x : arr) {
            x.showProfile();
        }

    }

    public static void playWithArrayList() {
        List<Student> arr = new ArrayList();

        Student s1 = new Student("SE123456", "AN NGUYỄN", 2003, 9.0);
        Student s2 = new Student("SE123457", "BÌNH NGUYỄN", 2003, 9.0);

        arr.add(s1);//add vô tận, new cứ nằm ở HEAP
        arr.add(s2);
        arr.add(new Student("SE99999", "CHÍN PHẠM", 2003, 9.0));

        System.out.println("The bag has: " + arr.size() + " món đồ");
        System.out.println("The student list");
        Student xx = arr.get(0);
        xx.showProfile();

        arr.get(1).showProfile();

        System.out.println("In xịn sò");
        for (Student x : arr) { //ko sợ NUL POINTER add đến đâu them con troe đến đó
            //x = arr.get(i) = arr[i]
            x.showProfile();
        }

        System.out.println("In xịn sò for truyền thống");
        for (int i = 0; i < arr.size(); i++) {
            arr.get(i).showProfile();
        }

    }

}
