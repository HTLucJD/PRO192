
package main;

import data.RightTriangle;
import data.Triangle;


public class WS4 {

   
    public static void main(String[] args) {
        playWithTriangles();
    }
    
    public static void playWithTriangles() {
        Triangle t1 = new Triangle("TÍA", "PINK", 3, 4, 5);
        t1.paint();
        
        RightTriangle rt1 = new RightTriangle("MÁ", "PINK", 6, 8);
        rt1.paint();
        
        //câu chú ý, Khai Cha new Con - kế thừa
        Triangle rt2 = new RightTriangle("BÉ NA", "RAINBOW", 6, 8.0);
        //      TG một là hình TGV
        rt2.paint();//xài Cha, nhưng lúc CHẠY THÌ ƯU TIÊN GỌI CON
        
    }
    
}
