
package varnfun;

import java.util.Scanner;

/**
 *
 * @author ACER
 */
public class VarNFun {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n = getAPositiveInteger();
        System.out.println("Your number: " + n);
        //printIntegerList(n);
        //playWithBoolean();
        //playWithCharacters();
        //playWithDouble();
        //playWithIntegers();
        //playWithVariables();
    }
    
    public static int getAPositiveInteger() {
       int n;
       Scanner banPhimCuaTui = new Scanner(System.in);
       System.out.print("Input a positive integer: ");
       n = banPhimCuaTui.nextInt();
        return n;
    }
    
    //Hiện tượng 1 class bất kì chứa nhiều hàng trùng tên nhưng khác phần tham sô
    //đầu vào, mà phải khác trên data type chứ không phải khác trên biến 
    //ĐƯỢC GỌI LÀ OVERLOAD/OVERLOADING - quá tải hàm
    //vs. OVERRIDE
    //POLYMORPHISM -> ĐA HÌNH
    public static void printIntegerList(int n) {
         System.out.println("The list of " + n + " first integers: ");
   
        for (int i = 1; i <= n; i++) {
            System.out.print(i + " ");
        }
        System.out.print("\n");
    }
    
    public static void printIntegerList() {
        System.out.println("The list of 100 first integers: ");
        //System.out.println("1 2 3 4 5 6 7 8 9 10...");
        for (int i = 1; i <= 100; i++) {
            System.out.print(i + " ");
        }
    }
    
    public static void playWithBoolean() {
        //C: đúng, sai 0
        //Java: đúng: true, sai: false
        boolean marriedStatus = false;
        if (marriedStatus == true)
            System.out.println("Đánh đòn có địch mới vui");
        else
            System.out.println("Vườn hồng có lối nhưng chưa ai vào");
    }
    
    public static void playWithCharacters() {
        //2 byte cho kiểu chả, lưu bảng mã Unicode
        char m = '$';
        System.out.println("unit: " + m);
        
        String name = "Huỳnh Tấn Lực";  //loại data type mới hoàn toàn
                                        //phúc tạp, do gom n thứ khác
                                        //object data type
        System.out.println("My name is: " + name);
        System.out.println("My 1st letter of my name: " + name.charAt(0));
        System.out.println("My name as in a lowercase: " + name.toLowerCase());
    }
    
    public static void playWithDouble() {
        double pi = 3.14;
        System.out.println("pi: " + pi);
        System.out.printf("pi: %2f\n", pi);//cấm tuyệt đối không dùng lf
        float vat = 0.1F;
        System.out.println("vat: " + vat);
    }
    
    public static void playWithIntegers() {
        int n = 39; //mọi con số, kí tự xuất hiện trong code được gọi là
                    //literal value
                    //số nguyên xuất hiện trong code mặc định là int
        System.out.println("n: " + n);
        
        long m = 3_000_000_000L;
        System.out.println("m: " + m);
        
        int status = 0xFA;  //hệ 16
        System.out.println("status: " + status);
        
        int phone = 010;    //0 trong hệ 8
        System.out.println("phone: " + phone);
        
    }
    
    //static thì chỉ chơi với static - OOP
    public static void playWithVariables() {
        //biến là 1 vùng ram được đặt tên, chiếm 1 số byte nhất định tùy loại
        //dữ liệu/thông tin mà nó sẽ chứa bên trong - data type
        int age = 19;
        int a = 10, b;
        b = 100; 
        
        System.out.println("age: " + age); 
        
        int yob = 2004;
        age = 2023 - yob;
        
        System.out.println("age again: " + age); 
        
        System.out.println("age by using transitive tech: " + (2023 - yob));
        
        System.out.printf("age printed by using %% as in C: %d\n", (2023 - yob));
    }
}
