/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ws1;

/**
 *
 * @author ACER
 */
public class WS1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        boolean result = isPrime(0);
        System.out.println("0: " + result);
        isPrimeList();
    }
    
    public static void isPrimeList() {
            System.out.println("The list primes from 1..1000");
            for (int i = 1; i <= 1000; i++) 
                if (isPrime(i) == true)
                    System.out.print(i + " ");
    }
    
    public static boolean isPrime(int n){
        if (n <2)
            return false;
        if (n == 2)
            return  true;
        for (int i = 2; i < Math.sqrt(n); i++) 
            if (n % i == 0)
                return false;
        return true;
    }
    
}
