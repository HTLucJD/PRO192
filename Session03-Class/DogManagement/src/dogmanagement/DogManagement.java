
package dogmanagement;

import data.Dog;


public class DogManagement {

    public static void main(String[] args) {
        //lấy khuôn Dog ra để bắt đầu đổ info
        //sau khi chờ khô, ta được object thuộc Nhóm vừa đúc
        //dặt tên gọi tắ cho object để dễ dàng nói chuyện, tham chiếu đễn
        Dog chiHu = new Dog("CHI HU HU", 2021, 0.5);
  //     biến/tên tắt   obj
        chiHu.bark();
        
        Dog ngaoDa = new Dog("NGÁO ĐÁ", 2020, 50.0);
        ngaoDa.bark();
        
        System.out.println("After overweight");
        chiHu.setNewWeight(5);
        chiHu.bark();
        
        int chYob = chiHu.getYob();
//        int yob = 2001;
//        System.out.println("yob: " + yob);
//        yob = 2002;
//        System.out.println("yob: " + yob);
    }
    //new xin vùng ram mới đủ chứa info của 1 bạn Dpg sẽ được đúc, được đổ
    //có 1 vùng name dành cho 2 object
    //ND không đè name của CH
}
