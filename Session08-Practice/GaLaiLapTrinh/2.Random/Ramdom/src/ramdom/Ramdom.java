/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ramdom;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

/**
 *
 * @author ACER
 */
public class Ramdom {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int i = ThreadLocalRandom.current().nextInt(-50, 51);
        System.out.println(i);
    }
    
}
