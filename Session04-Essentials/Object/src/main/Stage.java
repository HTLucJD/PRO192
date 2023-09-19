package main;

import data.Student;

public class Stage {

    public static void main(String[] args) {
        Student ahihi = checkObjectV8();//ahihi lưu tọa độ của AN trong hàm thảy ra ngoài
        ahihi.showProfile();
    }   
    
    //hàm trả về 1 tọa độ của object nào đó, vì trả được tọa độ nghĩa là
    //sờ được object, có tọa độ chấm là tới object
    //            Student = x;  
    public static Student checkObjectV8() {
        Student x;
        x = new Student("SE666789", "AN NGUYỄN", 2004, 8.9);
        return x;//x lưu tọa độ vùng clone AN, 
                 //thảy tọa độ đó cho tên hàm, tên hàm là 6M
        
    }
    
    public static void checkObjectV7() {
        Student x;//khai báo biến, khai báo con trỏ nhưng chưa trỏ ai
        x = new Student("SE666789", "AN NGUYỄN", 2004, 8.9);
        
        
    }
    
    public static void checkObjectV6() {
        //object không có tên gọi, vẫn hành xử được
        //Student s1 = new Student("SE666789", "AN NGUYỄN", 2004, 8.9);
        //đã tương đương toại độ rồi, thảy tọa độ đó đi đâu hoy
        //thảy cho biến object nào đó giữ giùm tọa độ
        //biến đó mà chấm nghĩ là tọa độ chấm, NGHĨA LÀ NEW CHẤM LUÔN
        //vì biến có tọa độ từ new. CHỐT HẠ: NEW NẮM TỌA ĐỘ
        new Student("SE666789", "AN NGUYỄN", 2004, 8.9).showProfile();
        //object vô danh, anonymous object
        
    }
    
    public static void checkObjectV5() {
        //câu chuyện 2 chàng 1 nàng
        Student s1 = new Student("SE666789", "AN NGUYỄN", 2004, 8.9);
        Student x = s1;
        
        s1.showProfile();
        x.showProfile();
        s1.setName("MÌNH CHƠI Ú TÌM HENG");
        //trong vùng clone new AN đã bị thay đổi name thành MÌNH CHƠI...
        System.out.println("After TÁT");
        //hok thèm hỏi s1, hỏi luôn x xem sao
        x.showProfile();
    }
    
    public static void checkObjectV4() {
        Student s1 = new Student("SE666789", "AN NGUYỄN", 2004, 8.9);
        Student x = s1;
        s1 = new Student("SE666788", "LỘC PHÁT", 1998, 8.8);
        //int a= 10; a = 100;
        //s1 là biến object
        //tui cần lắm luôn 1 tọa độ vùng new, vùng clone Student
        x.showProfile();//backup tọa độ new vào biến khác cùng kiểu
        s1.showProfile();
        
    }
    
    public static void checkObjectV3() {
        Student s1 = new Student("SE666789", "AN NGUYỄN", 2004, 8.9);
        s1 = new Student("SE666788", "LỘC PHÁT", 1998, 8.8);
        //int a= 10; a = 100;
        //s1 là biến object
        //tui cần lắm luôn 1 tọa độ vùng new, vùng clone Student
        System.gc();//gom rác vùng HEAP
        s1.showProfile();
        
    }
    
    public static void checkObjectV2() {
        Student s1 = new Student("SE666789", "AN NGUYỄN", 2004, 8.9);
        Student s2 = new Student("SE666789", "AN NGUYỄN", 2004, 8.9); 
        s1.setName("AI RỒI CŨNG KHÁC");
        s1.showProfile();
        s2.showProfile();
    }

    public static void checkObjectV1() {
        Student s1 = new Student("SE666789", "AN NGUYỄN", 2004, 8.9);
        s1.showProfile();

        Student x = s1;

        s1 = new Student("SE666788", "BÌNH LÊ", 1998, 8.8);
        s1.showProfile();

        System.out.println("AN after s1 từ chối chơi: ");
        x.showProfile();

        //VI DIỆU, HẮC NÃO 1 TÍ
        new Student("SE666789", "ĐẠI GIA", 2003, 9.9).showProfile();
    }
}
