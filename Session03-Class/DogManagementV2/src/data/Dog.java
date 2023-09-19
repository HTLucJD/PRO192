
package data;


public class Dog {
    
    public String name;
    private int yob;
    private double weight;

    public Dog(String name, int yob, double weight) {
        this.name = name;
        this.yob = yob;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYob() {
        return yob;
    }

    public void setYob(int yob) {
        this.yob = yob;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
    
    public void bark() {
        //System.out.println("GOGOGO...my name is " + name);
        //System.out.println("GOGOGO...my yob is " + yob);
        System.out.printf("|%-10s|%4d|%4.1f|\n", name, yob, weight);
    }

    @Override
    public String toString() {
        //return "Dog{" + "name=" + name + ", yob=" + yob + ", weight=" + weight + '}';
        //String tmpMsg = String.format("|GOGO|%-10s|%4d|%4.1f|", name, yob, weight);
        return String.format("|GOGO|%-10s|%4d|%4.1f|", name, yob, weight);        
    }
        
    public int getAge() {
        return 2023 - yob;
    }
    //viết code kiểu này gọi là hard-code, fix value, năm sau phải sửa
    //chuẩn: lấy giờ hệ thống Windows - yob;
}

 