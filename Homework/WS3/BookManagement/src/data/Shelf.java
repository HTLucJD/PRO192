package data;

import java.util.Scanner;

public class Shelf {

    private String color;
    private String label;

    private Book list[] = new Book[200];
    private Scanner sc = new Scanner(System.in);
    private int count = 0;

    public Shelf(String color, String label) {
        this.color = color;
        this.label = label;
    }
  
    public void inputABook() {
        String name, language;
        int paperback;
        do {
            try {
                System.out.println("Input book# " + (count + 1) + "/" + list.length);
                System.out.print("Input name: ");
                name = sc.nextLine();
                System.out.print("Input language: ");
                language = sc.nextLine();
                System.out.print("Input paperback: ");
                paperback = Integer.parseInt(sc.nextLine());
                list[count] = new Book(name, language, paperback);
                count++;
                break;
            } catch (Exception e) {
                System.out.println("Input again");
            }
        } while (true);
    }
    
    public void printBookList() {
        System.out.println("The list book: ");
        for (int i = 0; i < count; i++) {
            list[i].showBook();
        }
    }
}
