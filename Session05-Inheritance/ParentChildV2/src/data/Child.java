
package data;

//1. IS A xuất hiện 1 chiều extends, chuẩn bị xài lại hen, ko có tự làm
//2. Khai báo các đặc điểm. Lưu ý:
//  2.1 Nếu COn trùng hết với Cha, ko cần làm lại, Cha sẽ làm cho
//  2.2 Con có đồ triêng, làm riêng, giấu Ba, liệu rằng Ba biết không?
//3. Làm phễu, giữ bản sắc cho Con
public class Child extends Parent {
    
    private String assetThree;

    public Child(String assetOne, String assetTwo, String assetThree) {
        super(assetOne, assetTwo);
        this.assetThree = assetThree;
    }

    public String getAssetThree() {
        return assetThree;
    }

    public void setAssetThree(String assetThree) {
        this.assetThree = assetThree;
    }
        
       
    @Override
    public void showProfile() {
        System.out.println("CHILD > asset1: " + assetOne +
                                 "; asset2: " + assetTwo + 
                                 "; asset3: " + assetThree);
    } 
    
    public void sayHi() {
        System.out.println("Hey, I am a rich kid");
        System.out.println("By the way , my 3rd asset is " + assetThree);
    }
    //KHAI CHA NEW CON CHỈ XỔ CỦA CHA, KO CHỊU XỔ PHẦN KHÁC BIỆT
    //muốn xổ tất, kĩ thuật tổ lái con trỏ
   
}
