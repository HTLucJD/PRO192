/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sweepstake;

import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author ACER
 */
public class SweepStake {

    Set<String> prizeBallotBox = new HashSet<String>();

    public SweepStake() {
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SweepStake ss = new SweepStake();
        int choice = 0;
        do {
            System.out.println("=======================================");
            System.out.println("MENU:");
            System.out.println("1. Add bonus code.");
            System.out.println("2. Delete bonus code.");
            System.out.println("3. Check to the prize code exists or not.");
            System.out.println("4. Delete all the prize code.");
            System.out.println("5. The number of the prize vote.");
            System.out.println("6. Prize drawing.");
            System.out.println("0. Quit");
            System.out.print("Input your choice: ");
            choice = Integer.parseInt(sc.nextLine());
            System.out.println("Input the prize code: ");
            String value = sc.nextLine();
            switch (choice) {
                case 1:
                    ss.addBollet(value);
                    break;
                case 2:
                    ss.deleteBollet(value);
                    break;
                case 3:
                    System.out.println("Result of checking: "+ss.checkBollet(value));  
                    break;
                case 4:
                    ss.deleteAllBollet();
                    break;
                case 5:
                    System.out.println("The number of bollet: " + ss.numberBollet());
                    break;
                case 6:
                    System.out.println("The winning code is "+ss.withdraw1Vote());
                    break;
                case 0:
                    System.out.println("Bye bye!!!");
                    break;
                default:
                    throw new AssertionError();
            }
        } while (choice != 0);
    }

    public boolean addBollet(String value) {
        return this.prizeBallotBox.add(value);
    }

    public boolean deleteBollet(String value) {
        return this.prizeBallotBox.remove(value);
    }

    public boolean checkBollet(String value) {
        return this.prizeBallotBox.contains(value);
    }

    public void deleteAllBollet() {
        this.prizeBallotBox.clear();
    }

    public String withdraw1Vote() {
        String result = "";
        Random rand = new Random();
        int index = rand.nextInt(this.prizeBallotBox.size());
        result = (String) this.prizeBallotBox.toArray()[index];
        return result;
    }

    public int numberBollet() {
        return this.prizeBallotBox.size();
    }
}
