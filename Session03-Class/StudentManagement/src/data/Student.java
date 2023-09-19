    
package data;


public class Student {
    private static String id;//nằm ở 1 vùng nhớ riêng, mà object nào cũng xài ké, chung
    public static String name;// vùng nhớ xài chung cho các object cùng Nhóm//Class
                              //dữ liệu đổ vào hay chỉnh sửa theo thằng cuối cùng
    //CHỐT HẠ: KO DÙNG STATIC CHO NHỮNG THỨ/ĐĐ/HÀM MÀ CỦA RIÊNG TỪNG OBJECT
    
    public int yob;
    private double gpa;

    public Student(String id, String name, int yob, double gpa) {
        this.id = id;
        this.name = name;
        this.yob = yob;
        this.gpa = gpa;
    }
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    @Override
    public String toString() {
        return String.format("|%8s|%-25s|%4d|%4.1f|", id, name, yob, gpa);
    }
    
    public void showProfile() {
        System.out.printf("|%8s|%-25s|%4d|%4.1f|\n", id, name, yob, gpa);
    }//NON-STATIC CHƠI VỚI NON - DĨ NHIÊN CÙNG OBJ VÀ STATIC LUÔN, ĐỒ TIÊNG THÀNH CHUNG
    
    public int getAge() {
        return 2023 - yob;
    }
    
    public static void sayHi() {
        System.out.println("Hi everyone, my name is " + name);
        //System.out.println("By the way, my yob is " + yob);
        //Static chỉ chơi với static vì cùng khu vực
        //có quá trời yob được clone biết lấy ai bỏ ai
    }
    
}
