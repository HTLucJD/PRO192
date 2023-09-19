package basicarray;

public class BasicArray {

    public static void main(String[] args) {
        sortObjectArray();
    }
    

    
    public static void sortObjectArray() {
        Student arr[] = new Student[2];
        arr[0] = new Student("SE123456", "AN NGUYỄN", 2004, 9.0);
        arr[1] = new Student("SE123457", "BÌNH LÊ", 2004, 5.0);

        System.out.println("The student list");
        for (Student x : arr) {
            x.showProfile();
        }
        //CHỐT HẠ: CẤM TUYỆT ĐỐI XÀI > >= < <= == != CHO VIỆC SO SÁNH 2 BIẾN
        //OBJECT, VIFB TOÁN TỬ SO SÁNH TRUYỀN THỐNG CHỈ DÀNH CHO PRIMITIVE
        if (arr[0].getGpa() > arr[1].getGpa()) {
        Student tmp = arr[0];
        arr[0] = arr[1];
        arr[1] = tmp;
        }
        
        System.out.println("After sorting the student list :");
        for (Student x : arr) {
            x.showProfile();
        }
    }
    
    
    public static void playWithObjectArray() {
        Student arr[] = new Student[2];
        arr[0] = new Student("SE123456", "AN NGUYỄN", 2004, 9.0);
        arr[1] = new Student("SE123457", "BÌNH LÊ", 2004, 5.0);

        System.out.println("The student list");
        for (Student x : arr) {
            x.showProfile();
        }
    }

    public static void playWithStudentArray() {
        //lưu hồ sơ 10 bạn SV
        //10 biến/tên tắt + 10 new() tức là value
        //int arr[] = new int[10];
        Student list[] = new Student[10];
        list[0] = new Student("SE123456", "AN NGUYỄN", 2004, 5.6);
        list[1] = new Student("SE123457", "BÌNH LÊ", 2004, 5.7);
        list[2] = new Student("SE123458", "CƯỜNG VÕ", 2000, 5.8);
        System.out.println("The list of student");
        for (int i = 0; i < list.length; i++) {
            list[i].showProfile();

        }
        list[3] = null;//tao trỏ dáy ram, null
        //có value rồi, số 0, tọa độ 0

        //NGUYÊN TẮC KHI CHƠI VỚI MẢNG PHẢI LÀ: BIẾN COUNT ĐỂ CHO BIẾT
        //MẢNG ĐÃ GÁN VALUE ĐẾN ĐÂU, FOR ĐẾN ĐÓ, KHÔNG FOR ĐẾN .LENGTH
        //BỊ DEFAULT VỚI PRIMITIVE, BỊ NULL VỚI MẢNG OBJECT
    }

    public static void playWithStudent() {
        Student x = new Student("SE123456", "AN NGUYỄN", 2004, 5.6);
        x.showProfile();
    }

    public static void playWithPrimitiveArrayV3() {
        int arr1[] = {5, 10, 15, 20};
        int arr3[] = new int[]{5, 10, 15, 20};
        int arr2[] = new int[5];

        int arr[];
        arr = new int[5];
        arr[0] = 5;
        arr[1] = 10;
        arr[2] = 15;

        System.out.println("Array has: " + arr);//convert data của các biến thành mã hexa
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");

        }
    }

    public static void playWithPrimitiveArrayV2() {
        //float* arr = calloc(7, sizeof(float));
        //      point   new Object
        //   reference  new Object
        double arr[] = new double[100];
        //new() là phễu để đúc Object!!!!!!!!!!!!!!!

        arr[0] = 39;
        arr[1] = 79;
        arr[2] = 6868;
        arr[3] = 2204;
        System.out.println("The array has values of (for i)");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        //DÙ LÀ MẢNG PRIMITIVE HAY MẢNG MẸ GÌ CHƯA BIẾT
        //TÊN MẢNG LÀ BIẾN MÁ MÌ, BIẾN OBJECT, BIẾN CON TRỎ, REFERENCE 
        //TAO SẼ TROE VÙNG RAM CHÀ BÁ LỬA NEW, KO ĐÚC TRUYỀN THỐNG  
        //MÀ ĐÚC NHIỀU BIẾN
        //MÁ MÌ CHẤM RA ĐƯỢC SỐ LÍNH
        System.out.println("\n\nThe array has values of (for each)");
        for (double x : arr) {
            System.out.print(x + " ");
        }
    }

    public static void playWithPrimitiveArray() {
        //double vol[365];//Java cấm khai báo kích thước mảng, số phần tử trong []
        //double v[365] = {0, 0, 5, 10, 15, 20, 25};
        float v[] = {0, 0, 5, 10, 15, 20, 25};//mảng có 7 phần tử
        //7 biến float nằm trên HEAP đấy, có new ngầm đấy, có malloc() đấy
        System.out.println("The array has values of (printed by individual): ");
        System.out.println(v[0] + "; " + v[1] + "; " + v[2]);
        v[0] = 6868;
        for (int i = 0; i < 7; i++) {
            System.out.print(v[i] + " ");
        }
        System.out.println("\nThe array v has values of (using each): ");

        for (float x : v) {
            //x = v[0]; x = v[1]; x = v[2]; ...
            System.out.print(x + " ");
        }
    }

}
