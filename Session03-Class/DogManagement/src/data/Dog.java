/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package data;

//Khuôn dùng để đúc ra các object, đối tượng cần lưu trữ info, thứ
//làm ra để bán
//Khuôn phải kín, có phễu để chế/rót/hứng/đổ vào cái data, nguyên liệu
public class Dog {
    //chứa đặc điểm, chi tiết mà cái khuôn, object tương lai sẽ có
    //Khuôn design ra sao, mai mốt object có thể
    public String name;
    private int yob;
    private double weight;
    
    //Có khuôn thì phải có phễu/miệng loe để hứng vật liệu đi vào
    //phễu dùng để nhận vật liệu đúc ra, tạo ra, construct cái object
    public Dog(String iName, int iYob, double iWeight) {
        name = iName;
        yob = iYob;
        weight = iWeight;
    }
    //hàm gọi n lần tương đương các hành đọng mà obj nào đó lặp đi lặp lại
    //hành động của obj gọi n lần trên obj đó
    public void bark() {
        //System.out.println("GOGOGO...my name is " + name);
        //System.out.println("GOGOGO...my yob is " + yob);
        System.out.printf("|%-10s|%4d|%4.1f|\n", name, yob, weight);
    }
    
    //thay đổi info đã từng đúc cho mình
    public void setNewWeight(double newWeight) {
        weight = newWeight;
    }
    
    public int getYob() {
        return yob;
    }
    
}

//code bên ngoài giống Khuôn bị lủng
//ENCAPSULATION: TÍNH ĐÓNG GÓI CỬA THÔNG TIN VÀ HÀNH ĐỘNG
//HÀM BIẾN ĐI KÈM CỚI ĐẠI DIỆN, MÔ TẢ CHO 1 OBJ, THỰC THỂ (SỐNG)