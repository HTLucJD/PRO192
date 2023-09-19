
package data;

//hình vuông là phiên bản đặc biệt của HCN, độ lại tí
//ko mất đi bản sác HCN 4 goc vuông
//HV là sự sự mở rộng, nâng cấp, đặc biệt hóa, phiên bản mới
//Cách chế tạo Khuôn mới từ Khuôn cũ, kế thừa
//KO PHẢI LÀ COPY&PASTE 

public class Square extends Rectangle {
                                              //trade-off
    public Square(String owner, String color, double edge) {
        super(owner, color, edge, edge);
    }   //~~~new Rectangle( o, c, w, l);
        //new HV chính là new 1 phiên bản HCN
        //cắt 1 HV bản chất chính cắt 1 HCN
        //  có color, own, cạnh -> HCN dưới dạng HV cũng thế mà
//    private String owner;
//    private String color;
//    private double edge;
    //VỀ LÍ XONG KHUÔN VUÔNG, VÌ ĐỔ DATA NHƯ TRUYỀN THÔNG, DÙNG LẠI HẾT CỦA HCN
    //KHÔNG CẦN CODE LẠI
    
    
    @Override   //DÍNH ĐỄN 1 KHÁI NIỆM GỌI LÀ TÍNH ĐA HÌNH, ĐA XẠ, ĐA KẾ THỪA
    //POLYMORPHISM
    //HIỆN TƯỢNG CON QUA MẶT CHA, THỂ HIỆN BẢN SẮC CỦA CON
    public void paint() {
        System.out.printf("|SQUARE    |%-15s|%-10s|%4.1f|  -  |%7.2f|\n",
                            owner, color, width, getArea());
    }

//CON XÀI TẤT CẢ NHỮNG GÌ CHA CÓ, CHA CÓ THÊM, CON CÓ THÊM, CHA BỚT, CON BỊ BỚT
//KẾ THỪA/DI TRUYỀN/CHO CON - INHERITE

//BIẾN DỊ, CON KHÁC. THÊM MỚI MÀ CHA KO CÓ, KO PHẢI OVERRIDE (XIN PHÉP CHA CON LÀM
//THEO KIỂU GIỐNG CHA, TÊN HÀM GIỐNG, ĐỂ CON PHÁT NGÔN THAY)
//    
  
    
}
