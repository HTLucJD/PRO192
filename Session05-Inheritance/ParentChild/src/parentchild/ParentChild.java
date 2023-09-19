/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
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
        
        Child c1 = new Child("NHÀ PHỐ", "100ETH");
        c1.showProfile();
        
        c1.sayHi();
        
        Parent c2 = new Child("CĂN HỘ CAO CẤP", "DOGECOIN");
        c2.sayHi();
        //Chỉ xổ ra những gì của Cha, ko xổ của riêng Con
        //riêng con có 2 thứ: @ và khác biệt hoàn toàn
    }   
    
}
