
package data;

//1. IS A xuất hiện 1 chiều extends, chuẩn bị xài lại hen, ko có tự làm
//2. Khai báo các đặc điểm. Lưu ý:
//  2.1 Nếu COn trùng hết với Cha, ko cần làm lại, Cha sẽ làm cho
//  2.2 Con có đồ triêng, làm riêng, giấu Ba, liệu rằng Ba biết không?
//3. Làm phễu, giữ bản sắc cho Con
public class Child extends Parent {
    
    public Child(String assetOne, String assetTwo) {
        super(assetOne, assetTwo);
        
       
    }
    
    @Override
    public void showProfile() {
        System.out.println("CHILD > asset1: " + assetOne + "; asset2: " + assetTwo);
    //KHAI CON = NEW CON, xổ hết của Cha + xổ của riêng Con
    } 
    
    public void sayHi() {
        System.out.println("Hey, I am a rich kid");
    }
}
