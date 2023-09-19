
package data;


public class Triangle {
    protected String owner;
    protected String color;
    protected double a, b, c;
    private double p;

    public Triangle(String owner, String color, double a, double b, double c) {
        this.owner = owner;
        this.color = color;
        this.a = a;
        this.b = b;
        this.c = c;
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

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }
    
    public double getArea() {
        p = (a + b + c) / 2;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }

    @Override
    public String toString() {
        return "Triangle{" + "owner=" + owner + ", color=" + color + ", side1=" + a + ", side2=" + b + ", side3=" + c + '}';
    }
    
    //có 1 bộ thư viện, đồ chơi, class khác đưa vào dùng kèm 
    //thư viện mang tên LOMBOK
    
    public void paint() {
        System.out.printf("|TRIANGLE  |%-15s|%-10s|%4.1f|%4.1f|%4.1f|%7.2f|\n",
                                                owner, color, a, b, c, getArea());
    }
}
