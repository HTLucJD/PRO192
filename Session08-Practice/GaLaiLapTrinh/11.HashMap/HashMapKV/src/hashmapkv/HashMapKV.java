/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hashmapkv;

import java.util.HashMap;

/**
 *
 * @author ACER
 */
public class HashMapKV {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //1.Khai báo
        HashMap<Integer, String> map = new HashMap<>();
        HashMap<Float, Integer> map2 = new HashMap<>();

        //2.Thêm các phần tử vào HashMap
        map.put(1, "One");
        map.put(2, "Two");

        //3. Lấy giá trị của một phần tử
        String value = map.get(1);
        String value2 = map.get(2);
        System.out.println(value);
        System.out.println(value2);

        //4.Xóa ohaanf tử khỏi hashmap
        map.remove(1);
        System.out.println(map.get(1));

        //5. Kiểm tra xem 1 phần tử có tồn tại trong map này không
        boolean check = map.containsKey(1);
        System.out.println(check);

        //6. Kiểm tra xem một giá trị có tồn tại trong map hay không
        boolean checkV = map.containsValue("Two");
        System.out.println(checkV);

        //7. Kiểm tra xem hashmap có rỗng hay không
        boolean Empty = map.isEmpty();
        System.out.println(Empty);

        //8. Lấy số lượng phần tử trong mảng
        int numberKey = map.size();
        System.out.println(numberKey);

        //9 Duyệt hashmap
        for (Integer key : map.keySet()) {
            String vl = map.get(key);
            System.out.println(key + " : " + vl);
        }
    }

}
