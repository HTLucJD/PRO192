/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package standardized;

/**
 *
 * @author ACER
 */
public class Standardized {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String input = "   Huynh    tAN  luC    ";
        System.out.println(standardized(input));
    }
    
    public static String standardized(String input) {
        input = input.trim();
        String[] words = input.split("\\s+");
        for (int i = 0; i < words.length; i++) {
            words[i] = words[i].toLowerCase();
            String firstChar = words[i].substring(0, 1);
            firstChar = firstChar.toUpperCase();
            words[i] = firstChar + words[i].substring(1);
        }
        return String.join(" ", words);
    }
    
}
