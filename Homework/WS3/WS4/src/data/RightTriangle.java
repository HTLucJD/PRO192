
package data;

//1. Đọc được câu IS-A 1 chiều, TGV là phiên bản đb của 1 TG (2 cạnh vuông)
//  extends 
//2. Đặc tính của class Con. Nếu Con trùng hết đặc tính với cha, ko cần làm gì
//3.Tạo phễu cho Con, nhớ giữ bản sắc
//4. Thích thì độ Con
public class RightTriangle extends Triangle {

    public RightTriangle(String owner, String color, double a, double b) {
        super(owner, color, a, b, Math.sqrt(a * a + b * b));
    }

    @Override
    public void paint() {
        System.out.printf("|R.TRIANGLE|%-15s|%-10s|%4.1f|%4.1f| -  |%7.2f|\n",
                                                owner, color, a, b, getArea());
    }
    
}
