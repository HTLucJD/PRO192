
package data;

//1. Thấy có cái IS A, extends
//2. Đặc điểm cho Con, đồng nhất hoặc dị biệt, Con có riêng
//3. Phễu, tôn trọn bản sắc
//4. Vì Cha là abstract, tức là chỉ nói hoy, chưa làm, chung chung thoi
//   nên nếu Con ko chịu làm,b tức là Con cũng chứa hàm abstract, thì Con
// trong tình huống này phải là abstract luôn
//1 CLASS CHỨA HÀM ABSTRACT KO CODE, THÌ CLASS PHẢI LÀ ABSTRACT
//VÌ NÓ TOÀN NÓI ĐIỀU CHUNG CHUNG, DÙ TRONG NÓ VÀI HÀM CÓ CODE

//  Con thauwf kế abstract class, mày có 2 lựa chọn, ko hơn
//  - Hoặc mày abstract, nếu mày ko chịu viết code cho Cha, thừa kế abstract
//                      vậy mày là khái niệm luôn còn gì
//  - Hoặc mày phải voeets code cho hàm abstract của Cha, vì mày đủ info để làm
//      mày là cụ thể rồi, vì mọi thứ trong mày rõ ràng
//      CON VIẾT CODE CHO HÀM CHA, CHA NÓI CON LÀM, IMPLEMENT ABSTRACT METHODS
//      implement the bodyy of Parmethods abstract method


public class Rectangle extends Shape {
 
    protected double a, b;

    public Rectangle(String owner, String color, String boderColor, double a, double b) {
        super(owner, color, boderColor);//Cha phải có trước, dễ bố trí vùng RAM
        this.a = a;
        this.b = b;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    @Override
    public double getArea() {
        return a * b;
    }

    @Override
    public double getPerimeter() {
        return (a + b) * 2;
    }

    @Override
    public void paint() {
        System.out.printf("|RETANGLE  |%-10s|%-10s|%-10s|%4.1f|%4.1f|%7.2f|\n",
                                owner, color, borderColor,a, b, getArea());
    }
    
}
