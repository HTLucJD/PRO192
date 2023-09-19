
package data;


public abstract class Shape {
    protected String owner;
    protected String color;
    protected String borderColor;
    //protected double a, b, c,  radius;
    //ko được đưa cá cạnh vào đây
    //tròn, ngoài bk, thừa kế luôn cả cạnh
    //DỊ BIỆT PHẢI Ở TỪNG ĐỨA CON
    
    //diện tích và chu vi là derived field được tính từ thằng khác 

    public Shape(String owner, String color, String boderColor) {
        this.owner = owner;
        this.color = color;
        this.borderColor = boderColor;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getBorderColor() {
        return borderColor;
    }

    public void setBorderColor(String borderColor) {
        this.borderColor = borderColor;
    }

    @Override
    public String toString() {
        return "Shape{" + "owner=" + owner + ", color=" + color + ", boderColor=" + borderColor + '}';
    }

    
    public abstract double getArea();
    public abstract double getPerimeter();
    //ta chỉ nói rằng HH có thứ này, còn mỗi đứa 
    
    public abstract void paint();
    
    
    //CHA LÀ NHÂN TỬ CHUNG CỦA CÁC CON
    //ABSTRACT: KHÁI NIỆM, NÓI THOY, CHƯA CẦN CỤ THỂ
    //ABSTRACT CLASS: LÀ SỰ PHÂN LOẠI TRONG CUỘC SỐNG, TRONG TỰ NHIÊN
    //                        ĐỂ DỄ DÀNG NÓI CỀ OBJECT . XẢY RA NHIỀU TRONG CUỘC SỐNG
    
//    public double getArea() {
//        
//    }
//    
//    //HH cần có S như là khái niệm, nói rằng thứ nào chiếm bề mặt
//    
//    public double gePerimeter() {
//        
//    }
    
}
