
package parentchild;

import data.Child;
import data.Parent;

/**
 *
 * @author ACER
 */
public class ParentChild {

    
    public static void main(String[] args) {
        playWithParentNChild();
    }
    
    public static void playWithParentNChild() {
        Parent p = new Parent("BIỆT THỰ", "100BTC");
        p.showProfile();
        
        Child c1 = new Child("NHÀ PHỐ", "100ETH", "DU THUYỀN");
        c1.showProfile();
        c1.sayHi();
        
        Parent c2 = new Child("CĂN HỘ CAO CẤP", "DOGECOIN", "MOTOR");
        c2.showProfile();
        
        //kéo giãn con trỏ Cha > xuống đến đáy new Child()
        //cần con trỏ tạm để lấy được cái đáy new Child()
        Child x = (Child)c2;    //cần trỏ vùng new Child()
        x.sayHi();
        
        //K cần dùng con trỏ tạm
        //(Child)c2.    //DO DẤU CHẤM QUÁ MẠNH, CHẤM SÁT AI THÌ CƯ XỬ THEO TYPE ĐÓ
        //ÉP XONG RỒI MỚI CHẤM, THAY ĐỔI ĐỘ ƯU TIÊN
        ((Child)c2).sayHi();
        
    }   
    
}
