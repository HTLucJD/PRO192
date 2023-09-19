package luc.util;

import java.util.Scanner;

//đây là Class, Khuôn, chứa, có đặc điểm/hành động/chứa các món đồ chơi dùng chung
//cho mọi nơi - vì nó không nhớ cái gì cho riêng tư của nó
//LIBRARY/FRAMEWORK - chứa các hàm/biến(data) dùng chung cho nhiều công việc khác nhau
//của các dự án khác nhau
public class MyToys {
    //đặc điểm/hành vi là static, cho người ta sờ thì thêm public
    //ko nhớ cái gì của riêng mình
    //Một class bt thì cẫn có thể cừa static vừa non-static
    //Math: hầu hết static
    //String: vừa non-static, vừa có static
    //System: hầu hết static
    public static final double PI = 3.1415;
    //final ~ const bên C, biến ko cho thay đổi value, trừ lần đầu tiên khai báo
    //HẰNG SỐ
    
    private static Scanner sc = new Scanner(System.in);
        
    
    public static int getAnInteger(String inputMsg) {
        int n;//
        
        do {            
            try {
                System.out.println(inputMsg);
                n = Integer.parseInt(sc.nextLine());
                return n;
                
            } catch (Exception e) {
                System.out.println("Do ku know how to input an integer?");
            }
        } while (true);
    }
    
    //trong quá trình làm app, việc nhập số là gặp lại nhiều lần
    //mỗi cú nhập, biến nhập, kèm theo: trôi lệnh, cà chớn - try-catch - do-while
    //tách việc nhập số nguyên thành 1 hàm, gói chửi bới, trôi lệnh nhập lại vào 1 chỗ
    //ta hứng kết quả về từ hàm, lấy để dùng, MyToys nhớ con số này làm gì
    public static int getAnInteger() {
        int n;//
       
        do {            
            try {
                System.out.println("Input an integer: ");
                n = Integer.parseInt(sc.nextLine());
                return n;
                
            } catch (Exception e) {
                System.out.println("Do ku know how to input an integer?");
            }
        } while (true);
    }
}
