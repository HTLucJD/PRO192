/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package countword;

/**
 *
 * @author ACER
 */
public class CountWord {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String s = "toi cham hoc toi chiu kho toi pass mon";
        String[] words = s.split(" ");
        int count = 0;
        for (String i : words) {
            if (i.equals("toi")) {
                count++;
            }
        }
        System.out.println("There are " + count + " appearances");
    }

}
