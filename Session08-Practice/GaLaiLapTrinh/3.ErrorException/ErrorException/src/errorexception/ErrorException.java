/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package errorexception;

/**
 *
 * @author ACER
 */
public class ErrorException {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            int c = 2/0;
            System.out.println("c = " + c);
        } catch (Exception e) {
            System.out.println("Có lỗi rồi!!!");
            e.printStackTrace();
        }
        
    }
    
}
