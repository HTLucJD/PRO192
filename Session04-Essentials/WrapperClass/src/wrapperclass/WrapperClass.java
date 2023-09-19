package wrapperclass;

public class WrapperClass {

    public static void main(String[] args) {
        //playWithIntegers();
        //playWithIntegerPointers();
        playWithPool();
    }
    
    public static void playWithPool() {
        Integer num1 = 2001;
        Integer num2 = 2001;
        System.out.println("num1 vs num2: " +(num1 ==num2));
        System.out.println("num1 vs num2 (core): " + num1.equals(num2));
        if (num1.equals(num2))
            System.out.println("2 thằng bằng nhau trong lõi");
        else
            System.out.println("Đến cả lõi còn khác nhau");
        
        Integer num3 = 100;
        Integer num4 = 100;
        //Integer pool hồ bơi cho vùng new lõi có giá trị nằm trong đoạn
        //[-128 -> +127]
        System.out.println("XEM VI DIỆU!!!!!");
        System.out.println("num3 vs num4: " + (num3 == num4));
        
        //RIÊNG CHO BOXING TỪ -128 -> +127 thì
        //gói những thằng primitive/boxing trong đoạn này thì chúng
        //chỉ xài 1 vùng new chung nếu chung lõi
    }
    
    public static void playWithIntegerPointers() {
        Integer num1 = new Integer("2003");
        Integer num2 = new Integer(2003);
        Integer num3 = 2004;
        boolean result = num1 == num2;
        System.out.println("num1 == num2 ??" + result);
        //KẾT LUẬN: KO SO SÁNH 2 BIẾN OBJECT DÙNG TOÁN TỬ TRUYỀN THỐNG > >= < <= == !=
        //VÌ BIẾN OBJECT BẢN THÂN NÓ CHỈ LÀ TỌA ĐỘ THAM CHIẾU 1 VÙNG NEW CÓ NHIỀU INFO 
    
        Integer num4 = 2003;
        System.out.println("num3 vs num4 (core value): " + num3.equals(num4));
        System.out.println("num3 vs num4 (core value): " + num3.compareTo(num4));
        
    }   
    
    public static void playWithIntegers() {
        int num0 = 2003;    //tốn 1 vùng ram 4 byte 
        Integer num1 = new Integer("2004"); //2 vùng ram, con trỏ và new

        Integer num2 = new Integer(2005);
        Integer num3 = 2006;    //cách viết tiện nhất, gọn nhất, tự nhiên nhất
        //thực tế vẫn new Integer(2003);
        //cách ta lấy con số literal (số xuất hiện trong code) chính là primitive
        //gói lại thành 1 vùng new mà nhân chính là primitive,
        //cách này được gọi là ĐÓNG GÓI/ĐÓNG HỘP PRIMITIVE - BOXING A PRIMITIVE VALUE
        //BOXING: PRIMITIVE -> WRAPPER OBJECT, THỨ ĐƯỢC ĐÓNG GÓI

        //sd như bt
        System.out.println("num0: " + num0);   //xài trực tiếp
        System.out.println("num1: " + num1);
        System.out.println("num2: " + num2.toString());   //mở hộp lấy value int
        System.out.println("num3: " + num3.intValue());   //ra xài, UNBOXING

        int num4 = num1;//HIỆN TƯỢNG MỞ HỘP, KO PHẢI ÉP KIỂU
        //UMBOXING: TỪ OBJECT -> PRIMITIVE
        //MỞ VÙNG NEW LẤY VALUE/NHÂN/LÕI GỐC PRIMITIVE
        System.out.println("num4: " + num4);

        Integer num5 = num0;//boxing, new ngầm Integer(2003)
        System.out.println("num5: " + num5);

        num0 = 20210726;
        System.out.println("num0 again: " + num0);
        num5 = 20210711;
        //biến Integer mỗi lần = value mới primitive => new Integer(value mới); 

        //VÙNG INTEGER ĐƯỢC NEW KO CÓ HÀM SET() CHỈ CÓ HÀM GET()
        //MÚN THAY ĐỔI NHÂN/LÕI, NEW MỚI ĐI
        //INTEGER LÀ OBJECT READ-ONLY
        //CLASS KO CÓ HÀM SỬA, CHỈ NEW XONG XÀI VALUE ĐÃ ĐỔ MÃI MÃI, ĐỔ 1 LẦN
        //KO SỬA, READ-ONLY OBJECT, ĐỌC ĐÚNG CHUẨN : IMMUTABLE CLASS/OBJECT
        
    }
    //CÓ 8 CÁI CLASS TRAI BAO, WRAPPER CLASS (IMMUTABLE CLASS)
    //Byte, Short, Integer, Long, Float, Double, Boolean, Character
}
