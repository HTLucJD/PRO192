/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package containname;

import java.util.Scanner;

/**
 *
 * @author ACER
 */
public class ContainName {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input student number: ");
        int n = Integer.parseInt(sc.nextLine());
        System.out.println("Input student list: ");
        String[] names = new String[100];
        for (int i = 0; i < n; i++) {
            System.out.printf("Student %d:", i+1);
            names[i] = sc.nextLine();
        }
        System.out.print("Input name student identify: ");
        String student = sc.nextLine();
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (student.compareTo(names[i])==0) {
                count++;
                System.out.println("Yes");
                break;
            }
        }
        if (count == 0)
            System.out.println("No");
    }
}
