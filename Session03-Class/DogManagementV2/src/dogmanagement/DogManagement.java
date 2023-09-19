
package dogmanagement;

import data.Dog;


public class DogManagement {

    public static void main(String[] args) {
        
        Dog chiHu = new Dog("CHI HU HU", 2021, 0.5);
  //     biến/tên tắt   obj
        chiHu.bark();
        
        Dog ngaoDa = new Dog("NGÁO ĐÁ", 2020, 50.0);
        ngaoDa.bark();
        
        System.out.println("After overweight");
        chiHu.setWeight(5);
        chiHu.bark();
        
        System.out.println("Show all info by using toString() a new behavior");
        String chDetails = chiHu.toString();
        System.out.println("CH details: " + chDetails);
        System.out.println("NĐ details: " + ngaoDa.toString());
        
        System.out.println("Play with toString() - GỌI THẦM TÊN EM");
        System.out.println(chiHu); //chiHu là biến pbject, lưu tọa độ vùng new
                                     //lí thuyết in ra địa chỉ, thực tế thì gọi toString() ngầm   
        System.out.println(ngaoDa); 
        //NẾU KHUÔN KO CÓ HÀM TOSTRING() THÌ MẶC NHIÊN KHI NÓ ĐƯỢC TRIỆU GỌI( GỌI THẦM
        //HAY GỌI TRỰC TIẾP, JVM, SẼ TỰ ĐỘNG BẤM CÁI VÙNG RAM CỦA OBJECT THÀNH CON SỐ HEXA
        //ĐẠI DIỆN CHO VALUE VÙNG RAM
        //HASH NUMBER, NÉN TOÀN BỘ DATA THÀNH 1 CON SỐ, MD5, SHA-256
        //xem tuổi của 1 object, tương tác, hỏi đáp, giao tiếp với object qua dấu chấm
        System.out.println("Get age");
        System.out.println("NĐ age: " + ngaoDa.getAge());
        
    }                               
    
}
