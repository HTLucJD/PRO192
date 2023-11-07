/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sumdigitstring;

/**
 *
 * @author ACER
 */
public class SumDigitString {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String str1 = "English 80 Math 83 History 70";
        int sum = 0, count = 0;
        String[] parts = str1.split(" ");
        //Duyệt qua từng phần và chuyển sang kiểu số nếu có thể
        for (String pt : parts) {
            System.out.println(pt);
            try {
                int num = Integer.parseInt(pt);
                sum += num;
                count++;
            } catch (NumberFormatException e) {
            //  chỉ đơn giản không làm gì cả 
            }
        }   
        System.out.println("The sum of the numbers in the String: "+sum);
        System.out.println("The average of the numbers in the String: "+(double)sum/count);
    }
    
}
    