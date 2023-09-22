package menu;

import java.util.Scanner;

/**
 *
 * @author ACER
 */
public class Menu {

    public static void main(String[] args) {
        int choice;
        do {
            System.out.println("|--------------------------------|");
            System.out.println("|    WELCOME TO MENU OF LUC      |");
            System.out.println("|   Choose 1: Compute operator:  |");
            System.out.println("|   Choose 2: Print your name:   |");
            System.out.println("|   Choose 3: Find student:      |");
            System.out.println("|   Choose 4: Exit!!!            |");
            System.out.println("|--------------------------------|");
            Scanner sc = new Scanner(System.in);
            System.out.println("Input choice: ");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    choice1();
                    break;
                case 2:
                    choice2();
                    break;
                case 3:
                    choice3();
                    break;
                case 4:
                    System.out.println("Bye bye. See you next time!!!");
                    break;
            }
        } while (choice != 4);
    }

    public static void choice1() {
        Scanner sc = new Scanner(System.in);
        int a, b;
        System.out.println("Input  a, b: ");
        a = sc.nextInt();
        b = sc.nextInt();
        System.out.println("Input choice: ");
        char choice = sc.next().charAt(0);
        switch (choice) {
            case '+':
                System.out.println("a + b = " + (a + b));
                break;
            case '-':
                System.out.println("a - b = " + (a - b));
                break;
            case '*':
                System.out.println("a * b = " + a * b);
                break;
            case '/':
                System.out.println("a / b = " + a / b);
                break;
        }
    }

    public static void choice2() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input your name: ");
        String name = sc.nextLine();
        System.out.println("Your name is: " + name);
        int attend, midterm, finals;
        System.out.println("Input your attendance: ");
        attend = sc.nextInt();
        System.out.println("Input your midterm score: ");
        midterm = sc.nextInt();
        System.out.println("Input your final score: ");
        finals = sc.nextInt();
        double cs = (attend * 0.2 + midterm * 0.3 + finals * 0.5);
        System.out.println("Your course score is: " + cs);
    }

    public static void choice3() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input student number: ");
        int n = Integer.parseInt(sc.nextLine());
        System.out.println("Input student list: ");
        String[] names = new String[100];
        for (int i = 0; i < n; i++) {
            System.out.printf("Student %d:", i + 1);
            names[i] = sc.nextLine();
        }
        System.out.print("Input name student identify: ");
        String student = sc.nextLine();
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (student.compareTo(names[i]) == 0) {
                count++;
                System.out.println("Yes");
                break;
            }
        }
        if (count == 0) {
            System.out.println("No");
        }
    }
}
