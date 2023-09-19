
package ws2;

import data.Book;


public class WS2 {

  
    public static void main(String[] args) {
        Book gameOn = new Book(" Leaders Press", "English", 164);
        Book power = new Book("Harper Business", "English", 288);
        
        gameOn.print();
        power.print();
        System.out.println("Game On after change into language: ");
        gameOn.setLanguage("VietNamese");
        gameOn.print();
    }
    
}
