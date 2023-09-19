
package crasftman;

import data.Disk;
import data.Rectangle;
import data.Square;


public class Crasftman {

   
    public static void main(String[] args) {
        //cutShapes();
        sortShape();
    }
    
    public static void sortShape() {
        Rectangle r1 = new Rectangle("TÍA", "PINK", 10.0, 2.0);
        Rectangle rectArr[] = new Rectangle[3];
        
        rectArr[0] = r1;
        rectArr[0].paint();
        rectArr[0].setOwner("YÊU TÍA");
        r1.paint();
        
        rectArr[1] = new Rectangle("MÁ", "PINK", 3.0, 4.0);
        rectArr[2] = new Rectangle("A.HAI", "BLUE", 3.0, 3.0);
        
        rectArr[3] = new Square("GHỆ BÉ NA", "RAINBOW", 1.0);
        System.out.println("The list retangles");
        for (Rectangle x : rectArr) {
            x.paint();
        }
        
        System.out.println("Before sorting");
        for (int i = 0; i < 3; i++) {
            rectArr[i].paint();
        }
        
        for (int i = 0; i < 3 - 1; i++) {
            for (int j = i + 1; j < 3; j++) {
                if (rectArr[i].getArea() > rectArr[j].getArea()) {
                    Rectangle t = rectArr[i];
                    rectArr[i] = rectArr[j];
                    rectArr[j] = t;
                }
            }
        }
            
         System.out.println("After sorting ascending by area");
        for (int i = 0; i < 3; i++) {
            rectArr[i].paint();
        }   
    }
        
    
    public static void cutShapes() {
        Rectangle r1 = new Rectangle("TÍA", "PINK", 1.0, 2.0);
        r1.paint();
        
        Square s1 = new Square("MÁ", "PINK", 3);
        s1.paint();
        
        Disk d1 = new Disk("BÉ NA", "RAINBOW", "<3", 2.0);
        d1.paint();
    }       
    
}
