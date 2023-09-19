
package stringclass;


public class StringClass {

    
    public static void main(String[] args) {
        playWithStrings();
    }
    
    public static void playWithStrings() {
        String s1 = new String("HELLO");
        String s2 = new String("HELLO");
        //ko tự nhiên
        String s3 = "HELLO";
        String s4 = "HELLO";
        String s5 = "Hello";
        
        if (s1 == s2)
            System.out.println("s1 bằng s2");
        else
            System.out.println("s1 éo bằng s2");
        System.out.println("s3 vs s4? " + (s3 == s4));
        System.out.println("s2 vs s3? " + (s2 == s3));
        System.out.println("s4 vs s5? " + (s4 == s5));
        
        //KO SO SÁNH 2 OBJECT QUA == MÀ PHẢI CHẤM VÀO BÊN TRONG LẤY VALUE ĐI SO SÁNH
        //CÁC OBJECT NÊN LÀM SẴN HÀM SO SÁNH BÊN TRONG CHÚNG ĐỂ ĐI SO SÁNH
        //VỚI ĐỨA KHÁC
    }
    
}
