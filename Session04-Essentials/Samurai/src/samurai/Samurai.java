/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package samurai;

import java.util.Scanner;

/**
 *
 * @author ACER
 */
public class Samurai {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //inputProfile();
        inputProfileXinXo();
    }

    public static void inputProfileXinXo() {
        //ko OOP, chỉ cần hiểu về nhập info trước đã, ko chơi class Student
        String name, address;
        int yob;
        Scanner sc = new Scanner(System.in);

        System.out.print("Input name: ");
        name = sc.nextLine().toUpperCase();

        while (true) {
            try {
                System.out.print("Input yob: ");
                yob = Integer.parseInt(sc.nextLine());
                break;
            } catch (Exception e) {
                System.out.println("Do ku know to input a positive number?");
            }
           
        }

        System.out.print("Input address: ");
        address = sc.nextLine().toUpperCase();

        System.out.println("Here isH your profile");
        System.out.println("Name: " + name);
        System.out.println("Yob: " + yob);
        System.out.println("Address: " + address);
    }

    public static void inputProfile() {
        //ko OOP, chỉ cần hiểu về nhập info trước đã, ko chơi class Student
        String name, address;
        int yob;
        Scanner sc = new Scanner(System.in);

        System.out.print("Input name: ");
        name = sc.nextLine().toUpperCase();

        //mặc đinh JVM J sẽ giết app nếu có cà chớn xảy ra để đảm bảo an toàn cho app, xử lí data
        //đưa cho ta 1 cơ chế tự xử khi có cà chớn, chuyển quyền chết chóc cho mình
        //báo JVM biết đừng giết, tao tự xử, nhốt các lệnh cà chớn lại, SANDBOX
        try {
            //lệnh cà chớn nằm here
            String tmpNum = sc.nextLine();
            yob = Integer.parseInt(tmpNum);
            //nextLine() hốt sạch buffer, loại bỏ enter, còn chuỗi số -> số 
            //alt - shift - f
        } catch (Exception e) {
            //CPU sẽ chạy đến chỗ này, khi có cà chớn xảy ra
            //JVM ko giết  app như truyền thống
            //chỗ này là chỗ xử lí hậu quả cà chớn
            //ko có cà chớn thì ko vào đây
            //e chính là lá thư/msg mày đỏ JVM gửi cho mình báo rằng có lỗi cà chớn nè
            //làm gì thì làm
            //Exception e = new Exception(nội dung lỗi màu đỏ đây nè...);
            //về lí: e.xem lỗi, xử lí tự mình
            //xử lí sao??? nhiều cách: default value(ko hay)
            //                          hay: bắt nhập lại
            yob = 69;
        }

        System.out.print("Input yob: ");
        //yob = sc.nextInt();//convert data từ bàn phím - là chuỗi thành số

        //sc.nextLine();
        System.out.print("Input address: ");
        address = sc.nextLine().toUpperCase();

        System.out.println("Here isH your profile");
        System.out.println("Name: " + name);
        System.out.println("Yob: " + yob);
        System.out.println("Address: " + address);
    }

}
