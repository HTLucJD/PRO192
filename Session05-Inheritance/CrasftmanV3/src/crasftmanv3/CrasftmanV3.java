package crasftmanv3;

import data.Disk;
import data.Rectangle;
import data.Shape;
import data.Square;
import data.Triangle;

public class CrasftmanV3 {

    public static void main(String[] args) {
        //playWithShape();
        //sortShapes();
        //playWithAnonymousClass();
        sortShapesWithAnonymous();
    }
    
    public static void sortShapesWithAnonymous() {
        
        //Anonymous here!!!
        Shape onTheGo = new Shape("THIS-TUI", "RANDOM", "RANDOM") {
            @Override
            public double getArea() {
            return 50;
            }
            
            @Override
            public double getPerimeter() {
            return 40;
            }
            
            @Override
            public void paint() {
                System.out.printf("|%-10s|%-10s|%-10s|%-10s|%4s|%4s|%7.2f|\n",
                                    "TAKE-AWAY", owner, color, borderColor, " ", " ", getArea());
            }
        };
        
        Rectangle r1 = new Rectangle("TÍA", "PINK", "MAGENTA", 5, 6);
        Shape r2 = new Rectangle("TÍA", "MAGENTA", "PINK", 6, 5);

        Square s1 = new Square("MÁ", "PINK", "MAGETA", 7);
        Rectangle s2 = new Square("MÁ", "PINK", "MAGETA", 8);
        Shape s3 = new Square("MÁ", "PINK", "MAGETA", 9);

        Disk d1 = new Disk("BÉ NA", "RAINBOW", "BORDEAUX", "<3", 6);
        Shape d2 = new Disk("BÉ NA", "RAINBOW", "BORDEAUX", ":X", 6);

        Triangle t1 = new Triangle("GHỆ BÉ NA", "RAINBOW", "BORDEAUX", 3, 4, 5);
        Shape t2 = new Triangle("GHỆ BÉ NA", "RAINBOW", "BORDEAUX", 6, 8, 10);


        Shape box[] = new Shape[]{r1, r2, s1, s2, s3, d1, d2, t1, t2, onTheGo};

        System.out.println("The list of shapes");
        for (Shape x : box) {
            x.paint();
        }

        for (int i = 0; i < box.length - 1; i++) {
            for (int j = i + 1; j < box.length; j++) {
                if (box[i].getArea() > box[j].getArea()) {
                    Shape t = box[i];
                    box[i] = box[j];
                    box[j] = t;
                }
            }
        }
        

    System.out.println("After sorting the list of shapes");
        for (Shape x : box) {
            x.paint();
        }

}
    
    //kĩ thuật tạo object vùng new mà không cần Khuôn cụ thể
    //danhuf cho những object vô định hình ko có công thức tính toán
    //và nhân bản, ko có khuôn cố định, cắt hình ngẫu nhiên nhưng 
    //vẫn là hình gọi là OBJECT VÃNG LAI
    //DÙ LÀ HÌNH KIỂU GÌ, CÔNG THỨC CHUNG: NEW CHA/SUPER CHA + @OVERRIDE
    public static void playWithAnonymousClass() {
        Shape vangLai = new Shape("CHÍNH MÌNH", "GREEN", "BLUE") {
            @Override
            public double getArea() {
                return 50;  //vì hình cụ thể, ko theo hình dạng ta đo bằng tay
            }
            
            @Override
            public double getPerimeter() {
                return 40;
            }
            
            @Override
            public void paint() {
                System.out.printf("|NGẪU NHIÊN|%-10s|%-10s|%-10s|%4.1f|\n", owner, color, borderColor, getArea());
            }
        };  //VIP
        //thoải mái vào mảng Shape sort nếu muốn
        //CÔNG THỨC CON = NEW CHA + @OVERRIDE
        //CHỈ XÀI CÁCH NÀY CHỈ CẦN LÀM 1 OBJECT ON THE GO, MÀ LÀM BIẾNG LÀM KHUÔN
        //CON RIÊNG LẺ, THEO CÔNG THỨC NHÂN BẢN
        
        vangLai.paint();
        
    }
    
    public static void sortShapes() {
        Rectangle r1 = new Rectangle("TÍA", "PINK", "MAGENTA", 5, 6);
        Shape r2 = new Rectangle("TÍA", "MAGENTA", "PINK", 6, 5);

        Square s1 = new Square("MÁ", "PINK", "MAGETA", 7);
        Rectangle s2 = new Square("MÁ", "PINK", "MAGETA", 8);
        Shape s3 = new Square("MÁ", "PINK", "MAGETA", 9);

        Disk d1 = new Disk("BÉ NA", "RAINBOW", "BORDEAUX", "<3", 6);
        Shape d2 = new Disk("BÉ NA", "RAINBOW", "BORDEAUX", ":X", 6);

        Triangle t1 = new Triangle("GHỆ BÉ NA", "RAINBOW", "BORDEAUX", 3, 4, 5);
        Shape t2 = new Triangle("GHỆ BÉ NA", "RAINBOW", "BORDEAUX", 6, 8, 10);

//        r1.paint();
//        r2.paint();
//        s1.paint();
//        s2.paint();
//        s3.paint();
//        d1.paint();
//        d2.paint();
//        t1.paint();
//        t2.paint();
        //KĨ THUẬT VIẾT CODE TỪ 1 HÀM MÀ CÓ N CÁCH THỂ HIỆN CHẠY KHÁC NHAU
        //KĨ THUẬT NÀY GỌI LÀ TÍNH ĐA XẠ, ĐA HÌNH POLYMORPHISM
//        Shape[] box = new Shape[9];
//        
//        box[0] = r1;
//        box[1] = r2;
//        box[2] = s1;
//        ...
//        Shape[] box = new Shape[]{new Disk(), ...};
        Shape box[] = new Shape[]{r1, r2, s1, s2, s3, d1, d2, t1, t2};

        System.out.println("The list of shapes");
        for (Shape x : box) {
            x.paint();
        }

        for (int i = 0; i < 8; i++) {
            for (int j = i + 1; j < 9; j++) {
                if (box[i].getArea() > box[j].getArea()) {
                    Shape t = box[i];
                    box[i] = box[j];
                    box[j] = t;
                }
            }
        }
        

    System.out.println("After sorting the list of shapes");
        for (Shape x : box) {
            x.paint();
        }

}

    public static void playWithShape() {
        Rectangle r1 = new Rectangle("TÍA", "PINK", "MAGENTA", 5, 6);
        Shape r2 = new Rectangle("TÍA", "MAGENTA", "PINK", 6, 5);
        //((Rectangle)r2).getA();//dị biệt

        Disk d1 = new Disk("MÁ", "PINK", "MAGETA", "<3", 6);
        Shape d2 = new Disk("MÁ", "MAGENTA", "PINK", ":X", 6);

        r1.paint();
        r2.paint();
        d1.paint();
        d2.paint();

        //.PAINT() CHÍNH LÀ POLYMORPHISM, ĐA XẠ ĐA HÌNH ĐÃ XUẤT HIỆN
    }

    }
